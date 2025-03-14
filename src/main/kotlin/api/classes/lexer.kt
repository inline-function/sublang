package api.classes

import api.classes.Lexer.Stater
import api.tools.*
import api.data.*
import api.data.TokenType.*

/**
 * 词法分析仪
 * Lexer
 * @property input 输入字符串
 * @constructor 创建词法分析仪实例
 * @author Redemption
 */
class Lexer(
    val input: String
) {
    /**
     * 获取输入字符串，并在其末尾添加一个空格
     * Get the input string and append a space at the end
     * @return 处理后的字符串
     * @return Processed string
     */
    val text get() = "$input "

    /**
     * 状态跳转器
     * State transition handler
     * @property it 当前字符
     * @property text 累加文本
     * @property lineAndRow 行列信息
     * @constructor 创建状态跳转器实例
     * @author Redemption
     */
    class Stater(
        // 当前字符
        // Current character
        val it: Char,
        // 累加文本
        // Accumulated text
        val text: String,
        // 行列信息
        // Line and row information
        val lineAndRow: String
    ) {
        /**
         * 跳转条件以及跳转处
         * Transition conditions and destinations
         */
        val m = mutableMapOf<() -> Boolean, Int>()

        /**
         * 终止
         * End
         */
        var end: (() -> TokenType)? = null

        /**
         * 从堆栈中获取的行
         * Lines obtained from the stack
         */
        val lines = mutableMapOf<() -> Boolean, String>()

        /**
         * 条件跳转
         * Conditional transition
         * @param at 条件函数
         * @param at Condition function
         */
        operator fun Int.invoke(at: () -> Boolean) {
            m[at] = this
            lines[at] = Exception().stackTrace[1].run {
                "($fileName:$lineNumber)"
            }
        }

        /**
         * 终止
         * End
         * @param r 返回标记类型的函数
         * @param r Function returning a token type
         */
        fun end(r: () -> TokenType) {
            end = r
        }
    }

    /**
     * 状态函数集合
     * Collection of state functions
     */
    val functions = mutableMapOf<Int, Stater.() -> Unit>()

    /**
     * 空白处理函数
     * Whitespace handling function
     */
    lateinit var ws: (Char) -> Boolean

    /**
     * 当前行号
     * Current line number
     */
    var line = 1

    /**
     * 当前列号
     * Current column number
     */
    var row = 0

    /**
     * 使用行
     * Lines used
     */
    val lines = mutableMapOf<Stater.() -> Unit, String>()

    /**
     * 报错
     * None reporting
     * @throws Exception 抛出异常
     * @throws Exception Throws exception
     */
    fun String.err(): Nothing {
        throw Exception("词法分析错误($line:$row):$this")
    }

    /**
     * 定义状态函数
     * Define state function
     * @param func 状态函数
     * @param func State function
     */
    operator fun Int.invoke(func: Stater.() -> Unit) {
        functions[this] = func
        lines[func] = Exception().stackTrace[1].run {
            "($fileName:$lineNumber)"
        }
    }

    /**
     * 空白处理
     * Whitespace handling
     * @param code 判断字符是否为空白的函数
     * @param code Function to determine if a character is whitespace
     */
    fun ws(code: (Char) -> Boolean) {
        ws = code
    }

    /**
     * 直接终止的状态函数
     * Directly terminating state function
     * @param type 标记类型
     * @param type Token type
     */
    operator fun Int.invoke(type: TokenType) {
        this {
            end {
                type
            }
        }
    }
    /**
     * 开始分析
     * Start analysis
     * @return 标记列表
     * @return List of tokens
     */
    val Boolean.tokens : List<Token>
        get() {
            val tokens = mutableListOf<Token>()  // 已获取的标记
            var index = 0   // 当前字符索引
            var str = ""    // 累加文本
            line = 1   // 行
            row = 0    // 列
            var now : Char? = try {
                text[index]
            } catch (_ : Throwable) {
                null
            }  // 当前字符
            // 跳过空白
            lateinit var nextOfWs : ()->Unit
            nextOfWs = {
                index++
                now = try {
                    text[index]
                } catch (_ : Throwable) {
                    null
                }
                row++
                if (now == '\n') {
                    line++
                    row = 1
                }
                if (ws(now ?: '1')) {
                    nextOfWs()
                }
            }
            // 开始函数
            var f = functions[0]!!
            // 上一个状态函数
            var justNow = 0
            // 下一个函数
            val next = {
                index++
                now = try {
                    text[index]
                } catch (_ : Throwable) {
                    null
                }
                row++
                if (now == '\n') {
                    line++
                    row = 1
                }
                now?.apply<Any> {
                    str += text[index - 1]
                }
                if (ws(now ?: '$')) {
                    if (str.isNotEmpty()) {
                        if (str.length == 1 && ws(str[0])) {
                            str = ""
                        } else {
                            if (this) {
                                "遭遇符合空白状态函数跳转条件的字符,表明当前标记结束".print("词法分析日志")
                            }
                            val stater = Stater(' ',str,"($line,$row)")
                            stater.f()
                            stater.end ?: throw Exception("词法分析错误:状态'$justNow'没有定义结尾状态函数[$line,$row]${lines[f]}")
                            if (this) {
                                "填入标记->$str<${stater.end!!()}>($line,$row)".print("词法分析日志")
                            }
                            tokens.add(Token(line,row,stater.end!!(),str))
                            str = ""
                        }
                    }
                    nextOfWs()
                }
            }
            while (index < text.length) {
                if (this) {
                    "$str ; $now ($index:$line,$row)".print("词法分析日志")
                }
                // 状态器
                val stater = Stater(now ?: ' ',str,"($line,$row)")
                // 初始化状态器
                stater.f()
                // 如果字符是空就调用结束函数
                if (now == null) {
                    if (this) {
                        "在文件末尾,表明当前标记结束".print("词法分析日志")
                    }
                    stater.end ?: throw Exception("词法分析错误:状态'$justNow'没有定义结尾状态函数[$line,$row]${lines[f]}")
                    if (this) {
                        "填入标记->$str<${stater.end!!()}>($line,$row)".print("词法分析日志")
                    }
                    tokens.add(Token(line,row,stater.end!!(),str))
                    str = ""
                    f = functions[0]!!
                    justNow = 0
                } else {
                    // 跳转函数
                    var e : (()->Unit)? = {
                        if (str.isNotEmpty()) {
                            if (this) {
                                "对于状态'$justNow'的所有跳转条件均不匹配,表明当前标记结束".print("词法分析日志")
                            }
                            stater.end ?: throw Exception("词法分析错误:状态'$justNow'没有定义结尾状态函数[$line,$row]${lines[f]}")
                            if (this) {
                                "填入标记->$str<${stater.end!!()}>($line,$row)".print("词法分析日志")
                            }
                            tokens.add(Token(line,row,stater.end!!(),str))
                            str = ""
                        }
                        f = functions[0]!!
                        justNow = 0
                    }
                    // 不是空就查找哪个条件是真
                    stater.m.keys.forEach {
                        if (e != null) {
                            // 真则赋值下个状态函数为条件对应的状态函数
                            if (it()) {
                                if (this@tokens) {
                                    "从状态'${justNow}'跳转至'${stater.m[it]!!}'".print("词法分析日志")
                                }
                                if (!functions.containsKey(stater.m[it]!!)) {
                                    throw Exception("词法分析错误:${"状态函数'${justNow}'的下一个跳转状态'${stater.m[it]!!}'未定义[$line,$row]${stater.lines[it]}"}")
                                }
                                justNow = stater.m[it]!!
                                f = functions[stater.m[it]!!]!!
                                next()
                                e = null
                            }
                        }
                    }
                    // 都不匹配则使用end函数
                    e?.invoke()
                }
            }
            if (this@tokens) {
                "分析临近尾声,结束状态'$justNow'为最后一个标记".print("词法分析日志")
            }
            val stater = Stater(' ',str,"($line,$row)")
            stater.f()
            stater.end ?: throw Exception("词法分析错误:状态'$justNow'没有定义结尾状态函数[$line,$row]${lines[f]}")
            if (str.isEmpty() || ws(str[0])) {
                if (this@tokens) {
                    "但是本词法分析器发现最后一个标记是空的,因此帮你丢了,快说:'谢谢词法分析器'(～￣▽￣)～".print("词法分析日志")
                }
            } else {
                if (this@tokens) {
                    "填入标记->${str + text.last()}<${stater.end!!()}>($line,$row)".print("词法分析日志")
                }
                tokens.add(Token(line,row,stater.end!!(),str + text.last()))
            }
            tokens.add(Token(line,row,FaceValue.EOF,""))
            return tokens
        }
}

/**
 * 获取词法分析函数
 * Get the lexer function
 * @param show 是否显示词法分析日志
 * @param show Whether to show lexer logs
 * @param code 词法分析器配置函数
 * @param code Lexer configuration function
 * @return 标记列表
 * @return List of tokens
 */
fun String.lexing(show: Boolean = false, code: Lexer.() -> Unit): List<Token> = Lexer(this).run {
    code()
    show.tokens
}
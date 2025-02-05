package api.rule

import api.data.Token
import api.data.TokenType.*
import api.data.TokenType.Symbol.*
import api.classes.lexing
import java.util.*

//获取这个字符串的标记组
val String.tokens: List<Token> get() = lexing(true) {
    ws{it in " \t\n\r"}
    //初始状态
    0{
        //是数字则进入数字状态
        10{it in "1234567890"}
        //是单符号则进入符号状态
        20{it in "(){}[]?_$@#,.;:\\~`"}
        401{it in "\""}
        600{it == '\''}
        //是多符号进入多符状态
        301{it == '='}
        311{it == '+'}
        321{it == '-'}
        331{it == '*'}
        341{it == '/'}
        351{it == '%'}
        361{it == '^'}
        371{it == '<'}
        381{it == '>'}
        //其他进入关键词或者标识符状态
        500{it !in "1234567890(){}[]?_\$@#,.;:\\~`\"\'=+-/*%^<>" }
    }
    //字符状态
    600{
        //如果是字符结尾,报错
        if(it == '\''){
            throw Exception("词法分析错误:字符有且仅有一个字$lineAndRow")
        }
        //是反斜杠
        610{it == '\\'}
        //是正常字符
        620{it != '\\'}
    }
    //正常字符
    620{
        630{it == '\''}
        end { throw Exception("词法分析错误:字符串有且仅有一个字$lineAndRow") }
    }
    //字符的反斜杠
    610{
        630{it in "\"\'\\ntrfb"}
        end { throw Exception("词法分析错误:没有这个转义符'$it'$lineAndRow") }
    }
    //字符结束
    630(FaceValue.CHAR)
    //标识符状态
    500{
        //不是符号则循环
        500{it !in "(){}[]?_\$@#,.;:\\~`\"\'=+-/*%^<>"}
        end{
            var k : KeyWord? = null
            KeyWord.entries.forEach {
                if(it.toString().lowercase(Locale.getDefault()) == text){
                    k = it
                }
            }
            k ?: FaceValue.ID
        }
    }
    //字符串状态
    401{
        //是双引号则结束
        403{it == '"'}
        //如果没有任何问题,继续拼接
        401{ it != '\"' && it != '\\' }
        //如果是反斜杠,进入反斜杠状态
        404{it == '\\'}
    }
    //字符串结尾
    403(FaceValue.STR)
    //字符串反斜杠
    404{
        401{it in "\"\'\\ntrfb"}
        end { "没有这个转义符'$it'$lineAndRow".err() }
    }
    //数字状态
    10{
        //仍是数字则循环
        10{it in "1234567890"}
        //是点进入小数状态
        11{it == '.'}
        //否则结尾标记
        end { FaceValue.INT }
    }
    //小数状态
    11{
        //仍是数字则循环
        11{it in "1234567890"}
        //否则结尾标记
        end { FaceValue.DEC }
    }
    //符号状态
    20{
        end{
            val list = mutableListOf<Symbol>()
            list.addAll(Other.entries.toTypedArray())
            list.addAll(Bracket.entries.toTypedArray())
            list.find {it1-> it1.text == text }!!
        }
    }
    //单等状态
    301{
        32{it == '='}
        end { Assign.ASSIGN }
    }
    //双等状态
    302{
        33{it == '='}
        end { Operator.EQUAL }
    }
    //三等状态
    303(Operator.STR_EQUAL)
    //加号状态
    311{
        312{it == '='}
        end { Operator.PLUS }
    }
    //加赋状态
    312(Assign.PLUS_ASSIGN)
    //减号状态
    321{
        322{it == '='}
        323{it == '>'}
        end { Operator.MINUS }
    }
    //减赋状态
    322(Assign.MINUS_ASSIGN)
    //箭头状态
    323(Other.ARROW)
    //乘号状态
    331{
        332{it == '='}
        end { Operator.MUL }
    }
    //乘赋状态
    332(Assign.MUL_ASSIGN)
    //除号状态
    341{
        342{it == '='}
        end { Operator.DIV }
    }
    //除赋状态
    342(Assign.DIV_ASSIGN)
    //取余状态
    351{
        352{it == '='}
        end { Operator.MOD }
    }
    //余赋状态
    352(Assign.MOD_ASSIGN)
    //幂状态
    361{
        362{it == '='}
        end { Operator.POW }
    }
    //幂赋状态
    362(Assign.POW_ASSIGN)
    //小于状态
    371{
        372{it == '='}
        end { Bracket.LANGLE }
    }
    //小于等于状态
    372(Operator.LESS_EQUAL)
    //大于状态
    381{
        382{it == '='}
        end { Bracket.RANGLE }
    }
    //大于等于状态
    382(Operator.GREATER_EQUAL)
}

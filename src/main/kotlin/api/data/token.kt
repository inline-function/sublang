package api.data


//标记类型
sealed interface TokenType{
    //字面量
    enum class FaceValue : TokenType{
        ID,           //标识符
        INT,          //整数
        DEC,          //小数
        STR,          //字符串
        CHAR,         //字符
        EOF;          //文件结束符
    }
    //关键词
    enum class KeyWord : TokenType{
        IF,           //如果
        ELSE,         //否则
        TRUE,         //真
        FALSE         //假
    }
    //标点符号
    sealed interface Symbol : TokenType{
        //符号文本
        val text : String
        //括号系
        enum class Bracket(
            override val text : String
        ) : Symbol{
            LBRACE("{"),      //左花括号  {
            RBRACE("}"),      //右花括号  }
            LPAREN("("),      //左圆括号  (
            RPAREN(")"),      //右圆括号  )
            LBRACKET("["),    //左方括号  [
            RBRACKET("]"),    //右方括号  ]
            LANGLE("<"),      //左尖括号  <
            RANGLE(">"),      //右尖括号  >
        }
        //赋值系
        enum class Assign(
            override val text : String
        ) : Symbol{
            ASSIGN("="),      //赋值     =
            PLUS_ASSIGN("+="), //加赋值   +=
            MINUS_ASSIGN("-="),//减赋值   -=
            MUL_ASSIGN("*="), //乘赋值   *=
            DIV_ASSIGN("/="),//除赋值   /=
            MOD_ASSIGN("%="),  //模赋值   %=
            POW_ASSIGN("^="),  //幂赋值   ^=
        }
        //运算符系
        enum class Operator(
            override val text : String
        ) : Symbol{
            PLUS("+"),        //加      +
            MINUS("-"),       //减      -
            MUL("*"),        //乘      *
            DIV("/"),       //除      /
            MOD("%"),         //模      %
            POW("^"),         //幂      ^
            AND("&"),         //且      &
            OR("|"),          //或      |
            NOT_EQUAL("!="),   //不等于   !=
            EQUAL("=="),       //等于     ==
            STR_EQUAL("==="),   //全等     ===
            LESS_EQUAL("<="),  //小于等于  <=
            GREATER_EQUAL(">="),//大于等于 >=
        }
        //其他
        enum class Other(
            override val text : String
        ) : Symbol{
            DOT("."),         //点     .
            COMMA(","),       //逗号    ,
            SEMICOLON(";"),   //分号    ;
            COLON(":"),       //冒号    :
            DOLLAR("$"),      //美元符   $
            AT("@"),          //艾特符   @
            HASH("#"),        //井号    #
            BACKSLASH("\\"),  //反斜杠   \
            DQUOTE("\""),     //双引号   "
            SQUOTE("\'"),     //单引号   '
            BACKTICK("`"),    //反引号   `
            UNDERLINE("_"),   //下划线   _
            EXCLAMATION("!"), //感叹号   !
            QUESTION("?"),    //问号     ?
            PERCENT("%"),     //百分号   %
            TILDE("~"),       //波浪符   ~
            ARROW("->"),      //箭头     ->
        }
    }
}
//标记
data class Token(
    //行
    val line : Int,
    //列
    val row : Int,
    //标记类型
    val type : TokenType,
    //标记文本
    val text : String
)
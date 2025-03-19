grammar Sub;
//词法
WS : [ \t\r\n]+ -> skip ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING : '"' (ESC | ~["\\])* '"'
       | '\'' (ESC | ~['\\])* '\'';
IF :   '如果';//条件通过
ELSE:  '否则';//条件全部否决
FUN :  '函数';//描述一段可运行程序
TRAIT :'功能';//描述一组抽象成员
VAR :  '动量';//可以赋值多次的量
VAL :  '变量';//只能赋值一次的量
CONT : '常量';//编译期确定的全局不变量
COV :  '协变';//a为b子类型则T<a>为T<b>子类型
CON :  '逆变';//a为b子类型则T<b>为T<a>子类型
IS :   '是'; //表达式匹配
OF :   '为'; //类型匹配
AT :   '当'; //条件匹配
ENMTY : '_'; //占位符
ARROW : '=>';
ID : [\p{L}_$][\p{L}\p{Nd}_$]*
   | [!#%&*+/\-:<=>?@\\^|~]+ ;
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
//语法
root : topStmt+ EOF | EOF;
name : ID ('.' ID)*;
annotation : '@' name ('[' ID ']'|'(' expr ')')?;
stmt : topStmt | expr;
topStmt : function | variable | trait ;
parameter : annotation* (VAR|VAL|CONT)? ID ':' type ('=' expr)?;
parameters : parameter (',' parameter)*;
block : '{' stmt* '}';
receiver : (type '.' ID) | ID;
function : annotation* FUN receiver gen? ('(' parameters? ')')? (':' type)? block?;
type : (ID generic?) | ('(' type ',' type (',' type)* ')') | ('(' type (',' type)* ')' ARROW type) | ('(' type ')');
expr : (NUMBER | STRING | name | if | when | lambda | destructuring | '(' expr ')') invoke?;
//gen是泛型声明,generic是泛型指定
gen : '[' (CON|COV)? ID (':' type)? ('=' type)? (',' (CON|COV)? ID (':' type)? ('=' type)?)* ']';
generic : '[' ((type|ENMTY) (',' (type|ENMTY))*|(ID '=' (type|ENMTY) (',' ID '=' (type|ENMTY))*)) ']';
//不允许无圆括号调用,拥有类型参数或尾随匿名函数除外
invoke :((generic | generic kotlinLambda | kotlinLambda) invoke?) |
        (generic? ('('
             (
                (expr (',' expr)*)|
                (ID '=' expr (',' ID '=' expr)*)
             )?
        ')') kotlinLambda? invoke?);
if : IF expr block (ELSE block)?;
case : exprCase | elseCase | typeCase | boolCase;
when : IF expr? '{' case* '}';
exprOrBlock : expr | block;
exprCase : IS (expr (',' expr)*) '->' exprOrBlock;
elseCase : ELSE '->' exprOrBlock;
typeCase : OF type '->' exprOrBlock;
boolCase : AT expr '->' exprOrBlock;
javaLambda : '(' parameters? ')' '=>' block;  //(a:Int,b:Dec)=>{a+b}
kotlinLambda : '{' parameters? '=>' stmt* '}'; //{a:Int,b:Dec=>a+b}
lambda : javaLambda | kotlinLambda;
variable : annotation* (VAR | VAL | CONT) gen? receiver (':' type)? ('=' expr)?;
destructuring : annotation* (VAR | VAL | CONT) (receiver (',' receiver)*) (':' type)? ('=' expr)?;
trait : annotation* TRAIT ID gen? (':' type)? '{' (variable | function)* '}';



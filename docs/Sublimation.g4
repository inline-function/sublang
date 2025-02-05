grammar Sublimation;
//词法
WS : [ \t\r]+ -> skip ;
KG : [\n]+;
ID : ([\p{L}_]|SIGN)([\p{L}\p{N}_]|SIGN)* ;
STRING : ('"'|'\'') (ESC | ~["\\])* ('"'|'\'') ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
ARROW : '->' ;
fragment SIGN : '+'|'-'|'*'|'/'|'|'|'&'|'%'|'!';
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
//语法
root : EOF | (top KG?)+ EOF;
top : data | struct;
name : ID ('.' ID)*?;
data : anns ID '=' KG? expr
     | anns ID ':' type ('=' KG? expr)?;
type : ID ('.' ID)? ('<'KG? type (KG? ',' KG? type)* KG? '>')? //只有正常类型支持泛型
     | '(' (KG? type (KG? ',' KG? type)*)? KG? ')' ARROW type //函数类型
     | '(' KG? type KG? ',' KG? type (KG? ',' KG? type)* KG? ')' //元组类型至少两个元素
     | '(' KG? type KG? ')'; //类型因子
struct : anns ID ('<' type (',' type)* '>')? '[' KG? data (KG? ',' KG? data)* KG? ']';
ann : '@' name ('(' KG? (STRING|NUMBER|name) KG? ')')?;
anns : (KG? ann KG?)*;
expr : expr__
     | prefixInvoke;
expr__ : '(' KG? expr KG? ')'
       | STRING expr_
       | NUMBER expr_
       | lambda expr_
       | invoke expr_
       | name expr_;
invoke : name ('<' type (',' type)* '>')? '(' KG? (KG? expr (KG? ',' KG? expr)*)? KG? ')';
prefixInvoke : name expr;
expr_ : infixInvoke | ();
infixInvoke : name expr expr_;
lambda : '>' KG? (data (KG? ',' KG? data KG?)* KG? '>')? KG? block KG? '~'
       | '>'(KG? anns KG? name (KG?','KG? anns KG? name)* KG?'>')? KG? block KG? '~';
block : (stmt KG?)*;
stmt : data
     | invoke
     | expr infixInvoke
     | prefixInvoke;

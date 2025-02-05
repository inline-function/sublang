### if函数
```
if(bool)>
    //then
~else>
    //else
~
```
### when函数
```
when(value)>
    (it == 1)> print "value is 1" ~
    (it == 2)> print "value is 2" ~
    else> print "value is not 1 or 2" ~
~
```
### 数据
```
name = value
name : type
name : type = value
```
### 匿名函数
```
say => print "cnm" ~
add =>a:Int,b:Int> a + b ~
```
### 元组别名
```
Dog[name:Str]
```
### 泛型
```
Value<TYPE>[value:TYPE]
```
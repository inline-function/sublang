# 凝华编程语言
### 语言纹理
凝华语言具有如下特性:
+ 高封装性的api
+ 精致的函数式编程
+ 受到故意约束的OOP能力
+ 低下限和高上限并存
+ 借用了JVM强大的跨平台能力
### 语言语法
> 注释
```
//单行注释
/*
多行
注释
*/
/*
 * 作者:Redemption
 * 描述:文档化注释
 */
```
> if语句
```
//柯里化函数if语句
?(bool)(>
    print("条件为真")
~)(>
    print("条件为假")
~)
//非柯里化函数if语句
?(
    expr = bool,
    then =>
        print("条件为真")
    ~,
    else =>
        print("条件为假")
    ~
)
//if语法糖
if(bool)
    print("条件为真")
else
    print("条件为假")
end
```
> 声明一个数据(data):
```
//数据名 = 值
name = value
```
数据的值默认不可变,这时候它也可以叫常量(final variable),添加@Mutable使其可变,这时候我们也可以叫它为变量(variable)
```
//声明变量mut
@mutable mut = 1
//赋值mut
mut = 2
```
数据也可暂时不赋值,但是必须显式声明类型,因为本语言是强静态类型语言
```
@mutable name : Int
```
> 声明一个函数
```
//通过数据+匿名函数实现类似函数的功能
function =>
    println("函数被调用")
~
//函数语法糖,等效于上面
fun function2()
    println("函数被调用")
end
```
带有参数和返回值是这样:
```
add =>
    a : Int,
    b : Int
>
    return a + b
~
//语法糖
fun add(a : Int,b : Int)
    return a + b
end
```
注意,本语言没有具名函数,只有匿名函数,本语言的>~是lambda表达式,因此实际上=>~是=和>~的结合体
> 声明一个结构体
```
Pet(name : Str)
```
通过扩展成员注解@of来声明方法(与类型关联的函数)
```
@of(Pet) sayName => println(name) ~
//语法糖
fun Pet.sayName()
    print(name)
end
```
当然也有class语法糖,等价于上面的代码
```
//类名后的括号也是语法糖,这里只需要知道是省去写构造函数的麻烦就可以了
class Pet(name : Str)
    fun sayName()
        print(name)
    end
end
```
创建一个Pet实例
```
pet = Pet("wang cai")
```
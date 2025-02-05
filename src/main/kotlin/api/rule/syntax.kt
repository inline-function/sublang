@file:Suppress("RedundantLambdaOrAnonymousFunction")

package api.rule
/*
//别名
typealias Mlist<T> = MutableList<T>
//从标记集构建语法树
val List<Token>.ast : (String)->FileNode
    get() = {
    parse (true) {
        //root = EOF | top+ EOF
        root{
            now isOf EOF finishWith {
                //如果第一个就是结束符则返回一个没有成员的空文件节点
                FileNode(it)
            }{
                //返回没有成员的空文件节点
                FileNode(it,"top+"())
            }
        }
        //top+ = top top+ | []
        "top+"{
            //如果
        }
        //top = data | struct
        "top"{
            //是否以ID开头
            now match ID
            //如果是:或者=则下降到data,如果是(则下降到struct
            when(now.type){
                COLON,ASSIGN -> {}
                LPAREN -> {}
                else ->
            }
            null!!
        }
        //data = ID COLON type | ID ASSIGN expr | ID COLON type ASSIGN expr
        "data"{
            //
        }
    }
}*/
//从标记集构建语法树
package api.tools

//转换缩进为大括号
fun String.bracesStyle(retract : Int = 4) = "$this\n".split("\n")
    .run {
        val ints = map {
            fun start(index : Int = 0) : Int = if(it.isNotEmpty() && it[index] == ' ')
                start(index + 1) + 1 else 0
            start()
        } + 0
        drop(1).foldIndexed(this[0]){index,acc,it->
            acc+(
                    if(ints[index] < ints[index+1]) "{" else " "
                )+(
                    if(ints[index] > ints[index+1])
                        "}" * ((ints[index]-ints[index+1]) / retract)
                    else ""
                  )+it.drop(ints[index+1])
        }
    }
import api.classes.Checker.Env
import api.data.AnnTree
import api.data.ExprNode.FaceValueNode.BoolValueNode
import api.data.ExprNode.FaceValueNode.NullValueNode
import api.data.ExprTree.*
import api.data.ExprTree.FaceValueTree.*
import api.data.ExprTree.WhenTree.CaseTree.*
import api.data.InnerNode
import api.data.InnerTree
import api.data.ModuleTree
import api.data.ProjectTree
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.data.TypeTree
import java.io.FileOutputStream
import kotlin.reflect.*
import kotlin.reflect.full.*
const val rootOfProject = "F:\\JavaProject\\SublimationLang"
const val tree_dsl = "$rootOfProject\\src\\main\\kotlin\\api\\data\\tree-DSL.kt"
fun main(){
    clearFile(tree_dsl)
    "api.data" packageName tree_dsl
    using<Env<*,*>>(tree_dsl)
    using<InnerNode>(tree_dsl)
    listOf(
        ProjectTree::class,
        ModuleTree::class
    ) toDsl tree_dsl
    listOf(
        FunctionTree::class,
        TraitTree::class,
        VariableTree::class,
        AnnTree::class,
        NameTree::class,
        InvokeTree::class,
        LambdaTree::class,
        DecValueTree::class,
        IntValueTree::class,
        StrValueTree::class,
        BoolValueTree::class,
        NullValueTree::class,
        UnitValueTree::class,
        IfTree::class,
        WhenTree::class,
        AtCaseTree::class,
        ValueCaseTree::class,
        TypeCaseTree::class,
        ElseCaseTree::class,
        TypeTree::class
    ) toDslWithInfo "$rootOfProject\\src\\main\\kotlin\\api\\data\\tree-DSL.kt"
}
infix fun String.packageName(path : String) = FileOutputStream(path,true).use {
    it.write("package $this\n".toByteArray())
}
fun clearFile(path : String) = FileOutputStream(path,false).use {
    it.write(byteArrayOf())
}
inline fun <reified T : Any> using(path : String){
    FileOutputStream(path,true).use {
        it.write("import ${T::class.qualifiedName}\n".toByteArray())
    }
}
infix fun List<KClass<*>>.toDsl(path : String) = map {
    buildString {
        append("class The")
        append(it.simpleName)
        append("{\n")
        it.primaryConstructor!!.parameters.forEach {
            append("    var ")
            append(it.name.run {
                if(this in listOf("if","when","else","class"))
                    "`$this`" else this
            })
            append(" : ")
            append(it.type.toString())
            append("? = null\n")
        }
        append("}\nfun ")
        append(it.simpleName!![0].lowercaseChar() + it.simpleName!!.substring(1))
        append("(action : The")
        append(it.simpleName)
        append(".() -> Unit) = The")
        append(it.simpleName)
        append("().apply(action).let {\n    ")
        append(it.qualifiedName)
        append("(")
        it.primaryConstructor!!.parameters.forEach {
            append(it.name.run {
                if(this in listOf("if","when","else","class"))
                    "`$this`"
                else this
            })
            append(" = it.")
            append(it.name.run {
                if(this in listOf("if","when","else","class"))
                    "`$this`"
                else this
            })
            append("!!,\n        ")
        }
        delete(length-1,length)
        append("\n    )\n}\n")
    }
}.apply {
    FileOutputStream(path,true).use {
        forEach { text->
            it.write(text.toByteArray())
        }
    }
}
private infix fun List<KClass<*>>.toDslWithInfo(path : String) = map {
    buildString {
        append("class The")
        append(it.simpleName)
        append("{\n")
        it.primaryConstructor!!.parameters.forEach {
            append("    var ")
            append(it.name.run {
                if(this in listOf("if","when","else","class"))
                    "`$this`"
                else this
            })
            append(" : ")
            append(it.type.toString())
            append("? = null\n")
        }
        append("}\nfun Env<InnerNode,*>.")
        append(it.simpleName!![0].lowercaseChar() + it.simpleName!!.substring(1))
        append("(action : The")
        append(it.simpleName)
        append(".() -> Unit) = The")
        append(it.simpleName)
        append("().apply(action).let {\n    ")
        append("it.info = this.outer.run{ this@")
        append(it.simpleName!![0].lowercaseChar() + it.simpleName!!.substring(1))
        append(".infor }\n    ")
        append(it.qualifiedName)
        append("(")
        it.primaryConstructor!!.parameters.forEach {
            append(it.name.run {
                if(this in listOf("if","when","else","class"))
                    "`$this`"
                else this
            })
            append(" = it.")
            append(it.name.run {
                if(this in listOf("if","when","else","class"))
                    "`$this`"
                else this
            })
            append("!!,\n        ")
        }
        delete(length-1,length)
        append("\n    )\n}\n")
    }
}.apply {
    FileOutputStream(path,true).use {
        forEach { text->
            it.write(text.toByteArray())
        }
    }
}
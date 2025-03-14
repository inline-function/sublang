class TheFunctionTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ID? = null
    var body : api.tools.Result<api.data.Block>? = null
    var type : api.tools.Result<api.data.TypeTree>? = null
    var receiver : api.tools.Result<api.data.TypeTree?>? = null
    var params : kotlin.collections.List<api.tools.Result<api.data.TopTree.CallableTree.VariableTree>>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
}
fun Env<InnerNode,*>.functionTree(action : TheFunctionTree.() -> Unit) = TheFunctionTree().apply(action).also {
    it.info = this.outer.run{ this@functionTree.infor }
    api.data.TopTree.CallableTree.FunctionTree(info = it.info!!,name = it.name!!,body = it.body!!,type = it.type!!,receiver = it.receiver!!,params = it.params!!,annotations = it.annotations!!)
}
class TheTraitTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ID? = null
    var members : kotlin.collections.List<api.tools.Result<api.data.TopTree.CallableTree>>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
}
fun Env<InnerNode,*>.traitTree(action : TheTraitTree.() -> Unit) = TheTraitTree().apply(action).also {
    it.info = this.outer.run{ this@traitTree.infor }
    api.data.TopTree.TraitTree(info = it.info!!,name = it.name!!,members = it.members!!,annotations = it.annotations!!)
}
class TheFunctionTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ID? = null
    var body : api.tools.Result<api.data.Block>? = null
    var type : api.tools.Result<api.data.TypeTree>? = null
    var receiver : api.tools.Result<api.data.TypeTree?>? = null
    var params : kotlin.collections.List<api.tools.Result<api.data.TopTree.CallableTree.VariableTree>>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
}
fun Env<InnerNode,*>.functionTree(action : TheFunctionTree.() -> Unit) = TheFunctionTree().apply(action).also {
    it.info = this.outer.run{ this@functionTree.infor }
    api.data.TopTree.CallableTree.FunctionTree(info = it.info!!,name = it.name!!,body = it.body!!,type = it.type!!,receiver = it.receiver!!,params = it.params!!,annotations = it.annotations!!)
}
class TheTraitTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ID? = null
    var members : kotlin.collections.List<api.tools.Result<api.data.TopTree.CallableTree>>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
}
fun Env<InnerNode,*>.traitTree(action : TheTraitTree.() -> Unit) = TheTraitTree().apply(action).also {
    it.info = this.outer.run{ this@traitTree.infor }
    api.data.TopTree.TraitTree(info = it.info!!,name = it.name!!,members = it.members!!,annotations = it.annotations!!)
}

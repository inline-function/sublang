package api.data
import api.classes.Checker.Env
import api.data.InnerNode
class TheProjectTree{
    var name : api.data.ID? = null
    var children : kotlin.collections.List<api.data.ModuleTree>? = null
}
fun projectTree(action : TheProjectTree.() -> Unit) = TheProjectTree().apply(action).let {
    api.data.ProjectTree(name = it.name!!,
        children = it.children!!,
       
    )
}
class TheModuleTree{
    var name : api.data.ID? = null
    var children : kotlin.collections.List<api.data.TopTree>? = null
}
fun moduleTree(action : TheModuleTree.() -> Unit) = TheModuleTree().apply(action).let {
    api.data.ModuleTree(name = it.name!!,
        children = it.children!!,
       
    )
}
class TheFunctionTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ID? = null
    var body : api.tools.Optional<kotlin.Lazy<api.data.Block>>? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
    var receiver : api.tools.Optional<api.data.TypeTree>? = null
    var params : kotlin.collections.List<api.tools.Optional<api.data.TopTree.CallableTree.VariableTree>>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
}
fun Env<InnerNode,*>.functionTree(action : TheFunctionTree.() -> Unit) = TheFunctionTree().apply(action).let {
    it.info = this.outer.run{ this@functionTree.infor }
    api.data.TopTree.CallableTree.FunctionTree(info = it.info!!,
        name = it.name!!,
        body = it.body!!,
        type = it.type!!,
        receiver = it.receiver!!,
        params = it.params!!,
        annotations = it.annotations!!,
       
    )
}
class TheTraitTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ID? = null
    var members : kotlin.collections.List<api.data.TopTree.CallableTree>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
    var parent : api.data.TypeTree?? = null
}
fun Env<InnerNode,*>.traitTree(action : TheTraitTree.() -> Unit) = TheTraitTree().apply(action).let {
    it.info = this.outer.run{ this@traitTree.infor }
    api.data.TopTree.TraitTree(info = it.info!!,
        name = it.name!!,
        members = it.members!!,
        annotations = it.annotations!!,
        parent = it.parent!!,
       
    )
}
class TheVariableTree{
    var info : api.data.CheckedInfo? = null
    var receiver : api.tools.Optional<api.data.TypeTree>? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
    var name : api.data.ID? = null
    var kind : api.data.TopTree.CallableTree.VariableTree.VariableTreeType? = null
    var value : api.tools.Optional<api.data.ExprTree>? = null
    var annotations : kotlin.collections.List<api.data.AnnTree>? = null
}
fun Env<InnerNode,*>.variableTree(action : TheVariableTree.() -> Unit) = TheVariableTree().apply(action).let {
    it.info = this.outer.run{ this@variableTree.infor }
    api.data.TopTree.CallableTree.VariableTree(info = it.info!!,
        receiver = it.receiver!!,
        type = it.type!!,
        name = it.name!!,
        kind = it.kind!!,
        value = it.value!!,
        annotations = it.annotations!!,
       
    )
}
class TheAnnTree{
    var info : api.data.CheckedInfo? = null
    var name : api.data.ExprTree.NameTree? = null
    var value : api.tools.Either<api.data.ExprTree.FaceValueTree<kotlin.Any>, api.data.ExprTree.NameTree>?? = null
}
fun Env<InnerNode,*>.annTree(action : TheAnnTree.() -> Unit) = TheAnnTree().apply(action).let {
    it.info = this.outer.run{ this@annTree.infor }
    api.data.AnnTree(info = it.info!!,
        name = it.name!!,
        value = it.value!!,
       
    )
}
class TheNameTree{
    var info : api.data.CheckedInfo? = null
    var china : kotlin.collections.List<kotlin.String>? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
}
fun Env<InnerNode,*>.nameTree(action : TheNameTree.() -> Unit) = TheNameTree().apply(action).let {
    it.info = this.outer.run{ this@nameTree.infor }
    api.data.ExprTree.NameTree(info = it.info!!,
        china = it.china!!,
        type = it.type!!,
       
    )
}
class TheInvokeTree{
    var info : api.data.CheckedInfo? = null
    var invoker : api.tools.Optional<api.data.ExprTree>? = null
    var args : kotlin.collections.Map<api.data.ID, api.data.ExprTree>? = null
    var generic : kotlin.collections.Map<api.data.ID, api.data.TypeTree>? = null
    var outsideLambda : api.tools.Optional<api.data.ExprTree.LambdaTree>? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
}
fun Env<InnerNode,*>.invokeTree(action : TheInvokeTree.() -> Unit) = TheInvokeTree().apply(action).let {
    it.info = this.outer.run{ this@invokeTree.infor }
    api.data.ExprTree.InvokeTree(info = it.info!!,
        invoker = it.invoker!!,
        args = it.args!!,
        generic = it.generic!!,
        outsideLambda = it.outsideLambda!!,
        type = it.type!!,
       
    )
}
class TheLambdaTree{
    var info : api.data.CheckedInfo? = null
    var params : kotlin.collections.List<api.data.TopTree.CallableTree.VariableTree>? = null
    var body : api.data.Block? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
}
fun Env<InnerNode,*>.lambdaTree(action : TheLambdaTree.() -> Unit) = TheLambdaTree().apply(action).let {
    it.info = this.outer.run{ this@lambdaTree.infor }
    api.data.ExprTree.LambdaTree(info = it.info!!,
        params = it.params!!,
        body = it.body!!,
        type = it.type!!,
       
    )
}
class TheDecValueTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.Double? = null
}
fun Env<InnerNode,*>.decValueTree(action : TheDecValueTree.() -> Unit) = TheDecValueTree().apply(action).let {
    it.info = this.outer.run{ this@decValueTree.infor }
    api.data.ExprTree.FaceValueTree.DecValueTree(info = it.info!!,
        value = it.value!!,
       
    )
}
class TheIntValueTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.Int? = null
}
fun Env<InnerNode,*>.intValueTree(action : TheIntValueTree.() -> Unit) = TheIntValueTree().apply(action).let {
    it.info = this.outer.run{ this@intValueTree.infor }
    api.data.ExprTree.FaceValueTree.IntValueTree(info = it.info!!,
        value = it.value!!,
       
    )
}
class TheStrValueTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.String? = null
}
fun Env<InnerNode,*>.strValueTree(action : TheStrValueTree.() -> Unit) = TheStrValueTree().apply(action).let {
    it.info = this.outer.run{ this@strValueTree.infor }
    api.data.ExprTree.FaceValueTree.StrValueTree(info = it.info!!,
        value = it.value!!,
       
    )
}
class TheBoolValueTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.Boolean? = null
}
fun Env<InnerNode,*>.boolValueTree(action : TheBoolValueTree.() -> Unit) = TheBoolValueTree().apply(action).let {
    it.info = this.outer.run{ this@boolValueTree.infor }
    api.data.ExprTree.FaceValueTree.BoolValueTree(info = it.info!!,
        value = it.value!!,
       
    )
}
class TheNullValueTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.Nothing?? = null
}
fun Env<InnerNode,*>.nullValueTree(action : TheNullValueTree.() -> Unit) = TheNullValueTree().apply(action).let {
    it.info = this.outer.run{ this@nullValueTree.infor }
    api.data.ExprTree.FaceValueTree.NullValueTree(info = it.info!!,
        value = it.value!!,
       
    )
}
class TheUnitValueTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.Unit? = null
}
fun Env<InnerNode,*>.unitValueTree(action : TheUnitValueTree.() -> Unit) = TheUnitValueTree().apply(action).let {
    it.info = this.outer.run{ this@unitValueTree.infor }
    api.data.ExprTree.FaceValueTree.UnitValueTree(info = it.info!!,
        value = it.value!!,
       
    )
}
class TheIfTree{
    var info : api.data.CheckedInfo? = null
    var condition : api.tools.Optional<api.data.ExprTree>? = null
    var then : api.data.Block? = null
    var `else` : api.data.Block?? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
}
fun Env<InnerNode,*>.ifTree(action : TheIfTree.() -> Unit) = TheIfTree().apply(action).let {
    it.info = this.outer.run{ this@ifTree.infor }
    api.data.ExprTree.IfTree(info = it.info!!,
        condition = it.condition!!,
        then = it.then!!,
        `else` = it.`else`!!,
        type = it.type!!,
       
    )
}
class TheWhenTree{
    var info : api.data.CheckedInfo? = null
    var type : api.tools.Optional<api.data.TypeTree>? = null
    var value : api.tools.Optional<api.data.ExprTree>? = null
    var cases : kotlin.collections.List<api.data.ExprTree.WhenTree.CaseTree>? = null
}
fun Env<InnerNode,*>.whenTree(action : TheWhenTree.() -> Unit) = TheWhenTree().apply(action).let {
    it.info = this.outer.run{ this@whenTree.infor }
    api.data.ExprTree.WhenTree(info = it.info!!,
        type = it.type!!,
        value = it.value!!,
        cases = it.cases!!,
       
    )
}
class TheAtCaseTree{
    var info : api.data.CheckedInfo? = null
    var condition : api.tools.Optional<api.data.ExprTree>? = null
    var block : api.data.Block? = null
}
fun Env<InnerNode,*>.atCaseTree(action : TheAtCaseTree.() -> Unit) = TheAtCaseTree().apply(action).let {
    it.info = this.outer.run{ this@atCaseTree.infor }
    api.data.ExprTree.WhenTree.CaseTree.AtCaseTree(info = it.info!!,
        condition = it.condition!!,
        block = it.block!!,
       
    )
}
class TheValueCaseTree{
    var info : api.data.CheckedInfo? = null
    var value : kotlin.collections.List<api.data.ExprTree>? = null
    var block : api.data.Block? = null
}
fun Env<InnerNode,*>.valueCaseTree(action : TheValueCaseTree.() -> Unit) = TheValueCaseTree().apply(action).let {
    it.info = this.outer.run{ this@valueCaseTree.infor }
    api.data.ExprTree.WhenTree.CaseTree.ValueCaseTree(info = it.info!!,
        value = it.value!!,
        block = it.block!!,
       
    )
}
class TheTypeCaseTree{
    var info : api.data.CheckedInfo? = null
    var matcher : api.data.TypeTree? = null
    var block : api.data.Block? = null
}
fun Env<InnerNode,*>.typeCaseTree(action : TheTypeCaseTree.() -> Unit) = TheTypeCaseTree().apply(action).let {
    it.info = this.outer.run{ this@typeCaseTree.infor }
    api.data.ExprTree.WhenTree.CaseTree.TypeCaseTree(info = it.info!!,
        matcher = it.matcher!!,
        block = it.block!!,
       
    )
}
class TheElseCaseTree{
    var info : api.data.CheckedInfo? = null
    var block : api.data.Block? = null
}
fun Env<InnerNode,*>.elseCaseTree(action : TheElseCaseTree.() -> Unit) = TheElseCaseTree().apply(action).let {
    it.info = this.outer.run{ this@elseCaseTree.infor }
    api.data.ExprTree.WhenTree.CaseTree.ElseCaseTree(info = it.info!!,
        block = it.block!!,
       
    )
}
class TheTypeTree{
    var info : api.data.CheckedInfo? = null
    var name : kotlin.String? = null
    var generic : kotlin.collections.Map<api.data.ID, api.data.TypeTree>? = null
}
fun Env<InnerNode,*>.typeTree(action : TheTypeTree.() -> Unit) = TheTypeTree().apply(action).let {
    it.info = this.outer.run{ this@typeTree.infor }
    api.data.TypeTree(info = it.info!!,
        name = it.name!!,
        generic = it.generic!!,
       
    )
}

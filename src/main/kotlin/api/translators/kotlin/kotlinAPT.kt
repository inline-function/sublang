package api.translators.kotlin

import api.data.ModuleTree
import api.data.ProjectTree
import api.data.TopTree
import api.data.TopTree.CallableTree.FunctionTree
import api.data.TopTree.CallableTree.VariableTree
import api.data.TopTree.TraitTree
import api.translators.*
import api.tools.*
var functionApts : PartialFunction<FunctionTree,FunctionTree> = partial({false}){ never() }
var variableApts : PartialFunction<VariableTree,VariableTree> = partial({false}){ never() }
var traitApts : PartialFunction<TraitTree,TraitTree>          = partial({false}){ never() }
var projectApts : PartialFunction<ProjectTree,ProjectTree>    = partial({false}){ never() }
val ProjectTree.aptedKotlinTree : ProjectTree
    get() = translate {
        on<ProjectTree,ProjectTree> {
            projectApts or partial{
                copy(
                    children = children.map(::call)
                )
            } invoke this
        }
        on<ModuleTree,ModuleTree> {
            copy(
                children = children.map(::call)
            )
        }
        on<TopTree,TopTree>{
            when(this){
                is FunctionTree -> call(this)
                is VariableTree -> call(this)
                is TraitTree    -> call(this)
            }
        }
        on<FunctionTree,FunctionTree>{
            functionApts or partial{
                this
            } invoke this
        }
        on<VariableTree,VariableTree>{
            variableApts or partial{
                this
            } invoke this
        }
        on<TraitTree,TraitTree>{
            traitApts or partial{
                this
            } invoke this
        }
    }
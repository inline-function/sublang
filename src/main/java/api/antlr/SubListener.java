// Generated from F:/JavaProject/SublimationLang/cao2gao3/Sub.g4 by ANTLR 4.13.2
package api.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SubParser}.
 */
public interface SubListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SubParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SubParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SubParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SubParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SubParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SubParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SubParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SubParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SubParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#topStmt}.
	 * @param ctx the parse tree
	 */
	void enterTopStmt(SubParser.TopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#topStmt}.
	 * @param ctx the parse tree
	 */
	void exitTopStmt(SubParser.TopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SubParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SubParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SubParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SubParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SubParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SubParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(SubParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(SubParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SubParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SubParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SubParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SubParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SubParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SubParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#gen}.
	 * @param ctx the parse tree
	 */
	void enterGen(SubParser.GenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#gen}.
	 * @param ctx the parse tree
	 */
	void exitGen(SubParser.GenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#generic}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(SubParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#generic}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(SubParser.GenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(SubParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(SubParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(SubParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(SubParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(SubParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(SubParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(SubParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(SubParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#exprOrBlock}.
	 * @param ctx the parse tree
	 */
	void enterExprOrBlock(SubParser.ExprOrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#exprOrBlock}.
	 * @param ctx the parse tree
	 */
	void exitExprOrBlock(SubParser.ExprOrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(SubParser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(SubParser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#elseCase}.
	 * @param ctx the parse tree
	 */
	void enterElseCase(SubParser.ElseCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#elseCase}.
	 * @param ctx the parse tree
	 */
	void exitElseCase(SubParser.ElseCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#typeCase}.
	 * @param ctx the parse tree
	 */
	void enterTypeCase(SubParser.TypeCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#typeCase}.
	 * @param ctx the parse tree
	 */
	void exitTypeCase(SubParser.TypeCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#boolCase}.
	 * @param ctx the parse tree
	 */
	void enterBoolCase(SubParser.BoolCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#boolCase}.
	 * @param ctx the parse tree
	 */
	void exitBoolCase(SubParser.BoolCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#javaLambda}.
	 * @param ctx the parse tree
	 */
	void enterJavaLambda(SubParser.JavaLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#javaLambda}.
	 * @param ctx the parse tree
	 */
	void exitJavaLambda(SubParser.JavaLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#kotlinLambda}.
	 * @param ctx the parse tree
	 */
	void enterKotlinLambda(SubParser.KotlinLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#kotlinLambda}.
	 * @param ctx the parse tree
	 */
	void exitKotlinLambda(SubParser.KotlinLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SubParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SubParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SubParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SubParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#destructuring}.
	 * @param ctx the parse tree
	 */
	void enterDestructuring(SubParser.DestructuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#destructuring}.
	 * @param ctx the parse tree
	 */
	void exitDestructuring(SubParser.DestructuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubParser#trait}.
	 * @param ctx the parse tree
	 */
	void enterTrait(SubParser.TraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubParser#trait}.
	 * @param ctx the parse tree
	 */
	void exitTrait(SubParser.TraitContext ctx);
}
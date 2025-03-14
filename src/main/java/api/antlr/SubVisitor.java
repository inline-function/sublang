// Generated from F:/JavaProject/SublimationLang/cao2gao3/Sub.g4 by ANTLR 4.13.2
package api.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SubParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SubVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SubParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SubParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SubParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SubParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SubParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#topStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopStmt(SubParser.TopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SubParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(SubParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SubParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(SubParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SubParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SubParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SubParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#gen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen(SubParser.GenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(SubParser.GenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(SubParser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SubParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(SubParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(SubParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#exprOrBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrBlock(SubParser.ExprOrBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(SubParser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#elseCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCase(SubParser.ElseCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#typeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCase(SubParser.TypeCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#boolCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCase(SubParser.BoolCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#javaLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaLambda(SubParser.JavaLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#kotlinLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKotlinLambda(SubParser.KotlinLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SubParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SubParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#destructuring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuring(SubParser.DestructuringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubParser#trait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait(SubParser.TraitContext ctx);
}
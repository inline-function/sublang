// Generated from F:/JavaProject/SublimationLang/docs/Sublimation.g4 by ANTLR 4.13.2
package api.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SublimationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SublimationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SublimationParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SublimationParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(SublimationParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SublimationParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(SublimationParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SublimationParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SublimationParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#ann}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnn(SublimationParser.AnnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#anns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnns(SublimationParser.AnnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SublimationParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#expr__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr__(SublimationParser.Expr__Context ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(SublimationParser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#prefixInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixInvoke(SublimationParser.PrefixInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_(SublimationParser.Expr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#infixInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixInvoke(SublimationParser.InfixInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SublimationParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SublimationParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SublimationParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SublimationParser.StmtContext ctx);
}
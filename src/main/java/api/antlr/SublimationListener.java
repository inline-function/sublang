// Generated from F:/JavaProject/SublimationLang/docs/Sublimation.g4 by ANTLR 4.13.2
package api.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SublimationParser}.
 */
public interface SublimationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SublimationParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SublimationParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SublimationParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(SublimationParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(SublimationParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SublimationParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SublimationParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(SublimationParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(SublimationParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SublimationParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SublimationParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SublimationParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SublimationParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#ann}.
	 * @param ctx the parse tree
	 */
	void enterAnn(SublimationParser.AnnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#ann}.
	 * @param ctx the parse tree
	 */
	void exitAnn(SublimationParser.AnnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#anns}.
	 * @param ctx the parse tree
	 */
	void enterAnns(SublimationParser.AnnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#anns}.
	 * @param ctx the parse tree
	 */
	void exitAnns(SublimationParser.AnnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SublimationParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SublimationParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#expr__}.
	 * @param ctx the parse tree
	 */
	void enterExpr__(SublimationParser.Expr__Context ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#expr__}.
	 * @param ctx the parse tree
	 */
	void exitExpr__(SublimationParser.Expr__Context ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(SublimationParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(SublimationParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#prefixInvoke}.
	 * @param ctx the parse tree
	 */
	void enterPrefixInvoke(SublimationParser.PrefixInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#prefixInvoke}.
	 * @param ctx the parse tree
	 */
	void exitPrefixInvoke(SublimationParser.PrefixInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#expr_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_(SublimationParser.Expr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#expr_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_(SublimationParser.Expr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#infixInvoke}.
	 * @param ctx the parse tree
	 */
	void enterInfixInvoke(SublimationParser.InfixInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#infixInvoke}.
	 * @param ctx the parse tree
	 */
	void exitInfixInvoke(SublimationParser.InfixInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SublimationParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SublimationParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SublimationParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SublimationParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SublimationParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SublimationParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SublimationParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SublimationParser.StmtContext ctx);
}
// Generated from F:/JavaProject/SublimationLang/cao2gao3/Sub.g4 by ANTLR 4.13.2
package api.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SubParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, NUMBER=14, STRING=15, IF=16, ELSE=17, 
		FUN=18, TRAIT=19, VAR=20, VAL=21, CONT=22, COV=23, CON=24, IS=25, OF=26, 
		AT=27, ENMTY=28, ARROW=29, ID=30;
	public static final int
		RULE_root = 0, RULE_name = 1, RULE_annotation = 2, RULE_stmt = 3, RULE_topStmt = 4, 
		RULE_parameter = 5, RULE_parameters = 6, RULE_block = 7, RULE_receiver = 8, 
		RULE_function = 9, RULE_type = 10, RULE_expr = 11, RULE_gen = 12, RULE_generic = 13, 
		RULE_invoke = 14, RULE_if = 15, RULE_case = 16, RULE_when = 17, RULE_exprOrBlock = 18, 
		RULE_exprCase = 19, RULE_elseCase = 20, RULE_typeCase = 21, RULE_boolCase = 22, 
		RULE_javaLambda = 23, RULE_kotlinLambda = 24, RULE_lambda = 25, RULE_variable = 26, 
		RULE_destructuring = 27, RULE_trait = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "name", "annotation", "stmt", "topStmt", "parameter", "parameters", 
			"block", "receiver", "function", "type", "expr", "gen", "generic", "invoke", 
			"if", "case", "when", "exprOrBlock", "exprCase", "elseCase", "typeCase", 
			"boolCase", "javaLambda", "kotlinLambda", "lambda", "variable", "destructuring", 
			"trait"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'['", "']'", "'('", "')'", "':'", "'='", "','", 
			"'{'", "'}'", "'->'", null, null, null, "'\\u5982\\u679C'", "'\\u5426\\u5219'", 
			"'\\u51FD\\u6570'", "'\\u529F\\u80FD'", "'\\u52A8\\u91CF'", "'\\u53D8\\u91CF'", 
			"'\\u5E38\\u91CF'", "'\\u534F\\u53D8'", "'\\u9006\\u53D8'", "'\\u662F'", 
			"'\\u4E3A'", "'\\u5F53'", "'_'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "NUMBER", "STRING", "IF", "ELSE", "FUN", "TRAIT", "VAR", 
			"VAL", "CONT", "COV", "CON", "IS", "OF", "AT", "ENMTY", "ARROW", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sub.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SubParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SubParser.EOF, 0); }
		public List<TopStmtContext> topStmt() {
			return getRuleContexts(TopStmtContext.class);
		}
		public TopStmtContext topStmt(int i) {
			return getRuleContext(TopStmtContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case FUN:
			case TRAIT:
			case VAR:
			case VAL:
			case CONT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					topStmt();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8126468L) != 0) );
				setState(63);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SubParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SubParser.ID, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				match(T__0);
				setState(70);
				match(ID);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ID() { return getToken(SubParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__1);
			setState(77);
			name();
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(78);
				match(T__2);
				setState(79);
				match(ID);
				setState(80);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(81);
				match(T__4);
				setState(82);
				expr();
				setState(83);
				match(T__5);
				}
				break;
			case T__1:
			case FUN:
			case TRAIT:
			case VAR:
			case VAL:
			case CONT:
			case ID:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public TopStmtContext topStmt() {
			return getRuleContext(TopStmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				topStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopStmtContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TraitContext trait() {
			return getRuleContext(TraitContext.class,0);
		}
		public TopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterTopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitTopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitTopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStmtContext topStmt() throws RecognitionException {
		TopStmtContext _localctx = new TopStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_topStmt);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				trait();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SubParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SubParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(SubParser.VAL, 0); }
		public TerminalNode CONT() { return getToken(SubParser.CONT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(96);
				annotation();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(102);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(105);
			match(ID);
			setState(106);
			match(T__6);
			setState(107);
			type();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(108);
				match(T__7);
				setState(109);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			parameter();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(113);
				match(T__8);
				setState(114);
				parameter();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__9);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081984036L) != 0)) {
				{
				{
				setState(121);
				stmt();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SubParser.ID, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_receiver);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(129);
				type();
				setState(130);
				match(T__0);
				setState(131);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(SubParser.FUN, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public GenContext gen() {
			return getRuleContext(GenContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(136);
				annotation();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(FUN);
			setState(143);
			receiver();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(144);
				gen();
				}
			}

			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(147);
				match(T__4);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081081860L) != 0)) {
					{
					setState(148);
					parameters();
					}
				}

				setState(151);
				match(T__5);
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(154);
				match(T__6);
				setState(155);
				type();
				}
			}

			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(158);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SubParser.ID, 0); }
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SubParser.ARROW, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(161);
				match(ID);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(162);
					generic();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(165);
				match(T__4);
				setState(166);
				type();
				setState(167);
				match(T__8);
				setState(168);
				type();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(169);
					match(T__8);
					setState(170);
					type();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__5);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(178);
				match(T__4);
				setState(179);
				type();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(180);
					match(T__8);
					setState(181);
					type();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__5);
				setState(188);
				match(ARROW);
				setState(189);
				type();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(191);
				match(T__4);
				setState(192);
				type();
				setState(193);
				match(T__5);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SubParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SubParser.STRING, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public DestructuringContext destructuring() {
			return getRuleContext(DestructuringContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(197);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(198);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(199);
				name();
				}
				break;
			case 4:
				{
				setState(200);
				if_();
				}
				break;
			case 5:
				{
				setState(201);
				when();
				}
				break;
			case 6:
				{
				setState(202);
				lambda();
				}
				break;
			case 7:
				{
				setState(203);
				destructuring();
				}
				break;
			case 8:
				{
				setState(204);
				match(T__4);
				setState(205);
				expr();
				setState(206);
				match(T__5);
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(210);
				invoke();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SubParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SubParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> CON() { return getTokens(SubParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(SubParser.CON, i);
		}
		public List<TerminalNode> COV() { return getTokens(SubParser.COV); }
		public TerminalNode COV(int i) {
			return getToken(SubParser.COV, i);
		}
		public GenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenContext gen() throws RecognitionException {
		GenContext _localctx = new GenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_gen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__2);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COV || _la==CON) {
				{
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==COV || _la==CON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(217);
			match(ID);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(218);
				match(T__6);
				setState(219);
				type();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(222);
				match(T__7);
				setState(223);
				type();
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(226);
				match(T__8);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COV || _la==CON) {
					{
					setState(227);
					_la = _input.LA(1);
					if ( !(_la==COV || _la==CON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(230);
				match(ID);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(231);
					match(T__6);
					setState(232);
					type();
					}
				}

				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(235);
					match(T__7);
					setState(236);
					type();
					}
				}

				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ENMTY() { return getTokens(SubParser.ENMTY); }
		public TerminalNode ENMTY(int i) {
			return getToken(SubParser.ENMTY, i);
		}
		public List<TerminalNode> ID() { return getTokens(SubParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SubParser.ID, i);
		}
		public GenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericContext generic() throws RecognitionException {
		GenericContext _localctx = new GenericContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_generic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__2);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(249);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case ID:
					{
					setState(247);
					type();
					}
					break;
				case ENMTY:
					{
					setState(248);
					match(ENMTY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(251);
					match(T__8);
					setState(254);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case ID:
						{
						setState(252);
						type();
						}
						break;
					case ENMTY:
						{
						setState(253);
						match(ENMTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__7);
				setState(265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case ID:
					{
					setState(263);
					type();
					}
					break;
				case ENMTY:
					{
					setState(264);
					match(ENMTY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(267);
					match(T__8);
					setState(268);
					match(ID);
					setState(269);
					match(T__7);
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case ID:
						{
						setState(270);
						type();
						}
						break;
					case ENMTY:
						{
						setState(271);
						match(ENMTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(281);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeContext extends ParserRuleContext {
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public KotlinLambdaContext kotlinLambda() {
			return getRuleContext(KotlinLambdaContext.class,0);
		}
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SubParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SubParser.ID, i);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_invoke);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(283);
					generic();
					}
					break;
				case 2:
					{
					setState(284);
					generic();
					setState(285);
					kotlinLambda();
					}
					break;
				case 3:
					{
					setState(287);
					kotlinLambda();
					}
					break;
				}
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(290);
					invoke();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(293);
					generic();
					}
				}

				{
				setState(296);
				match(T__4);
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					{
					setState(297);
					expr();
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(298);
						match(T__8);
						setState(299);
						expr();
						}
						}
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(305);
					match(ID);
					setState(306);
					match(T__7);
					setState(307);
					expr();
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(308);
						match(T__8);
						setState(309);
						match(ID);
						setState(310);
						match(T__7);
						setState(311);
						expr();
						}
						}
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(319);
				match(T__5);
				}
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(321);
					kotlinLambda();
					}
					break;
				}
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(324);
					invoke();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SubParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SubParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IF);
			setState(330);
			expr();
			setState(331);
			block();
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(332);
				match(ELSE);
				setState(333);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ElseCaseContext elseCase() {
			return getRuleContext(ElseCaseContext.class,0);
		}
		public TypeCaseContext typeCase() {
			return getRuleContext(TypeCaseContext.class,0);
		}
		public BoolCaseContext boolCase() {
			return getRuleContext(BoolCaseContext.class,0);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_case);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				exprCase();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				elseCase();
				}
				break;
			case OF:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				typeCase();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				boolCase();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SubParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(IF);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(343);
				expr();
				}
				break;
			}
			setState(346);
			match(T__9);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 235012096L) != 0)) {
				{
				{
				setState(347);
				case_();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrBlockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprOrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterExprOrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitExprOrBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitExprOrBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOrBlockContext exprOrBlock() throws RecognitionException {
		ExprOrBlockContext _localctx = new ExprOrBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprOrBlock);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprCaseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(SubParser.IS, 0); }
		public ExprOrBlockContext exprOrBlock() {
			return getRuleContext(ExprOrBlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitExprCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IS);
			{
			setState(360);
			expr();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(361);
				match(T__8);
				setState(362);
				expr();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(368);
			match(T__11);
			setState(369);
			exprOrBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseCaseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SubParser.ELSE, 0); }
		public ExprOrBlockContext exprOrBlock() {
			return getRuleContext(ExprOrBlockContext.class,0);
		}
		public ElseCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterElseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitElseCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitElseCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCaseContext elseCase() throws RecognitionException {
		ElseCaseContext _localctx = new ElseCaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(ELSE);
			setState(372);
			match(T__11);
			setState(373);
			exprOrBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeCaseContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(SubParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprOrBlockContext exprOrBlock() {
			return getRuleContext(ExprOrBlockContext.class,0);
		}
		public TypeCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterTypeCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitTypeCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitTypeCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCaseContext typeCase() throws RecognitionException {
		TypeCaseContext _localctx = new TypeCaseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(OF);
			setState(376);
			type();
			setState(377);
			match(T__11);
			setState(378);
			exprOrBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolCaseContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SubParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprOrBlockContext exprOrBlock() {
			return getRuleContext(ExprOrBlockContext.class,0);
		}
		public BoolCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterBoolCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitBoolCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitBoolCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolCaseContext boolCase() throws RecognitionException {
		BoolCaseContext _localctx = new BoolCaseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(AT);
			setState(381);
			expr();
			setState(382);
			match(T__11);
			setState(383);
			exprOrBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JavaLambdaContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(SubParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public JavaLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterJavaLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitJavaLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitJavaLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaLambdaContext javaLambda() throws RecognitionException {
		JavaLambdaContext _localctx = new JavaLambdaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_javaLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__4);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081081860L) != 0)) {
				{
				setState(386);
				parameters();
				}
			}

			setState(389);
			match(T__5);
			setState(390);
			match(ARROW);
			setState(391);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KotlinLambdaContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(SubParser.ARROW, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public KotlinLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kotlinLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterKotlinLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitKotlinLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitKotlinLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KotlinLambdaContext kotlinLambda() throws RecognitionException {
		KotlinLambdaContext _localctx = new KotlinLambdaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kotlinLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__9);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081081860L) != 0)) {
				{
				setState(394);
				parameters();
				}
			}

			setState(397);
			match(ARROW);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081984036L) != 0)) {
				{
				{
				setState(398);
				stmt();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public JavaLambdaContext javaLambda() {
			return getRuleContext(JavaLambdaContext.class,0);
		}
		public KotlinLambdaContext kotlinLambda() {
			return getRuleContext(KotlinLambdaContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lambda);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				javaLambda();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				kotlinLambda();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SubParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(SubParser.VAL, 0); }
		public TerminalNode CONT() { return getToken(SubParser.CONT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public GenContext gen() {
			return getRuleContext(GenContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(410);
				annotation();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(417);
				gen();
				}
			}

			setState(420);
			receiver();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(421);
				match(T__6);
				setState(422);
				type();
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(425);
				match(T__7);
				setState(426);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuringContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SubParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(SubParser.VAL, 0); }
		public TerminalNode CONT() { return getToken(SubParser.CONT, 0); }
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DestructuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterDestructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitDestructuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitDestructuring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuringContext destructuring() throws RecognitionException {
		DestructuringContext _localctx = new DestructuringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_destructuring);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(429);
				annotation();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(436);
			receiver();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					match(T__8);
					setState(438);
					receiver();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(444);
				match(T__6);
				setState(445);
				type();
				}
			}

			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(448);
				match(T__7);
				setState(449);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TraitContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(SubParser.TRAIT, 0); }
		public TerminalNode ID() { return getToken(SubParser.ID, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public GenContext gen() {
			return getRuleContext(GenContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).enterTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubListener ) ((SubListener)listener).exitTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubVisitor ) return ((SubVisitor<? extends T>)visitor).visitTrait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitContext trait() throws RecognitionException {
		TraitContext _localctx = new TraitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_trait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(452);
				annotation();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			match(TRAIT);
			setState(459);
			match(ID);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(460);
				gen();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(463);
				match(T__6);
				setState(464);
				type();
				}
			}

			setState(467);
			match(T__9);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7602180L) != 0)) {
				{
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(468);
					variable();
					}
					break;
				case 2:
					{
					setState(469);
					function();
					}
					break;
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u01de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0004\u0000<\b\u0000\u000b"+
		"\u0000\f\u0000=\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000C\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001"+
		"K\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004_\b\u0004\u0001\u0005\u0005\u0005b\b\u0005\n\u0005"+
		"\f\u0005e\t\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0087\b\b\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0092\b\t\u0001\t\u0001\t\u0003\t\u0096\b\t\u0001\t"+
		"\u0003\t\u0099\b\t\u0001\t\u0001\t\u0003\t\u009d\b\t\u0001\t\u0003\t\u00a0"+
		"\b\t\u0001\n\u0001\n\u0003\n\u00a4\b\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00ac\b\n\n\n\f\n\u00af\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c4"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00d1\b\u000b\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00d8\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dd\b\f\u0001\f"+
		"\u0001\f\u0003\f\u00e1\b\f\u0001\f\u0001\f\u0003\f\u00e5\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00ea\b\f\u0001\f\u0001\f\u0003\f\u00ee\b\f\u0005\f"+
		"\u00f0\b\f\n\f\f\f\u00f3\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00fa\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ff\b\r\u0005\r\u0101\b"+
		"\r\n\r\f\r\u0104\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010a\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0111\b\r\u0005\r\u0113"+
		"\b\r\n\r\f\r\u0116\t\r\u0003\r\u0118\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0121\b\u000e\u0001"+
		"\u000e\u0003\u000e\u0124\b\u000e\u0001\u000e\u0003\u000e\u0127\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u012d\b\u000e"+
		"\n\u000e\f\u000e\u0130\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0139\b\u000e\n"+
		"\u000e\f\u000e\u013c\t\u000e\u0003\u000e\u013e\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0143\b\u000e\u0001\u000e\u0003\u000e\u0146"+
		"\b\u000e\u0003\u000e\u0148\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u014f\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0155\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0159\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u015d\b"+
		"\u0011\n\u0011\f\u0011\u0160\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0166\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u016c\b\u0013\n\u0013\f\u0013\u016f\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0184\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u018c\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0190\b\u0018\n\u0018\f\u0018\u0193\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0199\b\u0019\u0001\u001a"+
		"\u0005\u001a\u019c\b\u001a\n\u001a\f\u001a\u019f\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01a3\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01a8\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ac\b\u001a"+
		"\u0001\u001b\u0005\u001b\u01af\b\u001b\n\u001b\f\u001b\u01b2\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01b8\b\u001b\n"+
		"\u001b\f\u001b\u01bb\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01bf"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01c3\b\u001b\u0001\u001c"+
		"\u0005\u001c\u01c6\b\u001c\n\u001c\f\u001c\u01c9\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01ce\b\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01d2\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01d7"+
		"\b\u001c\n\u001c\f\u001c\u01da\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0002\u0001\u0000\u0014"+
		"\u0016\u0001\u0000\u0017\u0018\u0214\u0000B\u0001\u0000\u0000\u0000\u0002"+
		"D\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006Y\u0001"+
		"\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000"+
		"\fp\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010\u0086"+
		"\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u00c3"+
		"\u0001\u0000\u0000\u0000\u0016\u00d0\u0001\u0000\u0000\u0000\u0018\u00d5"+
		"\u0001\u0000\u0000\u0000\u001a\u00f6\u0001\u0000\u0000\u0000\u001c\u0147"+
		"\u0001\u0000\u0000\u0000\u001e\u0149\u0001\u0000\u0000\u0000 \u0154\u0001"+
		"\u0000\u0000\u0000\"\u0156\u0001\u0000\u0000\u0000$\u0165\u0001\u0000"+
		"\u0000\u0000&\u0167\u0001\u0000\u0000\u0000(\u0173\u0001\u0000\u0000\u0000"+
		"*\u0177\u0001\u0000\u0000\u0000,\u017c\u0001\u0000\u0000\u0000.\u0181"+
		"\u0001\u0000\u0000\u00000\u0189\u0001\u0000\u0000\u00002\u0198\u0001\u0000"+
		"\u0000\u00004\u019d\u0001\u0000\u0000\u00006\u01b0\u0001\u0000\u0000\u0000"+
		"8\u01c7\u0001\u0000\u0000\u0000:<\u0003\b\u0004\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0000\u0000\u0001@C\u0001"+
		"\u0000\u0000\u0000AC\u0005\u0000\u0000\u0001B;\u0001\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000C\u0001\u0001\u0000\u0000\u0000DI\u0005\u001e"+
		"\u0000\u0000EF\u0005\u0001\u0000\u0000FH\u0005\u001e\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0002\u0000\u0000MU\u0003\u0002\u0001\u0000NO\u0005"+
		"\u0003\u0000\u0000OP\u0005\u001e\u0000\u0000PV\u0005\u0004\u0000\u0000"+
		"QR\u0005\u0005\u0000\u0000RS\u0003\u0016\u000b\u0000ST\u0005\u0006\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UQ\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0005\u0001\u0000\u0000\u0000"+
		"WZ\u0003\b\u0004\u0000XZ\u0003\u0016\u000b\u0000YW\u0001\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000[_\u0003\u0012"+
		"\t\u0000\\_\u00034\u001a\u0000]_\u00038\u001c\u0000^[\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\t\u0001\u0000"+
		"\u0000\u0000`b\u0003\u0004\u0002\u0000a`\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0007\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0005\u001e\u0000\u0000jk\u0005\u0007\u0000\u0000kn\u0003"+
		"\u0014\n\u0000lm\u0005\b\u0000\u0000mo\u0003\u0016\u000b\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u000b\u0001\u0000\u0000"+
		"\u0000pu\u0003\n\u0005\u0000qr\u0005\t\u0000\u0000rt\u0003\n\u0005\u0000"+
		"sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x|\u0005\n\u0000\u0000y{\u0003\u0006\u0003\u0000zy\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u000b\u0000\u0000\u0080\u000f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\u0001\u0000\u0000"+
		"\u0083\u0084\u0005\u001e\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0005\u001e\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0003\u0004\u0002\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0012\u0000\u0000"+
		"\u008f\u0091\u0003\u0010\b\u0000\u0090\u0092\u0003\u0018\f\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0098\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u0005\u0000\u0000\u0094"+
		"\u0096\u0003\f\u0006\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0005\u0006\u0000\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\u0007\u0000\u0000\u009b\u009d\u0003\u0014\n\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0003\u000e\u0007\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0013\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0005\u001e\u0000\u0000\u00a2\u00a4\u0003"+
		"\u001a\r\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00c4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0005"+
		"\u0000\u0000\u00a6\u00a7\u0003\u0014\n\u0000\u00a7\u00a8\u0005\t\u0000"+
		"\u0000\u00a8\u00ad\u0003\u0014\n\u0000\u00a9\u00aa\u0005\t\u0000\u0000"+
		"\u00aa\u00ac\u0003\u0014\n\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000\u00b1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3"+
		"\u00b8\u0003\u0014\n\u0000\u00b4\u00b5\u0005\t\u0000\u0000\u00b5\u00b7"+
		"\u0003\u0014\n\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc\u00bd\u0005"+
		"\u001d\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be\u00c4\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c1\u0003\u0014"+
		"\n\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00a1\u0001\u0000\u0000\u0000\u00c3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00b2\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c4\u0015\u0001\u0000\u0000\u0000\u00c5\u00d1\u0005\u000e\u0000"+
		"\u0000\u00c6\u00d1\u0005\u000f\u0000\u0000\u00c7\u00d1\u0003\u0002\u0001"+
		"\u0000\u00c8\u00d1\u0003\u001e\u000f\u0000\u00c9\u00d1\u0003\"\u0011\u0000"+
		"\u00ca\u00d1\u00032\u0019\u0000\u00cb\u00d1\u00036\u001b\u0000\u00cc\u00cd"+
		"\u0005\u0005\u0000\u0000\u00cd\u00ce\u0003\u0016\u000b\u0000\u00ce\u00cf"+
		"\u0005\u0006\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00c5"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d0\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d0\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003\u001c\u000e\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0017"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d7\u0005\u0003\u0000\u0000\u00d6\u00d8"+
		"\u0007\u0001\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00dc"+
		"\u0005\u001e\u0000\u0000\u00da\u00db\u0005\u0007\u0000\u0000\u00db\u00dd"+
		"\u0003\u0014\n\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\b\u0000\u0000\u00df\u00e1\u0003\u0014\n\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00f1\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0005\t\u0000\u0000\u00e3\u00e5\u0007\u0001\u0000"+
		"\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0005\u001e\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0007\u0000\u0000\u00e8\u00ea\u0003\u0014\n\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\b\u0000\u0000\u00ec"+
		"\u00ee\u0003\u0014\n\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00e2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0004\u0000\u0000\u00f5\u0019\u0001\u0000\u0000\u0000\u00f6\u0117"+
		"\u0005\u0003\u0000\u0000\u00f7\u00fa\u0003\u0014\n\u0000\u00f8\u00fa\u0005"+
		"\u001c\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u0102\u0001\u0000\u0000\u0000\u00fb\u00fe\u0005"+
		"\t\u0000\u0000\u00fc\u00ff\u0003\u0014\n\u0000\u00fd\u00ff\u0005\u001c"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fb\u0001\u0000"+
		"\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0118\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u001e"+
		"\u0000\u0000\u0106\u0109\u0005\b\u0000\u0000\u0107\u010a\u0003\u0014\n"+
		"\u0000\u0108\u010a\u0005\u001c\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u0114\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\t\u0000\u0000\u010c\u010d\u0005\u001e\u0000\u0000"+
		"\u010d\u0110\u0005\b\u0000\u0000\u010e\u0111\u0003\u0014\n\u0000\u010f"+
		"\u0111\u0005\u001c\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112"+
		"\u010b\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u00f9\u0001\u0000\u0000\u0000\u0117\u0105\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0004\u0000\u0000\u011a"+
		"\u001b\u0001\u0000\u0000\u0000\u011b\u0121\u0003\u001a\r\u0000\u011c\u011d"+
		"\u0003\u001a\r\u0000\u011d\u011e\u00030\u0018\u0000\u011e\u0121\u0001"+
		"\u0000\u0000\u0000\u011f\u0121\u00030\u0018\u0000\u0120\u011b\u0001\u0000"+
		"\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0124\u0003\u001c"+
		"\u000e\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0148\u0001\u0000\u0000\u0000\u0125\u0127\u0003\u001a"+
		"\r\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u013d\u0005\u0005\u0000"+
		"\u0000\u0129\u012e\u0003\u0016\u000b\u0000\u012a\u012b\u0005\t\u0000\u0000"+
		"\u012b\u012d\u0003\u0016\u000b\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u013e\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001e\u0000\u0000"+
		"\u0132\u0133\u0005\b\u0000\u0000\u0133\u013a\u0003\u0016\u000b\u0000\u0134"+
		"\u0135\u0005\t\u0000\u0000\u0135\u0136\u0005\u001e\u0000\u0000\u0136\u0137"+
		"\u0005\b\u0000\u0000\u0137\u0139\u0003\u0016\u000b\u0000\u0138\u0134\u0001"+
		"\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013e\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0129\u0001"+
		"\u0000\u0000\u0000\u013d\u0131\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"\u0006\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0143\u0003"+
		"0\u0018\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u0003\u001c"+
		"\u000e\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0120\u0001\u0000"+
		"\u0000\u0000\u0147\u0126\u0001\u0000\u0000\u0000\u0148\u001d\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005\u0010\u0000\u0000\u014a\u014b\u0003\u0016"+
		"\u000b\u0000\u014b\u014e\u0003\u000e\u0007\u0000\u014c\u014d\u0005\u0011"+
		"\u0000\u0000\u014d\u014f\u0003\u000e\u0007\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u001f\u0001\u0000"+
		"\u0000\u0000\u0150\u0155\u0003&\u0013\u0000\u0151\u0155\u0003(\u0014\u0000"+
		"\u0152\u0155\u0003*\u0015\u0000\u0153\u0155\u0003,\u0016\u0000\u0154\u0150"+
		"\u0001\u0000\u0000\u0000\u0154\u0151\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155!\u0001"+
		"\u0000\u0000\u0000\u0156\u0158\u0005\u0010\u0000\u0000\u0157\u0159\u0003"+
		"\u0016\u000b\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015e\u0005"+
		"\n\u0000\u0000\u015b\u015d\u0003 \u0010\u0000\u015c\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u000b"+
		"\u0000\u0000\u0162#\u0001\u0000\u0000\u0000\u0163\u0166\u0003\u0016\u000b"+
		"\u0000\u0164\u0166\u0003\u000e\u0007\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166%\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005\u0019\u0000\u0000\u0168\u016d\u0003\u0016\u000b\u0000"+
		"\u0169\u016a\u0005\t\u0000\u0000\u016a\u016c\u0003\u0016\u000b\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0005\f\u0000\u0000\u0171\u0172\u0003$\u0012\u0000\u0172\'\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005\u0011\u0000\u0000\u0174\u0175\u0005"+
		"\f\u0000\u0000\u0175\u0176\u0003$\u0012\u0000\u0176)\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0005\u001a\u0000\u0000\u0178\u0179\u0003\u0014\n\u0000"+
		"\u0179\u017a\u0005\f\u0000\u0000\u017a\u017b\u0003$\u0012\u0000\u017b"+
		"+\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u001b\u0000\u0000\u017d\u017e"+
		"\u0003\u0016\u000b\u0000\u017e\u017f\u0005\f\u0000\u0000\u017f\u0180\u0003"+
		"$\u0012\u0000\u0180-\u0001\u0000\u0000\u0000\u0181\u0183\u0005\u0005\u0000"+
		"\u0000\u0182\u0184\u0003\f\u0006\u0000\u0183\u0182\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0005\u0006\u0000\u0000\u0186\u0187\u0005\u001d\u0000\u0000"+
		"\u0187\u0188\u0003\u000e\u0007\u0000\u0188/\u0001\u0000\u0000\u0000\u0189"+
		"\u018b\u0005\n\u0000\u0000\u018a\u018c\u0003\f\u0006\u0000\u018b\u018a"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u0191\u0005\u001d\u0000\u0000\u018e\u0190"+
		"\u0003\u0006\u0003\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193"+
		"\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u000b\u0000\u0000\u01951\u0001"+
		"\u0000\u0000\u0000\u0196\u0199\u0003.\u0017\u0000\u0197\u0199\u00030\u0018"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000"+
		"\u0000\u01993\u0001\u0000\u0000\u0000\u019a\u019c\u0003\u0004\u0002\u0000"+
		"\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a2\u0007\u0000\u0000\u0000\u01a1\u01a3\u0003\u0018\f\u0000\u01a2"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a7\u0003\u0010\b\u0000\u01a5\u01a6"+
		"\u0005\u0007\u0000\u0000\u01a6\u01a8\u0003\u0014\n\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0005\b\u0000\u0000\u01aa\u01ac\u0003\u0016"+
		"\u000b\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac5\u0001\u0000\u0000\u0000\u01ad\u01af\u0003\u0004\u0002"+
		"\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0007\u0000\u0000\u0000\u01b4\u01b9\u0003\u0010\b\u0000"+
		"\u01b5\u01b6\u0005\t\u0000\u0000\u01b6\u01b8\u0003\u0010\b\u0000\u01b7"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u01be\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005\u0007\u0000\u0000\u01bd\u01bf\u0003\u0014\n\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\b\u0000\u0000\u01c1\u01c3\u0003"+
		"\u0016\u000b\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c37\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003\u0004"+
		"\u0002\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005\u0013\u0000\u0000\u01cb\u01cd\u0005\u001e"+
		"\u0000\u0000\u01cc\u01ce\u0003\u0018\f\u0000\u01cd\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0005\u0007\u0000\u0000\u01d0\u01d2\u0003\u0014\n\u0000"+
		"\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d8\u0005\n\u0000\u0000\u01d4"+
		"\u01d7\u00034\u001a\u0000\u01d5\u01d7\u0003\u0012\t\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u000b\u0000\u0000\u01dc9\u0001"+
		"\u0000\u0000\u0000F=BIUY^cgnu|\u0086\u008b\u0091\u0095\u0098\u009c\u009f"+
		"\u00a3\u00ad\u00b8\u00c3\u00d0\u00d3\u00d7\u00dc\u00e0\u00e4\u00e9\u00ed"+
		"\u00f1\u00f9\u00fe\u0102\u0109\u0110\u0114\u0117\u0120\u0123\u0126\u012e"+
		"\u013a\u013d\u0142\u0145\u0147\u014e\u0154\u0158\u015e\u0165\u016d\u0183"+
		"\u018b\u0191\u0198\u019d\u01a2\u01a7\u01ab\u01b0\u01b9\u01be\u01c2\u01c7"+
		"\u01cd\u01d1\u01d6\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
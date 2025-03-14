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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(78);
				match(T__2);
				setState(79);
				name();
				setState(80);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(82);
				match(T__4);
				setState(83);
				expr();
				setState(84);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				topStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(97);
				annotation();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(103);
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

			setState(106);
			match(ID);
			setState(107);
			match(T__6);
			setState(108);
			type();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(109);
				match(T__7);
				setState(110);
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
			setState(113);
			parameter();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(114);
				match(T__8);
				setState(115);
				parameter();
				}
				}
				setState(120);
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
			setState(121);
			match(T__9);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081984036L) != 0)) {
				{
				{
				setState(122);
				stmt();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				type();
				setState(131);
				match(T__0);
				setState(132);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(137);
				annotation();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(FUN);
			setState(144);
			receiver();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(145);
				gen();
				}
			}

			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(148);
				match(T__4);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081081860L) != 0)) {
					{
					setState(149);
					parameters();
					}
				}

				setState(152);
				match(T__5);
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(155);
				match(T__6);
				setState(156);
				type();
				}
			}

			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(159);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(162);
				match(ID);
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(163);
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
				setState(166);
				match(T__4);
				setState(167);
				type();
				setState(168);
				match(T__8);
				setState(169);
				type();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(170);
					match(T__8);
					setState(171);
					type();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(T__5);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(179);
				match(T__4);
				setState(180);
				type();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(181);
					match(T__8);
					setState(182);
					type();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(T__5);
				setState(189);
				match(ARROW);
				setState(190);
				type();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(192);
				match(T__4);
				setState(193);
				type();
				setState(194);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(198);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(199);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(200);
				name();
				}
				break;
			case 4:
				{
				setState(201);
				if_();
				}
				break;
			case 5:
				{
				setState(202);
				when();
				}
				break;
			case 6:
				{
				setState(203);
				lambda();
				}
				break;
			case 7:
				{
				setState(204);
				destructuring();
				}
				break;
			case 8:
				{
				setState(205);
				match(T__4);
				setState(206);
				expr();
				setState(207);
				match(T__5);
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(211);
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
		public List<TerminalNode> CON() { return getTokens(SubParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(SubParser.CON, i);
		}
		public List<TerminalNode> COV() { return getTokens(SubParser.COV); }
		public TerminalNode COV(int i) {
			return getToken(SubParser.COV, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(214);
			match(T__2);
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==COV || _la==CON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(216);
			match(ID);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(217);
				match(T__6);
				setState(218);
				type();
				}
			}

			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(221);
				match(T__7);
				setState(222);
				type();
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(225);
				match(T__8);
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==COV || _la==CON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				match(ID);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(228);
					match(T__6);
					setState(229);
					type();
					}
				}

				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(232);
					match(T__7);
					setState(233);
					type();
					}
				}

				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
			setState(243);
			match(T__2);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(246);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case ID:
					{
					setState(244);
					type();
					}
					break;
				case ENMTY:
					{
					setState(245);
					match(ENMTY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(248);
					match(T__8);
					setState(251);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case ID:
						{
						setState(249);
						type();
						}
						break;
					case ENMTY:
						{
						setState(250);
						match(ENMTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__7);
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case ID:
					{
					setState(260);
					type();
					}
					break;
				case ENMTY:
					{
					setState(261);
					match(ENMTY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(264);
					match(T__8);
					setState(265);
					match(ID);
					setState(266);
					match(T__7);
					setState(269);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case ID:
						{
						setState(267);
						type();
						}
						break;
					case ENMTY:
						{
						setState(268);
						match(ENMTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(278);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(280);
					generic();
					}
					break;
				case 2:
					{
					setState(281);
					generic();
					setState(282);
					kotlinLambda();
					}
					break;
				case 3:
					{
					setState(284);
					kotlinLambda();
					}
					break;
				}
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(287);
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
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(290);
					generic();
					}
				}

				{
				setState(293);
				match(T__4);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					{
					setState(294);
					expr();
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(295);
						match(T__8);
						setState(296);
						expr();
						}
						}
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(302);
					match(ID);
					setState(303);
					match(T__7);
					setState(304);
					expr();
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(305);
						match(T__8);
						setState(306);
						match(ID);
						setState(307);
						match(T__7);
						setState(308);
						expr();
						}
						}
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(316);
				match(T__5);
				}
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(318);
					kotlinLambda();
					}
					break;
				}
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(321);
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
			setState(326);
			match(IF);
			setState(327);
			expr();
			setState(328);
			block();
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(329);
				match(ELSE);
				setState(330);
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
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				exprCase();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				elseCase();
				}
				break;
			case OF:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				typeCase();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
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
			setState(339);
			match(IF);
			setState(340);
			expr();
			setState(341);
			match(T__9);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 235012096L) != 0)) {
				{
				{
				setState(342);
				case_();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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
			setState(354);
			match(IS);
			{
			setState(355);
			expr();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(356);
				match(T__8);
				setState(357);
				expr();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(363);
			match(T__11);
			setState(364);
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
			setState(366);
			match(ELSE);
			setState(367);
			match(T__11);
			setState(368);
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
			setState(370);
			match(OF);
			setState(371);
			type();
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
			setState(375);
			match(AT);
			setState(376);
			expr();
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
			setState(380);
			match(T__4);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081081860L) != 0)) {
				{
				setState(381);
				parameters();
				}
			}

			setState(384);
			match(T__5);
			setState(385);
			match(ARROW);
			setState(386);
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
			setState(388);
			match(T__9);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081081860L) != 0)) {
				{
				setState(389);
				parameters();
				}
			}

			setState(392);
			match(ARROW);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081984036L) != 0)) {
				{
				{
				setState(393);
				stmt();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
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
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				javaLambda();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
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
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(405);
				annotation();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(412);
				gen();
				}
			}

			setState(415);
			receiver();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(416);
				match(T__6);
				setState(417);
				type();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(420);
				match(T__7);
				setState(421);
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
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(424);
				annotation();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
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
			setState(431);
			receiver();
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					match(T__8);
					setState(433);
					receiver();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(439);
				match(T__6);
				setState(440);
				type();
				}
			}

			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(443);
				match(T__7);
				setState(444);
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
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(447);
				annotation();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(TRAIT);
			setState(454);
			match(ID);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(455);
				gen();
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(458);
				match(T__6);
				setState(459);
				type();
				}
			}

			setState(462);
			match(T__9);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7602180L) != 0)) {
				{
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(463);
					variable();
					}
					break;
				case 2:
					{
					setState(464);
					function();
					}
					break;
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
		"\u0004\u0001\u001e\u01d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"W\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0005\u0005\u0005c\b\u0005"+
		"\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005p\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006u\b\u0006\n\u0006\f\u0006"+
		"x\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007|\b\u0007\n\u0007\f\u0007"+
		"\u007f\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0088\b\b\u0001\t\u0005\t\u008b\b\t\n\t\f\t\u008e\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0093\b\t\u0001\t\u0001\t\u0003\t\u0097"+
		"\b\t\u0001\t\u0003\t\u009a\b\t\u0001\t\u0001\t\u0003\t\u009e\b\t\u0001"+
		"\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0003\n\u00a5\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ad\b\n\n\n\f\n\u00b0\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b8\b\n\n\n\f\n\u00bb"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00c5\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d2\b\u000b\u0001\u000b\u0003\u000b\u00d5\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dc\b\f\u0001\f\u0001\f\u0003"+
		"\f\u00e0\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e7\b\f"+
		"\u0001\f\u0001\f\u0003\f\u00eb\b\f\u0005\f\u00ed\b\f\n\f\f\f\u00f0\t\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00f7\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00fc\b\r\u0005\r\u00fe\b\r\n\r\f\r\u0101\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0107\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u010e\b\r\u0005\r\u0110\b\r\n\r\f\r\u0113\t\r\u0003"+
		"\r\u0115\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u011e\b\u000e\u0001\u000e\u0003\u000e\u0121"+
		"\b\u000e\u0001\u000e\u0003\u000e\u0124\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u012a\b\u000e\n\u000e\f\u000e\u012d"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0136\b\u000e\n\u000e\f\u000e\u0139\t\u000e"+
		"\u0003\u000e\u013b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0140\b\u000e\u0001\u000e\u0003\u000e\u0143\b\u000e\u0003\u000e\u0145"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u014c\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0152\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0158\b\u0011\n\u0011\f\u0011\u015b\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0161\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0167\b\u0013\n\u0013\f\u0013\u016a"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u017f\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0187\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u018b\b\u0018\n\u0018\f\u0018\u018e\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0194\b\u0019"+
		"\u0001\u001a\u0005\u001a\u0197\b\u001a\n\u001a\f\u001a\u019a\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u019e\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01a3\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a7"+
		"\b\u001a\u0001\u001b\u0005\u001b\u01aa\b\u001b\n\u001b\f\u001b\u01ad\t"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01b3"+
		"\b\u001b\n\u001b\f\u001b\u01b6\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01ba\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01be\b\u001b\u0001"+
		"\u001c\u0005\u001c\u01c1\b\u001c\n\u001c\f\u001c\u01c4\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01c9\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01cd\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01d2\b\u001c\n\u001c\f\u001c\u01d5\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0002\u0001\u0000"+
		"\u0014\u0016\u0001\u0000\u0017\u0018\u020c\u0000B\u0001\u0000\u0000\u0000"+
		"\u0002D\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006Z"+
		"\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000"+
		"\u0000\fq\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010"+
		"\u0087\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014"+
		"\u00c4\u0001\u0000\u0000\u0000\u0016\u00d1\u0001\u0000\u0000\u0000\u0018"+
		"\u00d6\u0001\u0000\u0000\u0000\u001a\u00f3\u0001\u0000\u0000\u0000\u001c"+
		"\u0144\u0001\u0000\u0000\u0000\u001e\u0146\u0001\u0000\u0000\u0000 \u0151"+
		"\u0001\u0000\u0000\u0000\"\u0153\u0001\u0000\u0000\u0000$\u0160\u0001"+
		"\u0000\u0000\u0000&\u0162\u0001\u0000\u0000\u0000(\u016e\u0001\u0000\u0000"+
		"\u0000*\u0172\u0001\u0000\u0000\u0000,\u0177\u0001\u0000\u0000\u0000."+
		"\u017c\u0001\u0000\u0000\u00000\u0184\u0001\u0000\u0000\u00002\u0193\u0001"+
		"\u0000\u0000\u00004\u0198\u0001\u0000\u0000\u00006\u01ab\u0001\u0000\u0000"+
		"\u00008\u01c2\u0001\u0000\u0000\u0000:<\u0003\b\u0004\u0000;:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0000\u0000\u0001"+
		"@C\u0001\u0000\u0000\u0000AC\u0005\u0000\u0000\u0001B;\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000C\u0001\u0001\u0000\u0000\u0000DI\u0005"+
		"\u001e\u0000\u0000EF\u0005\u0001\u0000\u0000FH\u0005\u001e\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0002\u0000\u0000MV\u0003\u0002\u0001\u0000"+
		"NO\u0005\u0003\u0000\u0000OP\u0003\u0002\u0001\u0000PQ\u0005\u0004\u0000"+
		"\u0000QW\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0003\u0016"+
		"\u000b\u0000TU\u0005\u0006\u0000\u0000UW\u0001\u0000\u0000\u0000VN\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\u0005\u0001\u0000\u0000\u0000X[\u0003\b\u0004\u0000Y[\u0003\u0016\u000b"+
		"\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0007\u0001"+
		"\u0000\u0000\u0000\\`\u0003\u0012\t\u0000]`\u00034\u001a\u0000^`\u0003"+
		"8\u001c\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`\t\u0001\u0000\u0000\u0000ac\u0003\u0004\u0002\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u001e\u0000\u0000"+
		"kl\u0005\u0007\u0000\u0000lo\u0003\u0014\n\u0000mn\u0005\b\u0000\u0000"+
		"np\u0003\u0016\u000b\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u000b\u0001\u0000\u0000\u0000qv\u0003\n\u0005\u0000rs\u0005\t"+
		"\u0000\u0000su\u0003\n\u0005\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\r\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y}\u0005\n\u0000\u0000z|\u0003"+
		"\u0006\u0003\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000b"+
		"\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0014"+
		"\n\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0085\u0005\u001e\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0088\u0005\u001e\u0000"+
		"\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0004\u0002"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0012\u0000\u0000\u0090\u0092\u0003\u0010\b\u0000"+
		"\u0091\u0093\u0003\u0018\f\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0005\u0005\u0000\u0000\u0095\u0097\u0003\f\u0006\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u0006\u0000\u0000\u0099\u0094"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0007\u0000\u0000\u009c\u009e"+
		"\u0003\u0014\n\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003"+
		"\u000e\u0007\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005"+
		"\u001e\u0000\u0000\u00a3\u00a5\u0003\u001a\r\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00c5\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0003\u0014"+
		"\n\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00ae\u0003\u0014\n\u0000"+
		"\u00aa\u00ab\u0005\t\u0000\u0000\u00ab\u00ad\u0003\u0014\n\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0006\u0000\u0000\u00b2\u00c5\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b9\u0003\u0014\n\u0000\u00b5\u00b6"+
		"\u0005\t\u0000\u0000\u00b6\u00b8\u0003\u0014\n\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0006\u0000\u0000\u00bd\u00be\u0005\u001d\u0000\u0000\u00be\u00bf\u0003"+
		"\u0014\n\u0000\u00bf\u00c5\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0005"+
		"\u0000\u0000\u00c1\u00c2\u0003\u0014\n\u0000\u00c2\u00c3\u0005\u0006\u0000"+
		"\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00a6\u0001\u0000\u0000\u0000\u00c4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c5\u0015\u0001\u0000\u0000"+
		"\u0000\u00c6\u00d2\u0005\u000e\u0000\u0000\u00c7\u00d2\u0005\u000f\u0000"+
		"\u0000\u00c8\u00d2\u0003\u0002\u0001\u0000\u00c9\u00d2\u0003\u001e\u000f"+
		"\u0000\u00ca\u00d2\u0003\"\u0011\u0000\u00cb\u00d2\u00032\u0019\u0000"+
		"\u00cc\u00d2\u00036\u001b\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000\u00ce"+
		"\u00cf\u0003\u0016\u000b\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000\u00d0"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c6\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0003\u001c\u000e\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u0017\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\u0003\u0000\u0000\u00d7\u00d8\u0007\u0001\u0000\u0000\u00d8"+
		"\u00db\u0005\u001e\u0000\u0000\u00d9\u00da\u0005\u0007\u0000\u0000\u00da"+
		"\u00dc\u0003\u0014\n\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\b\u0000\u0000\u00de\u00e0\u0003\u0014\n\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e3\u0007\u0001"+
		"\u0000\u0000\u00e3\u00e6\u0005\u001e\u0000\u0000\u00e4\u00e5\u0005\u0007"+
		"\u0000\u0000\u00e5\u00e7\u0003\u0014\n\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\b\u0000\u0000\u00e9\u00eb\u0003\u0014\n\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e1\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0004\u0000\u0000"+
		"\u00f2\u0019\u0001\u0000\u0000\u0000\u00f3\u0114\u0005\u0003\u0000\u0000"+
		"\u00f4\u00f7\u0003\u0014\n\u0000\u00f5\u00f7\u0005\u001c\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00ff\u0001\u0000\u0000\u0000\u00f8\u00fb\u0005\t\u0000\u0000\u00f9\u00fc"+
		"\u0003\u0014\n\u0000\u00fa\u00fc\u0005\u001c\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fe\u0101\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0115\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\u001e\u0000\u0000\u0103\u0106\u0005"+
		"\b\u0000\u0000\u0104\u0107\u0003\u0014\n\u0000\u0105\u0107\u0005\u001c"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0111\u0001\u0000\u0000\u0000\u0108\u0109\u0005\t\u0000"+
		"\u0000\u0109\u010a\u0005\u001e\u0000\u0000\u010a\u010d\u0005\b\u0000\u0000"+
		"\u010b\u010e\u0003\u0014\n\u0000\u010c\u010e\u0005\u001c\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0001\u0000\u0000\u0000\u010f\u0108\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u00f6\u0001\u0000\u0000\u0000\u0114"+
		"\u0102\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005\u0004\u0000\u0000\u0117\u001b\u0001\u0000\u0000\u0000\u0118"+
		"\u011e\u0003\u001a\r\u0000\u0119\u011a\u0003\u001a\r\u0000\u011a\u011b"+
		"\u00030\u0018\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011e\u0003"+
		"0\u0018\u0000\u011d\u0118\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0003\u001c\u000e\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0145\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0003\u001a\r\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u013a\u0005\u0005\u0000\u0000\u0126\u012b\u0003\u0016\u000b"+
		"\u0000\u0127\u0128\u0005\t\u0000\u0000\u0128\u012a\u0003\u0016\u000b\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u013b\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\u001e\u0000\u0000\u012f\u0130\u0005\b\u0000\u0000\u0130"+
		"\u0137\u0003\u0016\u000b\u0000\u0131\u0132\u0005\t\u0000\u0000\u0132\u0133"+
		"\u0005\u001e\u0000\u0000\u0133\u0134\u0005\b\u0000\u0000\u0134\u0136\u0003"+
		"\u0016\u000b\u0000\u0135\u0131\u0001\u0000\u0000\u0000\u0136\u0139\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u013a\u0126\u0001\u0000\u0000\u0000\u013a\u012e\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005\u0006\u0000\u0000\u013d\u013f\u0001"+
		"\u0000\u0000\u0000\u013e\u0140\u00030\u0018\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u0143\u0003\u001c\u000e\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000"+
		"\u0000\u0000\u0144\u011d\u0001\u0000\u0000\u0000\u0144\u0123\u0001\u0000"+
		"\u0000\u0000\u0145\u001d\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0010"+
		"\u0000\u0000\u0147\u0148\u0003\u0016\u000b\u0000\u0148\u014b\u0003\u000e"+
		"\u0007\u0000\u0149\u014a\u0005\u0011\u0000\u0000\u014a\u014c\u0003\u000e"+
		"\u0007\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u001f\u0001\u0000\u0000\u0000\u014d\u0152\u0003&\u0013"+
		"\u0000\u014e\u0152\u0003(\u0014\u0000\u014f\u0152\u0003*\u0015\u0000\u0150"+
		"\u0152\u0003,\u0016\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u0152!\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"\u0010\u0000\u0000\u0154\u0155\u0003\u0016\u000b\u0000\u0155\u0159\u0005"+
		"\n\u0000\u0000\u0156\u0158\u0003 \u0010\u0000\u0157\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u000b"+
		"\u0000\u0000\u015d#\u0001\u0000\u0000\u0000\u015e\u0161\u0003\u0016\u000b"+
		"\u0000\u015f\u0161\u0003\u000e\u0007\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161%\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0005\u0019\u0000\u0000\u0163\u0168\u0003\u0016\u000b\u0000"+
		"\u0164\u0165\u0005\t\u0000\u0000\u0165\u0167\u0003\u0016\u000b\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168"+
		"\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0005\f\u0000\u0000\u016c\u016d\u0003$\u0012\u0000\u016d\'\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005\u0011\u0000\u0000\u016f\u0170\u0005"+
		"\f\u0000\u0000\u0170\u0171\u0003$\u0012\u0000\u0171)\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005\u001a\u0000\u0000\u0173\u0174\u0003\u0014\n\u0000"+
		"\u0174\u0175\u0005\f\u0000\u0000\u0175\u0176\u0003$\u0012\u0000\u0176"+
		"+\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u001b\u0000\u0000\u0178\u0179"+
		"\u0003\u0016\u000b\u0000\u0179\u017a\u0005\f\u0000\u0000\u017a\u017b\u0003"+
		"$\u0012\u0000\u017b-\u0001\u0000\u0000\u0000\u017c\u017e\u0005\u0005\u0000"+
		"\u0000\u017d\u017f\u0003\f\u0006\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005\u0006\u0000\u0000\u0181\u0182\u0005\u001d\u0000\u0000"+
		"\u0182\u0183\u0003\u000e\u0007\u0000\u0183/\u0001\u0000\u0000\u0000\u0184"+
		"\u0186\u0005\n\u0000\u0000\u0185\u0187\u0003\f\u0006\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u018c\u0005\u001d\u0000\u0000\u0189\u018b"+
		"\u0003\u0006\u0003\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018e"+
		"\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u018c"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u000b\u0000\u0000\u01901\u0001"+
		"\u0000\u0000\u0000\u0191\u0194\u0003.\u0017\u0000\u0192\u0194\u00030\u0018"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u01943\u0001\u0000\u0000\u0000\u0195\u0197\u0003\u0004\u0002\u0000"+
		"\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u019d\u0007\u0000\u0000\u0000\u019c\u019e\u0003\u0018\f\u0000\u019d"+
		"\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0003\u0010\b\u0000\u01a0\u01a1"+
		"\u0005\u0007\u0000\u0000\u01a1\u01a3\u0003\u0014\n\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0005\b\u0000\u0000\u01a5\u01a7\u0003\u0016"+
		"\u000b\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a75\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003\u0004\u0002"+
		"\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ae\u01af\u0007\u0000\u0000\u0000\u01af\u01b4\u0003\u0010\b\u0000"+
		"\u01b0\u01b1\u0005\t\u0000\u0000\u01b1\u01b3\u0003\u0010\b\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005\u0007\u0000\u0000\u01b8\u01ba\u0003\u0014\n\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\b\u0000\u0000\u01bc\u01be\u0003"+
		"\u0016\u000b\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be7\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003\u0004"+
		"\u0002\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005\u0013\u0000\u0000\u01c6\u01c8\u0005\u001e"+
		"\u0000\u0000\u01c7\u01c9\u0003\u0018\f\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0005\u0007\u0000\u0000\u01cb\u01cd\u0003\u0014\n\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d3\u0005\n\u0000\u0000\u01cf"+
		"\u01d2\u00034\u001a\u0000\u01d0\u01d2\u0003\u0012\t\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\u000b\u0000\u0000\u01d79\u0001"+
		"\u0000\u0000\u0000C=BIVZ_dhov}\u0087\u008c\u0092\u0096\u0099\u009d\u00a0"+
		"\u00a4\u00ae\u00b9\u00c4\u00d1\u00d4\u00db\u00df\u00e6\u00ea\u00ee\u00f6"+
		"\u00fb\u00ff\u0106\u010d\u0111\u0114\u011d\u0120\u0123\u012b\u0137\u013a"+
		"\u013f\u0142\u0144\u014b\u0151\u0159\u0160\u0168\u017e\u0186\u018c\u0193"+
		"\u0198\u019d\u01a2\u01a6\u01ab\u01b4\u01b9\u01bd\u01c2\u01c8\u01cc\u01d1"+
		"\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
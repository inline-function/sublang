// Generated from F:/JavaProject/SublimationLang/docs/Sublimation.g4 by ANTLR 4.13.2
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
public class SublimationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, KG=14, ID=15, STRING=16, NUMBER=17, 
		ARROW=18;
	public static final int
		RULE_root = 0, RULE_top = 1, RULE_name = 2, RULE_data = 3, RULE_type = 4, 
		RULE_struct = 5, RULE_ann = 6, RULE_anns = 7, RULE_expr = 8, RULE_expr__ = 9, 
		RULE_invoke = 10, RULE_prefixInvoke = 11, RULE_expr_ = 12, RULE_infixInvoke = 13, 
		RULE_lambda = 14, RULE_block = 15, RULE_stmt = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "top", "name", "data", "type", "struct", "ann", "anns", "expr", 
			"expr__", "invoke", "prefixInvoke", "expr_", "infixInvoke", "lambda", 
			"block", "stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'='", "':'", "'<'", "','", "'>'", "'('", "')'", "'['", 
			"']'", "'@'", "'~'", null, null, null, null, null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "KG", "ID", "STRING", "NUMBER", "ARROW"
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
	public String getGrammarFileName() { return "Sublimation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SublimationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SublimationParser.EOF, 0); }
		public List<TopContext> top() {
			return getRuleContexts(TopContext.class);
		}
		public TopContext top(int i) {
			return getRuleContext(TopContext.class,i);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(EOF);
				}
				break;
			case T__10:
			case KG:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					top();
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(36);
						match(KG);
						}
						break;
					}
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 51200L) != 0) );
				setState(43);
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
	public static class TopContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitTop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_top);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				struct();
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
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SublimationParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SublimationParser.ID, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(52);
					match(T__0);
					setState(53);
					match(ID);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class DataContext extends ParserRuleContext {
		public AnnsContext anns() {
			return getRuleContext(AnnsContext.class,0);
		}
		public TerminalNode ID() { return getToken(SublimationParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KG() { return getToken(SublimationParser.KG, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				anns();
				setState(60);
				match(ID);
				setState(61);
				match(T__1);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(62);
					match(KG);
					}
				}

				setState(65);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				anns();
				setState(68);
				match(ID);
				setState(69);
				match(T__2);
				setState(70);
				type();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(71);
					match(T__1);
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(72);
						match(KG);
						}
					}

					setState(75);
					expr();
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
	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SublimationParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SublimationParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public TerminalNode ARROW() { return getToken(SublimationParser.ARROW, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(81);
					match(T__0);
					setState(82);
					match(ID);
					}
				}

				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(85);
					match(T__3);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(86);
						match(KG);
						}
					}

					setState(89);
					type();
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(91);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(90);
								match(KG);
								}
							}

							setState(93);
							match(T__4);
							setState(95);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(94);
								match(KG);
								}
							}

							setState(97);
							type();
							}
							} 
						}
						setState(102);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(103);
						match(KG);
						}
					}

					setState(106);
					match(T__5);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__6);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(111);
						match(KG);
						}
					}

					setState(114);
					type();
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(115);
								match(KG);
								}
							}

							setState(118);
							match(T__4);
							setState(120);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(119);
								match(KG);
								}
							}

							setState(122);
							type();
							}
							} 
						}
						setState(127);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					}
					break;
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(130);
					match(KG);
					}
				}

				setState(133);
				match(T__7);
				setState(134);
				match(ARROW);
				setState(135);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__6);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(137);
					match(KG);
					}
				}

				setState(140);
				type();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(141);
					match(KG);
					}
				}

				setState(144);
				match(T__4);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(145);
					match(KG);
					}
				}

				setState(148);
				type();
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KG) {
							{
							setState(149);
							match(KG);
							}
						}

						setState(152);
						match(T__4);
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KG) {
							{
							setState(153);
							match(KG);
							}
						}

						setState(156);
						type();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(162);
					match(KG);
					}
				}

				setState(165);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(T__6);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(168);
					match(KG);
					}
				}

				setState(171);
				type();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(172);
					match(KG);
					}
				}

				setState(175);
				match(T__7);
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
	public static class StructContext extends ParserRuleContext {
		public AnnsContext anns() {
			return getRuleContext(AnnsContext.class,0);
		}
		public TerminalNode ID() { return getToken(SublimationParser.ID, 0); }
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_struct);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			anns();
			setState(180);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(181);
				match(T__3);
				setState(182);
				type();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(183);
					match(T__4);
					setState(184);
					type();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(T__5);
				}
			}

			setState(194);
			match(T__8);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(195);
				match(KG);
				}
				break;
			}
			setState(198);
			data();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(199);
						match(KG);
						}
					}

					setState(202);
					match(T__4);
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(203);
						match(KG);
						}
						break;
					}
					setState(206);
					data();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KG) {
				{
				setState(212);
				match(KG);
				}
			}

			setState(215);
			match(T__9);
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
	public static class AnnContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SublimationParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SublimationParser.NUMBER, 0); }
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public AnnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ann; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterAnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitAnn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitAnn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnContext ann() throws RecognitionException {
		AnnContext _localctx = new AnnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ann);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__10);
			setState(218);
			name();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(219);
				match(T__6);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(220);
					match(KG);
					}
				}

				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(223);
					match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(224);
					match(NUMBER);
					}
					break;
				case ID:
					{
					setState(225);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(228);
					match(KG);
					}
				}

				setState(231);
				match(T__7);
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
	public static class AnnsContext extends ParserRuleContext {
		public List<AnnContext> ann() {
			return getRuleContexts(AnnContext.class);
		}
		public AnnContext ann(int i) {
			return getRuleContext(AnnContext.class,i);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public AnnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterAnns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitAnns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitAnns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnsContext anns() throws RecognitionException {
		AnnsContext _localctx = new AnnsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anns);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(234);
						match(KG);
						}
					}

					setState(237);
					ann();
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(238);
						match(KG);
						}
						break;
					}
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class ExprContext extends ParserRuleContext {
		public Expr__Context expr__() {
			return getRuleContext(Expr__Context.class,0);
		}
		public PrefixInvokeContext prefixInvoke() {
			return getRuleContext(PrefixInvokeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				expr__();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				prefixInvoke();
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
	public static class Expr__Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public TerminalNode STRING() { return getToken(SublimationParser.STRING, 0); }
		public Expr_Context expr_() {
			return getRuleContext(Expr_Context.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SublimationParser.NUMBER, 0); }
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Expr__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterExpr__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitExpr__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitExpr__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr__Context expr__() throws RecognitionException {
		Expr__Context _localctx = new Expr__Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr__);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__6);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(251);
					match(KG);
					}
				}

				setState(254);
				expr();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(255);
					match(KG);
					}
				}

				setState(258);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(STRING);
				setState(261);
				expr_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(NUMBER);
				setState(263);
				expr_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				lambda();
				setState(265);
				expr_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				invoke();
				setState(268);
				expr_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				name();
				setState(271);
				expr_();
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
	public static class InvokeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_invoke);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			name();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(276);
				match(T__3);
				setState(277);
				type();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(278);
					match(T__4);
					setState(279);
					type();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__5);
				}
			}

			setState(289);
			match(T__6);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(290);
				match(KG);
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(293);
					match(KG);
					}
				}

				setState(296);
				expr();
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KG) {
							{
							setState(297);
							match(KG);
							}
						}

						setState(300);
						match(T__4);
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KG) {
							{
							setState(301);
							match(KG);
							}
						}

						setState(304);
						expr();
						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KG) {
				{
				setState(312);
				match(KG);
				}
			}

			setState(315);
			match(T__7);
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
	public static class PrefixInvokeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrefixInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterPrefixInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitPrefixInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitPrefixInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixInvokeContext prefixInvoke() throws RecognitionException {
		PrefixInvokeContext _localctx = new PrefixInvokeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefixInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			name();
			setState(318);
			expr();
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
	public static class Expr_Context extends ParserRuleContext {
		public InfixInvokeContext infixInvoke() {
			return getRuleContext(InfixInvokeContext.class,0);
		}
		public Expr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_Context expr_() throws RecognitionException {
		Expr_Context _localctx = new Expr_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				infixInvoke();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
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
	public static class InfixInvokeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_Context expr_() {
			return getRuleContext(Expr_Context.class,0);
		}
		public InfixInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterInfixInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitInfixInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitInfixInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixInvokeContext infixInvoke() throws RecognitionException {
		InfixInvokeContext _localctx = new InfixInvokeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_infixInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			name();
			setState(325);
			expr();
			setState(326);
			expr_();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<AnnsContext> anns() {
			return getRuleContexts(AnnsContext.class);
		}
		public AnnsContext anns(int i) {
			return getRuleContext(AnnsContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambda);
		int _la;
		try {
			int _alt;
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(T__5);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(329);
					match(KG);
					}
					break;
				}
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(332);
					data();
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(334);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(333);
								match(KG);
								}
							}

							setState(336);
							match(T__4);
							setState(338);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
							case 1:
								{
								setState(337);
								match(KG);
								}
								break;
							}
							setState(340);
							data();
							setState(342);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
							case 1:
								{
								setState(341);
								match(KG);
								}
								break;
							}
							}
							} 
						}
						setState(348);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(349);
						match(KG);
						}
					}

					setState(352);
					match(T__5);
					}
					break;
				}
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(356);
					match(KG);
					}
					break;
				}
				setState(359);
				block();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(360);
					match(KG);
					}
				}

				setState(363);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T__5);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(366);
						match(KG);
						}
						break;
					}
					setState(369);
					anns();
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(370);
						match(KG);
						}
					}

					setState(373);
					name();
					setState(389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(375);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(374);
								match(KG);
								}
							}

							setState(377);
							match(T__4);
							setState(379);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
							case 1:
								{
								setState(378);
								match(KG);
								}
								break;
							}
							setState(381);
							anns();
							setState(383);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KG) {
								{
								setState(382);
								match(KG);
								}
							}

							setState(385);
							name();
							}
							} 
						}
						setState(391);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KG) {
						{
						setState(392);
						match(KG);
						}
					}

					setState(395);
					match(T__5);
					}
					break;
				}
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(399);
					match(KG);
					}
					break;
				}
				setState(402);
				block();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KG) {
					{
					setState(403);
					match(KG);
					}
				}

				setState(406);
				match(T__11);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> KG() { return getTokens(SublimationParser.KG); }
		public TerminalNode KG(int i) {
			return getToken(SublimationParser.KG, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					stmt();
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(411);
						match(KG);
						}
						break;
					}
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InfixInvokeContext infixInvoke() {
			return getRuleContext(InfixInvokeContext.class,0);
		}
		public PrefixInvokeContext prefixInvoke() {
			return getRuleContext(PrefixInvokeContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SublimationListener ) ((SublimationListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SublimationVisitor ) return ((SublimationVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmt);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				invoke();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				expr();
				setState(422);
				infixInvoke();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				prefixInvoke();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u01ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000&\b\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002\n\u0002"+
		"\f\u0002:\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001"+
		"\u0003\u0003\u0003M\b\u0003\u0003\u0003O\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0005\u0004c\b\u0004\n\u0004\f"+
		"\u0004f\t\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004m\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004y\b\u0004\u0001\u0004\u0005\u0004|\b\u0004\n\u0004\f\u0004\u007f"+
		"\t\u0004\u0003\u0004\u0081\b\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008b\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008f\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0093\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0097\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009b\b\u0004"+
		"\u0001\u0004\u0005\u0004\u009e\b\u0004\n\u0004\f\u0004\u00a1\t\u0004\u0001"+
		"\u0004\u0003\u0004\u00a4\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00aa\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ae"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b2\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00ba\b\u0005\n\u0005\f\u0005\u00bd\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00c1\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c5\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c9\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00cd\b\u0005\u0001\u0005\u0005\u0005\u00d0\b\u0005\n\u0005"+
		"\f\u0005\u00d3\t\u0005\u0001\u0005\u0003\u0005\u00d6\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00de\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e3\b"+
		"\u0006\u0001\u0006\u0003\u0006\u00e6\b\u0006\u0001\u0006\u0003\u0006\u00e9"+
		"\b\u0006\u0001\u0007\u0003\u0007\u00ec\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00f0\b\u0007\u0005\u0007\u00f2\b\u0007\n\u0007\f\u0007\u00f5"+
		"\t\u0007\u0001\b\u0001\b\u0003\b\u00f9\b\b\u0001\t\u0001\t\u0003\t\u00fd"+
		"\b\t\u0001\t\u0001\t\u0003\t\u0101\b\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0112\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0119\b\n\n\n\f\n\u011c\t\n\u0001\n\u0001\n\u0003\n\u0120\b"+
		"\n\u0001\n\u0001\n\u0003\n\u0124\b\n\u0001\n\u0003\n\u0127\b\n\u0001\n"+
		"\u0001\n\u0003\n\u012b\b\n\u0001\n\u0001\n\u0003\n\u012f\b\n\u0001\n\u0005"+
		"\n\u0132\b\n\n\n\f\n\u0135\t\n\u0003\n\u0137\b\n\u0001\n\u0003\n\u013a"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u0143\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u014b\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u014f"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0153\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0157\b\u000e\u0005\u000e\u0159\b\u000e\n\u000e"+
		"\f\u000e\u015c\t\u000e\u0001\u000e\u0003\u000e\u015f\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0163\b\u000e\u0001\u000e\u0003\u000e\u0166\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u016a\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0170\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0174\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0178"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u017c\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0180\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0184\b\u000e\n\u000e\f\u000e\u0187\t\u000e\u0001\u000e\u0003\u000e\u018a"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u018e\b\u000e\u0001\u000e"+
		"\u0003\u000e\u0191\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0195\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0199\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u019d\b\u000f\u0005\u000f\u019f\b\u000f\n\u000f\f\u000f"+
		"\u01a2\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01aa\b\u0010\u0001\u0010\u00018\u0000\u0011"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \u0000\u0000\u01f6\u0000-\u0001\u0000\u0000\u0000\u00021"+
		"\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006N\u0001\u0000"+
		"\u0000\u0000\b\u00b1\u0001\u0000\u0000\u0000\n\u00b3\u0001\u0000\u0000"+
		"\u0000\f\u00d9\u0001\u0000\u0000\u0000\u000e\u00f3\u0001\u0000\u0000\u0000"+
		"\u0010\u00f8\u0001\u0000\u0000\u0000\u0012\u0111\u0001\u0000\u0000\u0000"+
		"\u0014\u0113\u0001\u0000\u0000\u0000\u0016\u013d\u0001\u0000\u0000\u0000"+
		"\u0018\u0142\u0001\u0000\u0000\u0000\u001a\u0144\u0001\u0000\u0000\u0000"+
		"\u001c\u0198\u0001\u0000\u0000\u0000\u001e\u01a0\u0001\u0000\u0000\u0000"+
		" \u01a9\u0001\u0000\u0000\u0000\".\u0005\u0000\u0000\u0001#%\u0003\u0002"+
		"\u0001\u0000$&\u0005\u000e\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,.\u0001\u0000"+
		"\u0000\u0000-\"\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000.\u0001"+
		"\u0001\u0000\u0000\u0000/2\u0003\u0006\u0003\u000002\u0003\n\u0005\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003\u0001\u0000"+
		"\u0000\u000038\u0005\u000f\u0000\u000045\u0005\u0001\u0000\u000057\u0005"+
		"\u000f\u0000\u000064\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0003\u000e\u0007\u0000<=\u0005"+
		"\u000f\u0000\u0000=?\u0005\u0002\u0000\u0000>@\u0005\u000e\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0003\u0010\b\u0000BO\u0001\u0000\u0000\u0000CD\u0003\u000e\u0007"+
		"\u0000DE\u0005\u000f\u0000\u0000EF\u0005\u0003\u0000\u0000FL\u0003\b\u0004"+
		"\u0000GI\u0005\u0002\u0000\u0000HJ\u0005\u000e\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0003"+
		"\u0010\b\u0000LG\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001"+
		"\u0000\u0000\u0000N;\u0001\u0000\u0000\u0000NC\u0001\u0000\u0000\u0000"+
		"O\u0007\u0001\u0000\u0000\u0000PS\u0005\u000f\u0000\u0000QR\u0005\u0001"+
		"\u0000\u0000RT\u0005\u000f\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000Tl\u0001\u0000\u0000\u0000UW\u0005\u0004\u0000\u0000"+
		"VX\u0005\u000e\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Yd\u0003\b\u0004\u0000Z\\\u0005\u000e"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]_\u0005\u0005\u0000\u0000^`\u0005\u000e\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ac\u0003\b\u0004\u0000b[\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0005\u000e\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0005\u0006\u0000\u0000km\u0001\u0000\u0000\u0000lU\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u00b2\u0001\u0000\u0000\u0000n\u0080"+
		"\u0005\u0007\u0000\u0000oq\u0005\u000e\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r}\u0003\b\u0004"+
		"\u0000su\u0005\u000e\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u0005\u0000\u0000wy\u0005"+
		"\u000e\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z|\u0003\b\u0004\u0000{t\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080p\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0084\u0005\u000e\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005\b\u0000\u0000\u0086\u0087"+
		"\u0005\u0012\u0000\u0000\u0087\u00b2\u0003\b\u0004\u0000\u0088\u008a\u0005"+
		"\u0007\u0000\u0000\u0089\u008b\u0005\u000e\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u008f\u0005\u000e"+
		"\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0005\u0005"+
		"\u0000\u0000\u0091\u0093\u0005\u000e\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u009f\u0003\b\u0004\u0000\u0095\u0097\u0005\u000e\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u0005\u0000"+
		"\u0000\u0099\u009b\u0005\u000e\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0003\b\u0004\u0000\u009d\u0096\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u000e\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\b\u0000\u0000\u00a6"+
		"\u00b2\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u0007\u0000\u0000\u00a8"+
		"\u00aa\u0005\u000e\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0003\b\u0004\u0000\u00ac\u00ae\u0005\u000e\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1P\u0001\u0000\u0000\u0000\u00b1n\u0001\u0000\u0000"+
		"\u0000\u00b1\u0088\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b2\t\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u000e\u0007\u0000"+
		"\u00b4\u00c0\u0005\u000f\u0000\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000"+
		"\u00b6\u00bb\u0003\b\u0004\u0000\u00b7\u00b8\u0005\u0005\u0000\u0000\u00b8"+
		"\u00ba\u0003\b\u0004\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0005\t\u0000\u0000\u00c3\u00c5\u0005\u000e\u0000\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00d1\u0003\u0006\u0003\u0000\u00c7\u00c9\u0005"+
		"\u000e\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005"+
		"\u0005\u0000\u0000\u00cb\u00cd\u0005\u000e\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0003\u0006\u0003\u0000\u00cf\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005"+
		"\u000e\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\n\u0000\u0000\u00d8\u000b\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000b"+
		"\u0000\u0000\u00da\u00e8\u0003\u0004\u0002\u0000\u00db\u00dd\u0005\u0007"+
		"\u0000\u0000\u00dc\u00de\u0005\u000e\u0000\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e2\u0001\u0000"+
		"\u0000\u0000\u00df\u00e3\u0005\u0010\u0000\u0000\u00e0\u00e3\u0005\u0011"+
		"\u0000\u0000\u00e1\u00e3\u0003\u0004\u0002\u0000\u00e2\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005\u000e"+
		"\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005\b\u0000"+
		"\u0000\u00e8\u00db\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\r\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005\u000e\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003\f\u0006\u0000\u00ee"+
		"\u00f0\u0005\u000e\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u000f\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f9\u0003\u0012\t\u0000\u00f7\u00f9\u0003\u0016\u000b\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u0011"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u0007\u0000\u0000\u00fb\u00fd"+
		"\u0005\u000e\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100"+
		"\u0003\u0010\b\u0000\u00ff\u0101\u0005\u000e\u0000\u0000\u0100\u00ff\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\b\u0000\u0000\u0103\u0112\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\u0010\u0000\u0000\u0105\u0112\u0003\u0018"+
		"\f\u0000\u0106\u0107\u0005\u0011\u0000\u0000\u0107\u0112\u0003\u0018\f"+
		"\u0000\u0108\u0109\u0003\u001c\u000e\u0000\u0109\u010a\u0003\u0018\f\u0000"+
		"\u010a\u0112\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0014\n\u0000\u010c"+
		"\u010d\u0003\u0018\f\u0000\u010d\u0112\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0003\u0004\u0002\u0000\u010f\u0110\u0003\u0018\f\u0000\u0110\u0112\u0001"+
		"\u0000\u0000\u0000\u0111\u00fa\u0001\u0000\u0000\u0000\u0111\u0104\u0001"+
		"\u0000\u0000\u0000\u0111\u0106\u0001\u0000\u0000\u0000\u0111\u0108\u0001"+
		"\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000\u0111\u010e\u0001"+
		"\u0000\u0000\u0000\u0112\u0013\u0001\u0000\u0000\u0000\u0113\u011f\u0003"+
		"\u0004\u0002\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u011a\u0003"+
		"\b\u0004\u0000\u0116\u0117\u0005\u0005\u0000\u0000\u0117\u0119\u0003\b"+
		"\u0004\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005\u0006\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u0114\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0005\u0007"+
		"\u0000\u0000\u0122\u0124\u0005\u000e\u0000\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0136\u0001\u0000"+
		"\u0000\u0000\u0125\u0127\u0005\u000e\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0133\u0003\u0010\b\u0000\u0129\u012b\u0005\u000e\u0000"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0005\u0005\u0000"+
		"\u0000\u012d\u012f\u0005\u000e\u0000\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u0003\u0010\b\u0000\u0131\u012a\u0001\u0000\u0000\u0000"+
		"\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0126\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\u0005\u000e\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005\b\u0000\u0000\u013c\u0015\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0003\u0004\u0002\u0000\u013e\u013f\u0003\u0010\b\u0000\u013f\u0017"+
		"\u0001\u0000\u0000\u0000\u0140\u0143\u0003\u001a\r\u0000\u0141\u0143\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0019\u0001\u0000\u0000\u0000\u0144\u0145\u0003"+
		"\u0004\u0002\u0000\u0145\u0146\u0003\u0010\b\u0000\u0146\u0147\u0003\u0018"+
		"\f\u0000\u0147\u001b\u0001\u0000\u0000\u0000\u0148\u014a\u0005\u0006\u0000"+
		"\u0000\u0149\u014b\u0005\u000e\u0000\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0162\u0001\u0000\u0000"+
		"\u0000\u014c\u015a\u0003\u0006\u0003\u0000\u014d\u014f\u0005\u000e\u0000"+
		"\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0005\u0005\u0000"+
		"\u0000\u0151\u0153\u0005\u000e\u0000\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0003\u0006\u0003\u0000\u0155\u0157\u0005\u000e\u0000"+
		"\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u014e\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015f\u0005\u000e\u0000"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0006\u0000"+
		"\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u014c\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0005\u000e\u0000\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0003\u001e\u000f\u0000\u0168\u016a\u0005\u000e\u0000"+
		"\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005\f\u0000\u0000"+
		"\u016c\u0199\u0001\u0000\u0000\u0000\u016d\u018d\u0005\u0006\u0000\u0000"+
		"\u016e\u0170\u0005\u000e\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0173\u0003\u000e\u0007\u0000\u0172\u0174\u0005\u000e\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0185\u0003\u0004\u0002\u0000"+
		"\u0176\u0178\u0005\u000e\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017b\u0005\u0005\u0000\u0000\u017a\u017c\u0005\u000e\u0000\u0000"+
		"\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0003\u000e\u0007\u0000"+
		"\u017e\u0180\u0005\u000e\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0003\u0004\u0002\u0000\u0182\u0184\u0001\u0000\u0000\u0000"+
		"\u0183\u0177\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0188\u018a\u0005\u000e\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005\u0006\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000"+
		"\u018d\u016f\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u0191\u0005\u000e\u0000\u0000"+
		"\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0003\u001e\u000f\u0000"+
		"\u0193\u0195\u0005\u000e\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0005\f\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198"+
		"\u0148\u0001\u0000\u0000\u0000\u0198\u016d\u0001\u0000\u0000\u0000\u0199"+
		"\u001d\u0001\u0000\u0000\u0000\u019a\u019c\u0003 \u0010\u0000\u019b\u019d"+
		"\u0005\u000e\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019a"+
		"\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u001f"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01aa"+
		"\u0003\u0006\u0003\u0000\u01a4\u01aa\u0003\u0014\n\u0000\u01a5\u01a6\u0003"+
		"\u0010\b\u0000\u01a6\u01a7\u0003\u001a\r\u0000\u01a7\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0003\u0016\u000b\u0000\u01a9\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a4\u0001\u0000\u0000\u0000\u01a9\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa!\u0001\u0000\u0000"+
		"\u0000S%)-18?ILNSW[_dhlptx}\u0080\u0083\u008a\u008e\u0092\u0096\u009a"+
		"\u009f\u00a3\u00a9\u00ad\u00b1\u00bb\u00c0\u00c4\u00c8\u00cc\u00d1\u00d5"+
		"\u00dd\u00e2\u00e5\u00e8\u00eb\u00ef\u00f3\u00f8\u00fc\u0100\u0111\u011a"+
		"\u011f\u0123\u0126\u012a\u012e\u0133\u0136\u0139\u0142\u014a\u014e\u0152"+
		"\u0156\u015a\u015e\u0162\u0165\u0169\u016f\u0173\u0177\u017b\u017f\u0185"+
		"\u0189\u018d\u0190\u0194\u0198\u019c\u01a0\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
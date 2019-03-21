// Generated from Micro.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
			T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
			T__31 = 32, T__32 = 33, KEYWORD = 34, IDENTIFIER = 35, WS = 36, INTLITERAL = 37, FLOATLITERAL = 38,
			STRINGLITERAL = 39, COMMENT = 40, OPERATOR = 41;
	public static final int
		RULE_authors = 0, RULE_program = 1, RULE_id = 2, RULE_pgm_body = 3, RULE_decl = 4, 
		RULE_string_decl = 5, RULE_str = 6, RULE_var_decl = 7, RULE_var_type = 8, 
		RULE_any_type = 9, RULE_id_list = 10, RULE_id_tail = 11, RULE_param_decl_list = 12, 
		RULE_param_decl = 13, RULE_param_decl_tail = 14, RULE_func_declarations = 15, 
		RULE_func_decl = 16, RULE_func_body = 17, RULE_stmt_list = 18, RULE_stmt = 19, 
		RULE_basic_stmt = 20, RULE_assign_stmt = 21, RULE_assign_expr = 22, RULE_read_stmt = 23, 
		RULE_write_stmt = 24, RULE_return_stmt = 25, RULE_if_stmt = 26, RULE_else_part = 27, 
		RULE_cond = 28, RULE_compare = 29, RULE_for_stmt = 30, RULE_init_expr = 31, 
		RULE_incr_expr = 32, RULE_expr = 33, RULE_expr_prefix = 34, RULE_term = 35, 
		RULE_factor_prefix = 36, RULE_factor = 37, RULE_primary = 38, RULE_call_expr = 39, 
		RULE_expr_list = 40, RULE_expr_list_tail = 41, RULE_addop = 42, RULE_mulop = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"authors", "program", "id", "pgm_body", "decl", "string_decl", "str", 
			"var_decl", "var_type", "any_type", "id_list", "id_tail", "param_decl_list", 
			"param_decl", "param_decl_tail", "func_declarations", "func_decl", "func_body", 
			"stmt_list", "stmt", "basic_stmt", "assign_stmt", "assign_expr", "read_stmt", 
			"write_stmt", "return_stmt", "if_stmt", "else_part", "cond", "compare", 
			"for_stmt", "init_expr", "incr_expr", "expr", "expr_prefix", "term", 
			"factor_prefix", "factor", "primary", "call_expr", "expr_list", "expr_list_tail", 
			"addop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'OSAMA ABUAMDAN'", "'SAAD JALOWDI'", "'PROGRAM'", "'BEGIN'", "'END'",
				"'STRING'", "':='", "';'", "'FLOAT'", "'INT'", "'VOID'", "','", "'FUNCTION'",
				"'('", "')'", "'READ'", "'WRITE'", "'RETURN'", "'IF'", "'ENDIF'", "'ELSE'",
				"'='", "'!='", "'<='", "'>='", "'<'", "'>'", "'FOR'", "'ENDFOR'", "'+'",
				"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, "KEYWORD",
				"IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT",
				"OPERATOR"
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
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AuthorsContext extends ParserRuleContext {
		public AuthorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authors; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitAuthors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorsContext authors() throws RecognitionException {
		AuthorsContext _localctx = new AuthorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_authors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			match(T__1);
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

	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
				match(T__2);
			setState(92);
			id();
			setState(93);
				match(T__3);
			setState(94);
			pgm_body();
			setState(95);
				match(T__4);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MicroParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
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

	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitPgm_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			decl();
			setState(100);
			func_declarations();
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_decl;
		}

		public DeclContext() {
		}

		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class StringDeclContext extends DeclContext {
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}

		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}

		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}

		public StringDeclContext(DeclContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitStringDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoDeclContext extends DeclContext {
		public NoDeclContext(DeclContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__5:
					_localctx = new StringDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				string_decl();
				setState(103);
				decl();
				}
				break;
				case T__8:
				case T__9:
					_localctx = new StringDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				var_decl();
				setState(106);
				decl();
				}
				break;
				case T__4:
				case T__12:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__27:
				case T__28:
				case IDENTIFIER:
					_localctx = new NoDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class String_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitString_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
				match(T__5);
			setState(112);
			id();
			setState(113);
				match(T__6);
			setState(114);
			str();
			setState(115);
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(MicroParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(STRINGLITERAL);
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			var_type();
			setState(120);
			id_list();
			setState(121);
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

	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_var_type; }

		public Var_typeContext() {
		}

		public void copyFrom(Var_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FloatKeyWordContext extends Var_typeContext {
		public FloatKeyWordContext(Var_typeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFloatKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__8:
					_localctx = new FloatKeyWordContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(123);
					match(T__8);
				}
				break;
				case T__9:
					_localctx = new FloatKeyWordContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(124);
					match(T__9);
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

	public static class Any_typeContext extends ParserRuleContext {
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_any_type; }

		public Any_typeContext() {
		}

		public void copyFrom(Any_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class VoidKeyWordContext extends Any_typeContext {
		public VoidKeyWordContext(Any_typeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitVoidKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FloatOrIntVarTypeContext extends Any_typeContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class, 0);
		}

		public FloatOrIntVarTypeContext(Any_typeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor)
				return ((MicroVisitor<? extends T>) visitor).visitFloatOrIntVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_any_type);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__8:
				case T__9:
					_localctx = new FloatOrIntVarTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(127);
				var_type();
				}
				break;
				case T__10:
					_localctx = new VoidKeyWordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
					setState(128);
					match(T__10);
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

	public static class Id_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(131);
			id();
				setState(132);
			id_tail();
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

	public static class Id_tailContext extends ParserRuleContext {
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_id_tail;
		}

		public Id_tailContext() {
		}

		public void copyFrom(Id_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class IDTailContext extends Id_tailContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}

		public IDTailContext(Id_tailContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitIDTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoTailContext extends Id_tailContext {
		public NoTailContext(Id_tailContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id_tail);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__11:
					_localctx = new IDTailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(134);
					match(T__11);
					setState(135);
				id();
					setState(136);
				id_tail();
				}
				break;
				case T__7:
				case T__14:
					_localctx = new NoTailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_param_decl_list;
		}

		public Param_decl_listContext() {
		}

		public void copyFrom(Param_decl_listContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NoParamListContext extends Param_decl_listContext {
		public NoParamListContext(Param_decl_listContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParamDeclListContext extends Param_decl_listContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}

		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}

		public ParamDeclListContext(Param_decl_listContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitParamDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl_list);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__8:
				case T__9:
					_localctx = new ParamDeclListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(141);
				param_decl();
					setState(142);
				param_decl_tail();
				}
				break;
				case T__14:
					_localctx = new NoParamListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(147);
			var_type();
				setState(148);
			id();
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

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_param_decl_tail;
		}

		public Param_decl_tailContext() {
		}

		public void copyFrom(Param_decl_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NoParamTailContext extends Param_decl_tailContext {
		public NoParamTailContext(Param_decl_tailContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoParamTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParamDeclTailContext extends Param_decl_tailContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}

		public ParamDeclTailContext(Param_decl_tailContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitParamDeclTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_decl_tail);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__11:
					_localctx = new ParamDeclTailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(150);
					match(T__11);
					setState(151);
				param_decl();
					setState(152);
				param_decl_tail();
				}
				break;
				case T__14:
					_localctx = new NoParamTailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_func_declarations;
		}

		public Func_declarationsContext() {
		}

		public void copyFrom(Func_declarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FuncDeclContext extends Func_declarationsContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}

		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}

		public FuncDeclContext(Func_declarationsContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoFuncDeclContext extends Func_declarationsContext {
		public NoFuncDeclContext(Func_declarationsContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_declarations);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__12:
					_localctx = new FuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(157);
				func_decl();
					setState(158);
				func_declarations();
				}
				break;
				case T__4:
					_localctx = new NoFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declContext extends ParserRuleContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
				match(T__12);
			setState(164);
				any_type();
			setState(165);
				id();
			setState(166);
				match(T__13);
			setState(167);
				param_decl_list();
			setState(168);
				match(T__14);
				setState(169);
				match(T__3);
				setState(170);
			func_body();
				setState(171);
				match(T__4);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
			decl();
				setState(174);
			stmt_list();
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

	public static class Stmt_listContext extends ParserRuleContext {
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt_list;
		}

		public Stmt_listContext() {
		}

		public void copyFrom(Stmt_listContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NoStatmnetListContext extends Stmt_listContext {
		public NoStatmnetListContext(Stmt_listContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoStatmnetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StatmnetListContext extends Stmt_listContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}

		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}

		public StatmnetListContext(Stmt_listContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitStatmnetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt_list);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__27:
				case IDENTIFIER:
					_localctx = new StatmnetListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(176);
				stmt();
					setState(177);
				stmt_list();
				}
				break;
				case T__4:
				case T__19:
				case T__20:
				case T__28:
					_localctx = new NoStatmnetListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt;
		}

		public StmtContext() {
		}

		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ForStatmentContext extends StmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class, 0);
		}

		public ForStatmentContext(StmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitForStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BasicStatmentContext extends StmtContext {
		public Basic_stmtContext basic_stmt() {
			return getRuleContext(Basic_stmtContext.class,0);
		}

		public BasicStatmentContext(StmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitBasicStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IfStatmentContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}

		public IfStatmentContext(StmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__15:
				case T__16:
				case T__17:
				case IDENTIFIER:
					_localctx = new BasicStatmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(182);
				basic_stmt();
				}
				break;
				case T__18:
					_localctx = new IfStatmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
					setState(183);
				if_stmt();
				}
				break;
				case T__27:
					_localctx = new ForStatmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
					setState(184);
				for_stmt();
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

	public static class Basic_stmtContext extends ParserRuleContext {
		public Basic_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_basic_stmt;
		}

		public Basic_stmtContext() {
		}

		public void copyFrom(Basic_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class WriteStatmentContext extends Basic_stmtContext {
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class, 0);
		}

		public WriteStatmentContext(Basic_stmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitWriteStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ReadStatmentContext extends Basic_stmtContext {
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class, 0);
		}

		public ReadStatmentContext(Basic_stmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitReadStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignStatmentContext extends Basic_stmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}

		public AssignStatmentContext(Basic_stmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitAssignStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ReturnStatmentContext extends Basic_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}

		public ReturnStatmentContext(Basic_stmtContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_stmtContext basic_stmt() throws RecognitionException {
		Basic_stmtContext _localctx = new Basic_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basic_stmt);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					_localctx = new AssignStatmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(187);
				assign_stmt();
				}
				break;
				case T__15:
					_localctx = new ReadStatmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
					setState(188);
				read_stmt();
				}
				break;
				case T__16:
					_localctx = new WriteStatmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
					setState(189);
				write_stmt();
				}
				break;
				case T__17:
					_localctx = new ReturnStatmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
					setState(190);
				return_stmt();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(193);
			assign_expr();
				setState(194);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(196);
			id();
				setState(197);
				match(T__6);
				setState(198);
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

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
				match(T__15);
			setState(201);
				match(T__13);
			setState(202);
				id_list();
				setState(203);
				match(T__14);
				setState(204);
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

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
				match(T__16);
			setState(207);
				match(T__13);
			setState(208);
				id_list();
				setState(209);
				match(T__14);
				setState(210);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(212);
				match(T__17);
				setState(213);
			expr();
				setState(214);
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

	public static class If_stmtContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
				match(T__18);
			setState(217);
				match(T__13);
			setState(218);
				cond();
			setState(219);
				match(T__14);
			setState(220);
				decl();
			setState(221);
				stmt_list();
				setState(222);
				else_part();
				setState(223);
				match(T__19);
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

	public static class Else_partContext extends ParserRuleContext {
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_else_part;
		}

		public Else_partContext() {
		}

		public void copyFrom(Else_partContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ElsePartContext extends Else_partContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}

		public ElsePartContext(Else_partContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoElsePartContext extends Else_partContext {
		public NoElsePartContext(Else_partContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_part);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__20:
					_localctx = new ElsePartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
					match(T__20);
					setState(226);
					decl();
					setState(227);
				stmt_list();
				}
				break;
				case T__19:
					_localctx = new NoElsePartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(232);
			expr();
				setState(233);
			compare();
				setState(234);
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

	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_compare; }

		public CompareContext() {
		}

		public void copyFrom(CompareContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class EqualsContext extends CompareContext {
		public EqualsContext(CompareContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LTContext extends CompareContext {
		public LTContext(CompareContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitLT(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LEContext extends CompareContext {
		public LEContext(CompareContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GTContext extends CompareContext {
		public GTContext(CompareContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitGT(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NotEqualsContext extends CompareContext {
		public NotEqualsContext(CompareContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GEContext extends CompareContext {
		public GEContext(CompareContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_compare);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__21:
					_localctx = new EqualsContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(236);
					match(T__21);
				}
				break;
				case T__22:
					_localctx = new NotEqualsContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(237);
					match(T__22);
				}
				break;
				case T__23:
					_localctx = new LEContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(238);
					match(T__23);
				}
				break;
				case T__24:
					_localctx = new GEContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(239);
					match(T__24);
				}
				break;
				case T__25:
					_localctx = new LTContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(240);
					match(T__25);
				}
				break;
				case T__26:
					_localctx = new GTContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(241);
					match(T__26);
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

	public static class For_stmtContext extends ParserRuleContext {
		public Init_exprContext init_expr() {
			return getRuleContext(Init_exprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Incr_exprContext incr_expr() {
			return getRuleContext(Incr_exprContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(244);
				match(T__27);
				setState(245);
				match(T__13);
				setState(246);
			init_expr();
				setState(247);
				match(T__7);
				setState(248);
			cond();
				setState(249);
				match(T__7);
				setState(250);
			incr_expr();
				setState(251);
				match(T__14);
				setState(252);
			decl();
				setState(253);
			stmt_list();
				setState(254);
				match(T__28);
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

	public static class Init_exprContext extends ParserRuleContext {
		public Init_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_init_expr; }

		public Init_exprContext() {
		}

		public void copyFrom(Init_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class InitAssignExprContext extends Init_exprContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class, 0);
		}

		public InitAssignExprContext(Init_exprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitInitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoInitAssignExprContext extends Init_exprContext {
		public NoInitAssignExprContext(Init_exprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor)
				return ((MicroVisitor<? extends T>) visitor).visitNoInitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_exprContext init_expr() throws RecognitionException {
		Init_exprContext _localctx = new Init_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_init_expr);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new InitAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(256);
				assign_expr();
				}
				break;
				case T__7:
					_localctx = new NoInitAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Incr_exprContext extends ParserRuleContext {
		public Incr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_incr_expr; }

		public Incr_exprContext() {
		}

		public void copyFrom(Incr_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class IncrAssignExprContext extends Incr_exprContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class, 0);
		}

		public IncrAssignExprContext(Incr_exprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitIncrAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoIncrAssignExprContext extends Incr_exprContext {
		public NoIncrAssignExprContext(Incr_exprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor)
				return ((MicroVisitor<? extends T>) visitor).visitNoIncrAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incr_exprContext incr_expr() throws RecognitionException {
		Incr_exprContext _localctx = new Incr_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_incr_expr);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IncrAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(260);
				assign_expr();
				}
				break;
				case T__14:
					_localctx = new NoIncrAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(264);
			expr_prefix(0);
				setState(265);
			term();
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

	public static class Expr_prefixContext extends ParserRuleContext {
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr_prefix;
		}

		public Expr_prefixContext() {
		}

		public void copyFrom(Expr_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ExprPrefixContext extends Expr_prefixContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}

		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}

		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}

		public ExprPrefixContext(Expr_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitExprPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoExprPrefixContext extends Expr_prefixContext {
		public NoExprPrefixContext(Expr_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoExprPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		return expr_prefix(0);
	}

	private Expr_prefixContext expr_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, _parentState);
		Expr_prefixContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expr_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
				_localctx = new NoExprPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
				setState(274);
			_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
						_localctx = new ExprPrefixContext(new Expr_prefixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_prefix);
						setState(268);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(269);
					term();
						setState(270);
					addop();
					}
					} 
				}
					setState(276);
				_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(277);
			factor_prefix(0);
				setState(278);
			factor();
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

	public static class Factor_prefixContext extends ParserRuleContext {
		public Factor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_factor_prefix;
		}

		public Factor_prefixContext() {
		}

		public void copyFrom(Factor_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FactorPrefixContext extends Factor_prefixContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}

		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}

		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}

		public FactorPrefixContext(Factor_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFactorPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoFactorPrefixContext extends Factor_prefixContext {
		public NoFactorPrefixContext(Factor_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoFactorPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_prefixContext factor_prefix() throws RecognitionException {
		return factor_prefix(0);
	}

	private Factor_prefixContext factor_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_prefixContext _localctx = new Factor_prefixContext(_ctx, _parentState);
		Factor_prefixContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_factor_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
				_localctx = new NoFactorPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
				setState(287);
			_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
						_localctx = new FactorPrefixContext(new Factor_prefixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_factor_prefix);
						setState(281);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
					factor();
						setState(283);
					mulop();
					}
					} 
				}
					setState(289);
				_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_factor; }

		public FactorContext() {
		}

		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class CallExprContext extends FactorContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class, 0);
		}

		public CallExprContext(FactorContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class PrimaryFactorContext extends FactorContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public PrimaryFactorContext(FactorContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitPrimaryFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
			case 1:
				_localctx = new PrimaryFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(290);
				primary();
				}
				break;
			case 2:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
					setState(291);
				call_expr();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		public PrimaryContext() {
		}

		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class IdLabelContext extends PrimaryContext {
		public IdContext id() {
			return getRuleContext(IdContext.class, 0);
		}

		public IdLabelContext(PrimaryContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitIdLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExprLabelContext extends PrimaryContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public ExprLabelContext(PrimaryContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitExprLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FloatLitContext extends PrimaryContext {
		public TerminalNode FLOATLITERAL() {
			return getToken(MicroParser.FLOATLITERAL, 0);
		}

		public FloatLitContext(PrimaryContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitFloatLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IntLitContext extends PrimaryContext {
		public TerminalNode INTLITERAL() { return getToken(MicroParser.INTLITERAL, 0); }

		public IntLitContext(PrimaryContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primary);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__13:
					_localctx = new ExprLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(294);
					match(T__13);
					setState(295);
				expr();
					setState(296);
					match(T__14);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
					setState(298);
				id();
				}
				break;
			case INTLITERAL:
				_localctx = new IntLitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
					setState(299);
				match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				_localctx = new FloatLitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
					setState(300);
				match(FLOATLITERAL);
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

	public static class Call_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(303);
			id();
				setState(304);
				match(T__13);
				setState(305);
			expr_list();
				setState(306);
				match(T__14);
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

	public static class Expr_listContext extends ParserRuleContext {
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr_list;
		}

		public Expr_listContext() {
		}

		public void copyFrom(Expr_listContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ExprListContext extends Expr_listContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}

		public ExprListContext(Expr_listContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NoExprListContext extends Expr_listContext {
		public NoExprListContext(Expr_listContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_list);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
			case 1:
				_localctx = new ExprListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(308);
				expr();
					setState(309);
				expr_list_tail();
				}
				break;
			case 2:
				_localctx = new NoExprListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr_list_tail;
		}

		public Expr_list_tailContext() {
		}

		public void copyFrom(Expr_list_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NoExprTailContext extends Expr_list_tailContext {
		public NoExprTailContext(Expr_list_tailContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitNoExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExprTailContext extends Expr_list_tailContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}

		public ExprTailContext(Expr_list_tailContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr_list_tail);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__11:
					_localctx = new ExprTailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(314);
					match(T__11);
					setState(315);
				expr();
					setState(316);
				expr_list_tail();
				}
				break;
				case T__14:
					_localctx = new NoExprTailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_addop; }

		public AddopContext() {
		}

		public void copyFrom(AddopContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class PlusContext extends AddopContext {
		public PlusContext(AddopContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusContext extends AddopContext {
		public MinusContext(AddopContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_addop);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__29:
					_localctx = new PlusContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(321);
					match(T__29);
				}
				break;
				case T__30:
					_localctx = new MinusContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(322);
					match(T__30);
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_mulop; }

		public MulopContext() {
		}

		public void copyFrom(MulopContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class DivContext extends MulopContext {
		public DivContext(MulopContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MulContext extends MulopContext {
		public MulContext(MulopContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MicroVisitor) return ((MicroVisitor<? extends T>) visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mulop);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__31:
					_localctx = new MulContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(325);
					match(T__31);
				}
				break;
				case T__32:
					_localctx = new DivContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(326);
					match(T__32);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expr_prefix_sempred((Expr_prefixContext)_localctx, predIndex);
		case 36:
			return factor_prefix_sempred((Factor_prefixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_prefix_sempred(Expr_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor_prefix_sempred(Factor_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u014c\4\2\t\2\4" +
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
					"\3\t\3\t\3\t\3\n\3\n\5\n\u0080\n\n\3\13\3\13\5\13\u0084\n\13\3\f\3\f\3" +
					"\f\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3\16\3\16\3\16\5\16\u0094\n" +
					"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u009e\n\20\3\21\3\21" +
					"\3\21\3\21\5\21\u00a4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
					"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00b7\n\24\3\25\3\25\3\25" +
					"\5\25\u00bc\n\25\3\26\3\26\3\26\3\26\5\26\u00c2\n\26\3\27\3\27\3\27\3" +
					"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3" +
					"\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
					"\34\3\35\3\35\3\35\3\35\3\35\5\35\u00e9\n\35\3\36\3\36\3\36\3\36\3\37" +
					"\3\37\3\37\3\37\3\37\3\37\5\37\u00f5\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3" +
					" \3 \3 \3!\3!\5!\u0105\n!\3\"\3\"\5\"\u0109\n\"\3#\3#\3#\3$\3$\3$\3$\3" +
					"$\7$\u0113\n$\f$\16$\u0116\13$\3%\3%\3%\3&\3&\3&\3&\3&\7&\u0120\n&\f&" +
					"\16&\u0123\13&\3\'\3\'\5\'\u0127\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u0130\n(" +
					"\3)\3)\3)\3)\3)\3*\3*\3*\3*\5*\u013b\n*\3+\3+\3+\3+\3+\5+\u0142\n+\3," +
					"\3,\5,\u0146\n,\3-\3-\5-\u014a\n-\3-\2\4FJ.\2\4\6\b\n\f\16\20\22\24\26" +
					"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\2\2\u013f\2Z\3\2" +
					"\2\2\4]\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16w\3\2\2" +
					"\2\20y\3\2\2\2\22\177\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u008d" +
					"\3\2\2\2\32\u0093\3\2\2\2\34\u0095\3\2\2\2\36\u009d\3\2\2\2 \u00a3\3\2" +
					"\2\2\"\u00a5\3\2\2\2$\u00af\3\2\2\2&\u00b6\3\2\2\2(\u00bb\3\2\2\2*\u00c1" +
					"\3\2\2\2,\u00c3\3\2\2\2.\u00c6\3\2\2\2\60\u00ca\3\2\2\2\62\u00d0\3\2\2" +
					"\2\64\u00d6\3\2\2\2\66\u00da\3\2\2\28\u00e8\3\2\2\2:\u00ea\3\2\2\2<\u00f4" +
					"\3\2\2\2>\u00f6\3\2\2\2@\u0104\3\2\2\2B\u0108\3\2\2\2D\u010a\3\2\2\2F" +
					"\u010d\3\2\2\2H\u0117\3\2\2\2J\u011a\3\2\2\2L\u0126\3\2\2\2N\u012f\3\2" +
					"\2\2P\u0131\3\2\2\2R\u013a\3\2\2\2T\u0141\3\2\2\2V\u0145\3\2\2\2X\u0149" +
					"\3\2\2\2Z[\7\3\2\2[\\\7\4\2\2\\\3\3\2\2\2]^\7\5\2\2^_\5\6\4\2_`\7\6\2" +
					"\2`a\5\b\5\2ab\7\7\2\2b\5\3\2\2\2cd\7%\2\2d\7\3\2\2\2ef\5\n\6\2fg\5 \21" +
					"\2g\t\3\2\2\2hi\5\f\7\2ij\5\n\6\2jp\3\2\2\2kl\5\20\t\2lm\5\n\6\2mp\3\2" +
					"\2\2np\3\2\2\2oh\3\2\2\2ok\3\2\2\2on\3\2\2\2p\13\3\2\2\2qr\7\b\2\2rs\5" +
					"\6\4\2st\7\t\2\2tu\5\16\b\2uv\7\n\2\2v\r\3\2\2\2wx\7)\2\2x\17\3\2\2\2" +
					"yz\5\22\n\2z{\5\26\f\2{|\7\n\2\2|\21\3\2\2\2}\u0080\7\13\2\2~\u0080\7" +
					"\f\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\23\3\2\2\2\u0081\u0084\5\22\n\2" +
					"\u0082\u0084\7\r\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\25" +
					"\3\2\2\2\u0085\u0086\5\6\4\2\u0086\u0087\5\30\r\2\u0087\27\3\2\2\2\u0088" +
					"\u0089\7\16\2\2\u0089\u008a\5\6\4\2\u008a\u008b\5\30\r\2\u008b\u008e\3" +
					"\2\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u008c\3\2\2\2\u008e" +
					"\31\3\2\2\2\u008f\u0090\5\34\17\2\u0090\u0091\5\36\20\2\u0091\u0094\3" +
					"\2\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094" +
					"\33\3\2\2\2\u0095\u0096\5\22\n\2\u0096\u0097\5\6\4\2\u0097\35\3\2\2\2" +
					"\u0098\u0099\7\16\2\2\u0099\u009a\5\34\17\2\u009a\u009b\5\36\20\2\u009b" +
					"\u009e\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009c\3\2" +
					"\2\2\u009e\37\3\2\2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\5 \21\2\u00a1\u00a4" +
					"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4" +
					"!\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\5\6\4" +
					"\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\21\2\2\u00ab" +
					"\u00ac\7\6\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\7\2\2\u00ae#\3\2\2\2" +
					"\u00af\u00b0\5\n\6\2\u00b0\u00b1\5&\24\2\u00b1%\3\2\2\2\u00b2\u00b3\5" +
					"(\25\2\u00b3\u00b4\5&\24\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6" +
					"\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\'\3\2\2\2\u00b8\u00bc\5*\26\2" +
					"\u00b9\u00bc\5\66\34\2\u00ba\u00bc\5> \2\u00bb\u00b8\3\2\2\2\u00bb\u00b9" +
					"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc)\3\2\2\2\u00bd\u00c2\5,\27\2\u00be" +
					"\u00c2\5\60\31\2\u00bf\u00c2\5\62\32\2\u00c0\u00c2\5\64\33\2\u00c1\u00bd" +
					"\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2" +
					"+\3\2\2\2\u00c3\u00c4\5.\30\2\u00c4\u00c5\7\n\2\2\u00c5-\3\2\2\2\u00c6" +
					"\u00c7\5\6\4\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\5D#\2\u00c9/\3\2\2\2\u00ca" +
					"\u00cb\7\22\2\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce" +
					"\7\21\2\2\u00ce\u00cf\7\n\2\2\u00cf\61\3\2\2\2\u00d0\u00d1\7\23\2\2\u00d1" +
					"\u00d2\7\20\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5" +
					"\7\n\2\2\u00d5\63\3\2\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\5D#\2\u00d8" +
					"\u00d9\7\n\2\2\u00d9\65\3\2\2\2\u00da\u00db\7\25\2\2\u00db\u00dc\7\20" +
					"\2\2\u00dc\u00dd\5:\36\2\u00dd\u00de\7\21\2\2\u00de\u00df\5\n\6\2\u00df" +
					"\u00e0\5&\24\2\u00e0\u00e1\58\35\2\u00e1\u00e2\7\26\2\2\u00e2\67\3\2\2" +
					"\2\u00e3\u00e4\7\27\2\2\u00e4\u00e5\5\n\6\2\u00e5\u00e6\5&\24\2\u00e6" +
					"\u00e9\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e7\3\2" +
					"\2\2\u00e99\3\2\2\2\u00ea\u00eb\5D#\2\u00eb\u00ec\5<\37\2\u00ec\u00ed" +
					"\5D#\2\u00ed;\3\2\2\2\u00ee\u00f5\7\30\2\2\u00ef\u00f5\7\31\2\2\u00f0" +
					"\u00f5\7\32\2\2\u00f1\u00f5\7\33\2\2\u00f2\u00f5\7\34\2\2\u00f3\u00f5" +
					"\7\35\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2" +
					"\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5=\3" +
					"\2\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\7\20\2\2\u00f8\u00f9\5@!\2\u00f9" +
					"\u00fa\7\n\2\2\u00fa\u00fb\5:\36\2\u00fb\u00fc\7\n\2\2\u00fc\u00fd\5B" +
					"\"\2\u00fd\u00fe\7\21\2\2\u00fe\u00ff\5\n\6\2\u00ff\u0100\5&\24\2\u0100" +
					"\u0101\7\37\2\2\u0101?\3\2\2\2\u0102\u0105\5.\30\2\u0103\u0105\3\2\2\2" +
					"\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105A\3\2\2\2\u0106\u0109\5" +
					".\30\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109" +
					"C\3\2\2\2\u010a\u010b\5F$\2\u010b\u010c\5H%\2\u010cE\3\2\2\2\u010d\u0114" +
					"\b$\1\2\u010e\u010f\f\4\2\2\u010f\u0110\5H%\2\u0110\u0111\5V,\2\u0111" +
					"\u0113\3\2\2\2\u0112\u010e\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2" +
					"\2\2\u0114\u0115\3\2\2\2\u0115G\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118" +
					"\5J&\2\u0118\u0119\5L\'\2\u0119I\3\2\2\2\u011a\u0121\b&\1\2\u011b\u011c" +
					"\f\4\2\2\u011c\u011d\5L\'\2\u011d\u011e\5X-\2\u011e\u0120\3\2\2\2\u011f" +
					"\u011b\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2" +
					"\2\2\u0122K\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\5N(\2\u0125\u0127" +
					"\5P)\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127M\3\2\2\2\u0128\u0129" +
					"\7\20\2\2\u0129\u012a\5D#\2\u012a\u012b\7\21\2\2\u012b\u0130\3\2\2\2\u012c" +
					"\u0130\5\6\4\2\u012d\u0130\7\'\2\2\u012e\u0130\7(\2\2\u012f\u0128\3\2" +
					"\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130" +
					"O\3\2\2\2\u0131\u0132\5\6\4\2\u0132\u0133\7\20\2\2\u0133\u0134\5R*\2\u0134" +
					"\u0135\7\21\2\2\u0135Q\3\2\2\2\u0136\u0137\5D#\2\u0137\u0138\5T+\2\u0138" +
					"\u013b\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0139\3\2" +
					"\2\2\u013bS\3\2\2\2\u013c\u013d\7\16\2\2\u013d\u013e\5D#\2\u013e\u013f" +
					"\5T+\2\u013f\u0142\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013c\3\2\2\2\u0141" +
					"\u0140\3\2\2\2\u0142U\3\2\2\2\u0143\u0146\7 \2\2\u0144\u0146\7!\2\2\u0145" +
					"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146W\3\2\2\2\u0147\u014a\7\"\2\2" +
					"\u0148\u014a\7#\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014aY\3\2" +
					"\2\2\30o\177\u0083\u008d\u0093\u009d\u00a3\u00b6\u00bb\u00c1\u00e8\u00f4" +
					"\u0104\u0108\u0114\u0121\u0126\u012f\u013a\u0141\u0145\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
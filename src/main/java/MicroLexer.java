// Generated from Micro.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, KEYWORD=3, IDENTIFIER=4, WS=5, INTLITERAL=6, FLOATLITERAL=7, 
		STRINGLITERAL=8, COMMENT=9, OPERATOR=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "KEYWORD", "IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'OSAMA ABUAMDAN'", "'SAAD JALOWDI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "KEYWORD", "IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT", "OPERATOR"
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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u0080\n\4\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087\13\5\3\6\6\6\u008a"+
		"\n\6\r\6\16\6\u008b\3\6\3\6\3\7\3\7\3\7\7\7\u0093\n\7\f\7\16\7\u0096\13"+
		"\7\5\7\u0098\n\7\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\5\b\u00a2"+
		"\n\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\5\b\u00ad\n\b\3"+
		"\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00bc"+
		"\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00cf\n\13\4\u00b2\u00bd\2\f\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\2\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5&\3\2\2\2\7\177\3\2\2\2\t"+
		"\u0081\3\2\2\2\13\u0089\3\2\2\2\r\u0097\3\2\2\2\17\u00a1\3\2\2\2\21\u00ae"+
		"\3\2\2\2\23\u00b7\3\2\2\2\25\u00ce\3\2\2\2\27\30\7Q\2\2\30\31\7U\2\2\31"+
		"\32\7C\2\2\32\33\7O\2\2\33\34\7C\2\2\34\35\7\"\2\2\35\36\7C\2\2\36\37"+
		"\7D\2\2\37 \7W\2\2 !\7C\2\2!\"\7O\2\2\"#\7F\2\2#$\7C\2\2$%\7P\2\2%\4\3"+
		"\2\2\2&\'\7U\2\2\'(\7C\2\2()\7C\2\2)*\7F\2\2*+\7\"\2\2+,\7L\2\2,-\7C\2"+
		"\2-.\7N\2\2./\7Q\2\2/\60\7Y\2\2\60\61\7F\2\2\61\62\7K\2\2\62\6\3\2\2\2"+
		"\63\64\7R\2\2\64\65\7T\2\2\65\66\7Q\2\2\66\67\7I\2\2\678\7T\2\289\7C\2"+
		"\29\u0080\7O\2\2:;\7D\2\2;<\7G\2\2<=\7I\2\2=>\7K\2\2>\u0080\7P\2\2?@\7"+
		"G\2\2@A\7P\2\2A\u0080\7F\2\2BC\7H\2\2CD\7W\2\2DE\7P\2\2EF\7E\2\2FG\7V"+
		"\2\2GH\7K\2\2HI\7Q\2\2I\u0080\7P\2\2JK\7T\2\2KL\7G\2\2LM\7C\2\2M\u0080"+
		"\7F\2\2NO\7Y\2\2OP\7T\2\2PQ\7K\2\2QR\7V\2\2R\u0080\7G\2\2ST\7K\2\2T\u0080"+
		"\7H\2\2UV\7G\2\2VW\7N\2\2WX\7U\2\2X\u0080\7G\2\2YZ\7G\2\2Z[\7P\2\2[\\"+
		"\7F\2\2\\]\7K\2\2]\u0080\7H\2\2^_\7H\2\2_`\7Q\2\2`\u0080\7T\2\2ab\7G\2"+
		"\2bc\7P\2\2cd\7F\2\2de\7H\2\2ef\7Q\2\2f\u0080\7T\2\2gh\7T\2\2hi\7G\2\2"+
		"ij\7V\2\2jk\7W\2\2kl\7T\2\2l\u0080\7P\2\2mn\7K\2\2no\7P\2\2o\u0080\7V"+
		"\2\2pq\7X\2\2qr\7Q\2\2rs\7K\2\2s\u0080\7F\2\2tu\7U\2\2uv\7V\2\2vw\7T\2"+
		"\2wx\7K\2\2xy\7P\2\2y\u0080\7I\2\2z{\7H\2\2{|\7N\2\2|}\7Q\2\2}~\7C\2\2"+
		"~\u0080\7V\2\2\177\63\3\2\2\2\177:\3\2\2\2\177?\3\2\2\2\177B\3\2\2\2\177"+
		"J\3\2\2\2\177N\3\2\2\2\177S\3\2\2\2\177U\3\2\2\2\177Y\3\2\2\2\177^\3\2"+
		"\2\2\177a\3\2\2\2\177g\3\2\2\2\177m\3\2\2\2\177p\3\2\2\2\177t\3\2\2\2"+
		"\177z\3\2\2\2\u0080\b\3\2\2\2\u0081\u0085\t\2\2\2\u0082\u0084\t\3\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\n\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\t\4\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\6\2\2\u008e\f\3\2\2\2\u008f\u0098"+
		"\7\62\2\2\u0090\u0094\4\63;\2\u0091\u0093\4\62;\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0098"+
		"\16\3\2\2\2\u0099\u00a2\7\62\2\2\u009a\u009e\4\63;\2\u009b\u009d\4\62"+
		";\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0099\3\2"+
		"\2\2\u00a1\u009a\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ac\13\2\2\2\u00a4"+
		"\u00ad\7\62\2\2\u00a5\u00a7\4\62;\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\4\63;\2\u00ac\u00a4\3\2\2\2\u00ac\u00a8\3\2"+
		"\2\2\u00ad\20\3\2\2\2\u00ae\u00b2\7$\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\22\3\2\2\2"+
		"\u00b7\u00b8\7/\2\2\u00b8\u00b9\7/\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc"+
		"\13\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\n\2\2\u00c3\24\3\2\2\2\u00c4"+
		"\u00c5\7<\2\2\u00c5\u00cf\7?\2\2\u00c6\u00cf\t\5\2\2\u00c7\u00c8\7#\2"+
		"\2\u00c8\u00cf\7?\2\2\u00c9\u00cf\t\6\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cf"+
		"\7?\2\2\u00cc\u00cd\7@\2\2\u00cd\u00cf\7?\2\2\u00ce\u00c4\3\2\2\2\u00ce"+
		"\u00c6\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\26\3\2\2\2\17\2\177\u0085\u008b\u0094\u0097"+
		"\u009e\u00a1\u00a8\u00ac\u00b2\u00bd\u00ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
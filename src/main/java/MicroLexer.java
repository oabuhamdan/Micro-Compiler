// Generated from Micro.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

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
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00cf\b\1\4\2\t"+
					"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
					"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
					"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
					"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
					"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
					"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
					"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
					"\4\3\4\5\4\u0081\n\4\3\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\6\6\6"+
					"\u008b\n\6\r\6\16\6\u008c\3\6\3\6\3\7\3\7\3\7\7\7\u0094\n\7\f\7\16\7\u0097"+
					"\13\7\5\7\u0099\n\7\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\5\b"+
					"\u00a3\n\b\3\b\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab\13\b\3\b\5\b\u00ae"+
					"\n\b\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
					"\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
					"\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\4\u00b3\u00be\2\f\3\3\5\4\7\5"+
					"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13"+
					"\f\17\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\2\u00ec\2\3\3\2\2\2\2\5\3\2\2"+
					"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
					"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5&\3\2\2\2\7\u0080\3\2"+
					"\2\2\t\u0082\3\2\2\2\13\u008a\3\2\2\2\r\u0098\3\2\2\2\17\u00a2\3\2\2\2"+
					"\21\u00af\3\2\2\2\23\u00b8\3\2\2\2\25\u00cd\3\2\2\2\27\30\7Q\2\2\30\31"+
					"\7U\2\2\31\32\7C\2\2\32\33\7O\2\2\33\34\7C\2\2\34\35\7\"\2\2\35\36\7C"+
					"\2\2\36\37\7D\2\2\37 \7W\2\2 !\7C\2\2!\"\7O\2\2\"#\7F\2\2#$\7C\2\2$%\7"+
					"P\2\2%\4\3\2\2\2&\'\7U\2\2\'(\7C\2\2()\7C\2\2)*\7F\2\2*+\7\"\2\2+,\7L"+
					"\2\2,-\7C\2\2-.\7N\2\2./\7Q\2\2/\60\7Y\2\2\60\61\7F\2\2\61\62\7K\2\2\62"+
					"\6\3\2\2\2\63\64\7R\2\2\64\65\7T\2\2\65\66\7Q\2\2\66\67\7I\2\2\678\7T"+
					"\2\289\7C\2\29:\7O\2\2:\u0081\7\63\2\2;<\7D\2\2<=\7G\2\2=>\7I\2\2>?\7"+
					"K\2\2?\u0081\7P\2\2@A\7G\2\2AB\7P\2\2B\u0081\7F\2\2CD\7H\2\2DE\7W\2\2"+
					"EF\7P\2\2FG\7E\2\2GH\7V\2\2HI\7K\2\2IJ\7Q\2\2J\u0081\7P\2\2KL\7T\2\2L"+
					"M\7G\2\2MN\7C\2\2N\u0081\7F\2\2OP\7Y\2\2PQ\7T\2\2QR\7K\2\2RS\7V\2\2S\u0081"+
					"\7G\2\2TU\7K\2\2U\u0081\7H\2\2VW\7G\2\2WX\7N\2\2XY\7U\2\2Y\u0081\7G\2"+
					"\2Z[\7G\2\2[\\\7P\2\2\\]\7F\2\2]^\7K\2\2^\u0081\7H\2\2_`\7H\2\2`a\7Q\2"+
					"\2a\u0081\7T\2\2bc\7G\2\2cd\7P\2\2de\7F\2\2ef\7H\2\2fg\7Q\2\2g\u0081\7"+
					"T\2\2hi\7T\2\2ij\7G\2\2jk\7V\2\2kl\7W\2\2lm\7T\2\2m\u0081\7P\2\2no\7K"+
					"\2\2op\7P\2\2p\u0081\7V\2\2qr\7X\2\2rs\7Q\2\2st\7K\2\2t\u0081\7F\2\2u"+
					"v\7U\2\2vw\7V\2\2wx\7T\2\2xy\7K\2\2yz\7P\2\2z\u0081\7I\2\2{|\7H\2\2|}"+
					"\7N\2\2}~\7Q\2\2~\177\7C\2\2\177\u0081\7V\2\2\u0080\63\3\2\2\2\u0080;"+
					"\3\2\2\2\u0080@\3\2\2\2\u0080C\3\2\2\2\u0080K\3\2\2\2\u0080O\3\2\2\2\u0080"+
					"T\3\2\2\2\u0080V\3\2\2\2\u0080Z\3\2\2\2\u0080_\3\2\2\2\u0080b\3\2\2\2"+
					"\u0080h\3\2\2\2\u0080n\3\2\2\2\u0080q\3\2\2\2\u0080u\3\2\2\2\u0080{\3"+
					"\2\2\2\u0081\b\3\2\2\2\u0082\u0086\t\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083"+
					"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
					"\n\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\t\4\2\2\u008a\u0089\3\2\2\2"+
					"\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
					"\3\2\2\2\u008e\u008f\b\6\2\2\u008f\f\3\2\2\2\u0090\u0099\7\62\2\2\u0091"+
					"\u0095\4\63;\2\u0092\u0094\4\62;\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
					"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
					"\u0095\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0099\16\3\2\2"+
					"\2\u009a\u00a3\7\62\2\2\u009b\u009f\4\63;\2\u009c\u009e\4\62;\2\u009d"+
					"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
					"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
					"\u009b\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ad\13\2\2\2\u00a5\u00ae\7"+
					"\62\2\2\u00a6\u00a8\4\62;\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
					"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
					"\2\2\u00ac\u00ae\4\63;\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae"+
					"\20\3\2\2\2\u00af\u00b3\7$\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2"+
					"\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6"+
					"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7\22\3\2\2\2\u00b8"+
					"\u00b9\7/\2\2\u00b9\u00ba\7/\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\13\2"+
					"\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be"+
					"\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\f"+
					"\2\2\u00c2\24\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4\u00ce\7?\2\2\u00c5\u00ce"+
					"\t\5\2\2\u00c6\u00c7\7#\2\2\u00c7\u00ce\7?\2\2\u00c8\u00ce\t\6\2\2\u00c9"+
					"\u00ca\7>\2\2\u00ca\u00ce\7?\2\2\u00cb\u00cc\7@\2\2\u00cc\u00ce\7?\2\2"+
					"\u00cd\u00c3\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c8"+
					"\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\26\3\2\2\2\17\2"+
					"\u0080\u0086\u008c\u0095\u0098\u009f\u00a2\u00a9\u00ad\u00b3\u00be\u00cd"+
					"\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
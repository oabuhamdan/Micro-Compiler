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
		T__0=1, KEYWORD=2, IDENTIFIER=3, WS=4, INTLITERAL=5, FLOATLITERAL=6, STRINGLITERAL=7, 
		COMMENT=8, OPERATOR=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "KEYWORD", "IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'OSAMA ABUAMDAN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "KEYWORD", "IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3q\n\3\3\4\3\4\7\4u\n\4\f\4\16\4x\13\4\3\5\6\5{\n\5\r\5"+
		"\16\5|\3\5\3\5\3\6\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\5\6\u0089"+
		"\n\6\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\5\7\u0093\n\7\3\7\3"+
		"\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\7\5\7\u009e\n\7\3\b\3\b\7\b"+
		"\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f"+
		"\t\16\t\u00b0\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00be\n\n\4\u00a3\u00ae\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+"+
		"..=>@@\2\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2"+
		"\5p\3\2\2\2\7r\3\2\2\2\tz\3\2\2\2\13\u0088\3\2\2\2\r\u0092\3\2\2\2\17"+
		"\u009f\3\2\2\2\21\u00a8\3\2\2\2\23\u00bd\3\2\2\2\25\26\7Q\2\2\26\27\7"+
		"U\2\2\27\30\7C\2\2\30\31\7O\2\2\31\32\7C\2\2\32\33\7\"\2\2\33\34\7C\2"+
		"\2\34\35\7D\2\2\35\36\7W\2\2\36\37\7C\2\2\37 \7O\2\2 !\7F\2\2!\"\7C\2"+
		"\2\"#\7P\2\2#\4\3\2\2\2$%\7R\2\2%&\7T\2\2&\'\7Q\2\2\'(\7I\2\2()\7T\2\2"+
		")*\7C\2\2*q\7O\2\2+,\7D\2\2,-\7G\2\2-.\7I\2\2./\7K\2\2/q\7P\2\2\60\61"+
		"\7G\2\2\61\62\7P\2\2\62q\7F\2\2\63\64\7H\2\2\64\65\7W\2\2\65\66\7P\2\2"+
		"\66\67\7E\2\2\678\7V\2\289\7K\2\29:\7Q\2\2:q\7P\2\2;<\7T\2\2<=\7G\2\2"+
		"=>\7C\2\2>q\7F\2\2?@\7Y\2\2@A\7T\2\2AB\7K\2\2BC\7V\2\2Cq\7G\2\2DE\7K\2"+
		"\2Eq\7H\2\2FG\7G\2\2GH\7N\2\2HI\7U\2\2Iq\7G\2\2JK\7G\2\2KL\7P\2\2LM\7"+
		"F\2\2MN\7K\2\2Nq\7H\2\2OP\7H\2\2PQ\7Q\2\2Qq\7T\2\2RS\7G\2\2ST\7P\2\2T"+
		"U\7F\2\2UV\7H\2\2VW\7Q\2\2Wq\7T\2\2XY\7T\2\2YZ\7G\2\2Z[\7V\2\2[\\\7W\2"+
		"\2\\]\7T\2\2]q\7P\2\2^_\7K\2\2_`\7P\2\2`q\7V\2\2ab\7X\2\2bc\7Q\2\2cd\7"+
		"K\2\2dq\7F\2\2ef\7U\2\2fg\7V\2\2gh\7T\2\2hi\7K\2\2ij\7P\2\2jq\7I\2\2k"+
		"l\7H\2\2lm\7N\2\2mn\7Q\2\2no\7C\2\2oq\7V\2\2p$\3\2\2\2p+\3\2\2\2p\60\3"+
		"\2\2\2p\63\3\2\2\2p;\3\2\2\2p?\3\2\2\2pD\3\2\2\2pF\3\2\2\2pJ\3\2\2\2p"+
		"O\3\2\2\2pR\3\2\2\2pX\3\2\2\2p^\3\2\2\2pa\3\2\2\2pe\3\2\2\2pk\3\2\2\2"+
		"q\6\3\2\2\2rv\t\2\2\2su\t\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w\b\3\2\2\2xv\3\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}~\3\2\2\2~\177\b\5\2\2\177\n\3\2\2\2\u0080\u0089\7\62\2\2\u0081\u0085"+
		"\4\63;\2\u0082\u0084\4\62;\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0080\3\2\2\2\u0088\u0081\3\2\2\2\u0089\f\3\2\2\2\u008a\u0093"+
		"\7\62\2\2\u008b\u008f\4\63;\2\u008c\u008e\4\62;\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u009d\13\2\2\2\u0095\u009e\7\62\2\2\u0096\u0098\4"+
		"\62;\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\4\63"+
		";\2\u009d\u0095\3\2\2\2\u009d\u0099\3\2\2\2\u009e\16\3\2\2\2\u009f\u00a3"+
		"\7$\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7$\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\22\3\2\2\2\u00b3\u00b4"+
		"\7<\2\2\u00b4\u00be\7?\2\2\u00b5\u00be\t\5\2\2\u00b6\u00b7\7#\2\2\u00b7"+
		"\u00be\7?\2\2\u00b8\u00be\t\6\2\2\u00b9\u00ba\7>\2\2\u00ba\u00be\7?\2"+
		"\2\u00bb\u00bc\7@\2\2\u00bc\u00be\7?\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b5"+
		"\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\24\3\2\2\2\17\2pv|\u0085\u0088\u008f\u0092\u0099"+
		"\u009d\u00a3\u00ae\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		IDENTIFIER=1, WS=2, INTLITERAL=3, FLOATLITERAL=4, STRINGLITERAL=5, COMMENT=6, 
		KEYWORD=7, OPERATOR=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
			"KEYWORD", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
			"COMMENT", "KEYWORD", "OPERATOR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u009f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\25"+
		"\n\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3"+
		"\3\3\4\3\4\7\4&\n\4\f\4\16\4)\13\4\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62"+
		"\13\5\3\6\3\6\7\6\66\n\6\f\6\16\69\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7A\n"+
		"\7\f\7\16\7D\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009e\n\t\4\67B\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\6\2,-"+
		"//\61\61??\6\2*+..=>@@\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2"+
		"\2\5\35\3\2\2\2\7#\3\2\2\2\t*\3\2\2\2\13\63\3\2\2\2\r<\3\2\2\2\17\u0091"+
		"\3\2\2\2\21\u009d\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\31\3\2\2\2\26"+
		"\30\t\3\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\4\3\2\2\2\33\31\3\2\2\2\34\36\t\4\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\3\2\2\"\6\3\2\2\2#\'\4\63;\2$&"+
		"\4\62;\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\b\3\2\2\2)\'\3\2\2"+
		"\2*+\5\7\4\2+,\13\2\2\2,\60\4\62;\2-/\4\63;\2.-\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\n\3\2\2\2\62\60\3\2\2\2\63\67\7$\2\2\64\66"+
		"\13\2\2\2\65\64\3\2\2\2\669\3\2\2\2\678\3\2\2\2\67\65\3\2\2\28:\3\2\2"+
		"\29\67\3\2\2\2:;\7$\2\2;\f\3\2\2\2<=\7/\2\2=>\7/\2\2>B\3\2\2\2?A\13\2"+
		"\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2C\16\3\2\2\2DB\3\2\2\2EF\7"+
		"R\2\2FG\7T\2\2GH\7Q\2\2HI\7I\2\2IJ\7T\2\2JK\7C\2\2K\u0092\7O\2\2LM\7D"+
		"\2\2MN\7G\2\2NO\7I\2\2OP\7K\2\2P\u0092\7P\2\2QR\7G\2\2RS\7P\2\2S\u0092"+
		"\7F\2\2TU\7H\2\2UV\7W\2\2VW\7P\2\2WX\7E\2\2XY\7V\2\2YZ\7K\2\2Z[\7Q\2\2"+
		"[\u0092\7P\2\2\\]\7T\2\2]^\7G\2\2^_\7C\2\2_\u0092\7F\2\2`a\7Y\2\2ab\7"+
		"T\2\2bc\7K\2\2cd\7V\2\2d\u0092\7G\2\2ef\7K\2\2f\u0092\7H\2\2gh\7G\2\2"+
		"hi\7N\2\2ij\7U\2\2j\u0092\7G\2\2kl\7G\2\2lm\7P\2\2mn\7F\2\2no\7K\2\2o"+
		"\u0092\7H\2\2pq\7H\2\2qr\7Q\2\2r\u0092\7T\2\2st\7G\2\2tu\7P\2\2uv\7F\2"+
		"\2vw\7H\2\2wx\7Q\2\2x\u0092\7T\2\2yz\7T\2\2z{\7G\2\2{|\7V\2\2|}\7W\2\2"+
		"}~\7T\2\2~\u0092\7P\2\2\177\u0080\7K\2\2\u0080\u0081\7P\2\2\u0081\u0092"+
		"\7V\2\2\u0082\u0083\7X\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7K\2\2\u0085"+
		"\u0092\7F\2\2\u0086\u0087\7U\2\2\u0087\u0088\7V\2\2\u0088\u0089\7T\2\2"+
		"\u0089\u008a\7K\2\2\u008a\u008b\7P\2\2\u008b\u0092\7I\2\2\u008c\u008d"+
		"\7H\2\2\u008d\u008e\7N\2\2\u008e\u008f\7Q\2\2\u008f\u0090\7C\2\2\u0090"+
		"\u0092\7V\2\2\u0091E\3\2\2\2\u0091L\3\2\2\2\u0091Q\3\2\2\2\u0091T\3\2"+
		"\2\2\u0091\\\3\2\2\2\u0091`\3\2\2\2\u0091e\3\2\2\2\u0091g\3\2\2\2\u0091"+
		"k\3\2\2\2\u0091p\3\2\2\2\u0091s\3\2\2\2\u0091y\3\2\2\2\u0091\177\3\2\2"+
		"\2\u0091\u0082\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u008c\3\2\2\2\u0092\20"+
		"\3\2\2\2\u0093\u0094\7<\2\2\u0094\u009e\7?\2\2\u0095\u009e\t\5\2\2\u0096"+
		"\u0097\7#\2\2\u0097\u009e\7?\2\2\u0098\u009e\t\6\2\2\u0099\u009a\7>\2"+
		"\2\u009a\u009e\7?\2\2\u009b\u009c\7@\2\2\u009c\u009e\7?\2\2\u009d\u0093"+
		"\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e\22\3\2\2\2\r\2\24\27\31\37\'"+
		"\60\67B\u0091\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
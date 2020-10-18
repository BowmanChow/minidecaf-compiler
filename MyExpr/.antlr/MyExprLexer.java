// Generated from /diskd/MyData/Programming/Compile/minidecaf-2018011106/MyExpr/MyExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Lparen=15, Rparen=16, 
		Lbrace=17, Rbrace=18, Semicolon=19, Add=20, Sub=21, Mul=22, Div=23, Integer=24, 
		Identifier=25, Whitespace=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "Lparen", "Rparen", "Lbrace", 
			"Rbrace", "Semicolon", "Add", "Sub", "Mul", "Div", "Integer", "IdentLeadChar", 
			"WordChar", "Identifier", "WhitespaceChar", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'int'", "'return'", "'||'", "'&&'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'%'", "'~'", "'!'", "'('", "')'", "'{'", 
			"'}'", "';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", 
			"Add", "Sub", "Mul", "Div", "Integer", "Identifier", "Whitespace"
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


	public MyExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\6\31}\n\31\r\31"+
		"\16\31~\3\32\3\32\3\33\3\33\3\34\3\34\6\34\u0087\n\34\r\34\16\34\u0088"+
		"\3\35\3\35\3\36\6\36\u008e\n\36\r\36\16\36\u008f\3\36\3\36\2\2\37\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\339\2;\34\3\2\6\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0092\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\67\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5B\3\2\2\2\7F\3\2\2\2\tM\3\2\2"+
		"\2\13P\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2"+
		"\2\2\27`\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2"+
		"\2\2#m\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)s\3\2\2\2+u\3\2\2\2-w\3\2\2\2/y\3"+
		"\2\2\2\61|\3\2\2\2\63\u0080\3\2\2\2\65\u0082\3\2\2\2\67\u0084\3\2\2\2"+
		"9\u008a\3\2\2\2;\u008d\3\2\2\2=>\7o\2\2>?\7c\2\2?@\7k\2\2@A\7p\2\2A\4"+
		"\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2E\6\3\2\2\2FG\7t\2\2GH\7g\2\2HI\7v"+
		"\2\2IJ\7w\2\2JK\7t\2\2KL\7p\2\2L\b\3\2\2\2MN\7~\2\2NO\7~\2\2O\n\3\2\2"+
		"\2PQ\7(\2\2QR\7(\2\2R\f\3\2\2\2ST\7?\2\2TU\7?\2\2U\16\3\2\2\2VW\7#\2\2"+
		"WX\7?\2\2X\20\3\2\2\2YZ\7>\2\2Z\22\3\2\2\2[\\\7@\2\2\\\24\3\2\2\2]^\7"+
		">\2\2^_\7?\2\2_\26\3\2\2\2`a\7@\2\2ab\7?\2\2b\30\3\2\2\2cd\7\'\2\2d\32"+
		"\3\2\2\2ef\7\u0080\2\2f\34\3\2\2\2gh\7#\2\2h\36\3\2\2\2ij\7*\2\2j \3\2"+
		"\2\2kl\7+\2\2l\"\3\2\2\2mn\7}\2\2n$\3\2\2\2op\7\177\2\2p&\3\2\2\2qr\7"+
		"=\2\2r(\3\2\2\2st\7-\2\2t*\3\2\2\2uv\7/\2\2v,\3\2\2\2wx\7,\2\2x.\3\2\2"+
		"\2yz\7\61\2\2z\60\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\62\3\2\2\2\u0080\u0081\t\3\2\2\u0081\64\3\2\2\2\u0082\u0083"+
		"\t\4\2\2\u0083\66\3\2\2\2\u0084\u0086\5\63\32\2\u0085\u0087\5\65\33\2"+
		"\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u00898\3\2\2\2\u008a\u008b\t\5\2\2\u008b:\3\2\2\2\u008c\u008e"+
		"\59\35\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\36\2\2\u0092<\3\2\2\2"+
		"\6\2~\u0088\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/bowman/D/MyData/Programming/Compile/minidecaf-2018011106/MyExpr/MyExprLex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyExprLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Lparen=1, Rparen=2, Lbrace=3, Rbrace=4, Semicolon=5, Add=6, Sub=7, Mul=8, 
		Div=9, Integer=10, Identifier=11, Whitespace=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", "Mul", 
			"Div", "Integer", "IdentLeadChar", "WordChar", "Identifier", "WhitespaceChar", 
			"Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Semicolon", "Add", "Sub", 
			"Mul", "Div", "Integer", "Identifier", "Whitespace"
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


	public MyExprLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyExprLex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13\65\n\13"+
		"\r\13\16\13\66\3\f\3\f\3\r\3\r\3\16\3\16\7\16?\n\16\f\16\16\16B\13\16"+
		"\3\17\3\17\3\20\6\20G\n\20\r\20\16\20H\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\r\35\2\37\16\3\2\6\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2K\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\3!\3\2\2"+
		"\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2"+
		"\2\21/\3\2\2\2\23\61\3\2\2\2\25\64\3\2\2\2\278\3\2\2\2\31:\3\2\2\2\33"+
		"<\3\2\2\2\35C\3\2\2\2\37F\3\2\2\2!\"\7*\2\2\"\4\3\2\2\2#$\7+\2\2$\6\3"+
		"\2\2\2%&\7}\2\2&\b\3\2\2\2\'(\7\177\2\2(\n\3\2\2\2)*\7=\2\2*\f\3\2\2\2"+
		"+,\7-\2\2,\16\3\2\2\2-.\7/\2\2.\20\3\2\2\2/\60\7,\2\2\60\22\3\2\2\2\61"+
		"\62\7\61\2\2\62\24\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\26\3\2\2\289\t\3\2\29\30\3\2\2\2:;\t\4\2"+
		"\2;\32\3\2\2\2<@\5\27\f\2=?\5\31\r\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2A\34\3\2\2\2B@\3\2\2\2CD\t\5\2\2D\36\3\2\2\2EG\5\35\17\2FE\3\2\2"+
		"\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\20\2\2K \3\2\2\2\6\2\66"+
		"@H\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
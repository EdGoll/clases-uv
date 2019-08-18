// Generated from MileLexer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, FLOAT=2, BOOLEAN=3, STRING=4, ID=5, COMMENT=6, WS=7, BEGIN_RW=8, 
		END_RW=9, FOR_RW=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NAT", "DOT", "NUMBER", "FLOAT", "BOOLEAN", "STRING", 
		"ID", "COMMENT", "WS", "BEGIN_RW", "END_RW", "FOR_RW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'inicio'", "'end'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "FLOAT", "BOOLEAN", "STRING", "ID", "COMMENT", "WS", "BEGIN_RW", 
		"END_RW", "FOR_RW"
	};
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


	public MileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MileLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\ff\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\6\6)\n\6\r\6\16\6*\3\7\3\7\3\7\3\7\3\b\3\b\5\b\63\n\b\3\t\3\t\7"+
		"\t\67\n\t\f\t\16\t:\13\t\3\t\3\t\3\n\6\n?\n\n\r\n\16\n@\3\13\3\13\7\13"+
		"E\n\13\f\13\16\13H\13\13\3\13\5\13K\n\13\3\13\3\13\3\13\3\13\3\f\6\fR"+
		"\n\f\r\f\16\fS\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\48F\2\20\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7"+
		"\25\b\27\t\31\n\33\13\35\f\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"h"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2"+
		"\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13(\3\2\2\2\r,\3\2\2\2\17\62\3\2"+
		"\2\2\21\64\3\2\2\2\23>\3\2\2\2\25B\3\2\2\2\27Q\3\2\2\2\31W\3\2\2\2\33"+
		"^\3\2\2\2\35b\3\2\2\2\37 \7x\2\2 \4\3\2\2\2!\"\7h\2\2\"\6\3\2\2\2#$\t"+
		"\2\2\2$\b\3\2\2\2%&\7\60\2\2&\n\3\2\2\2\')\5\7\4\2(\'\3\2\2\2)*\3\2\2"+
		"\2*(\3\2\2\2*+\3\2\2\2+\f\3\2\2\2,-\5\13\6\2-.\5\t\5\2./\5\13\6\2/\16"+
		"\3\2\2\2\60\63\5\3\2\2\61\63\5\5\3\2\62\60\3\2\2\2\62\61\3\2\2\2\63\20"+
		"\3\2\2\2\648\7$\2\2\65\67\13\2\2\2\66\65\3\2\2\2\67:\3\2\2\289\3\2\2\2"+
		"8\66\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7$\2\2<\22\3\2\2\2=?\t\3\2\2>=\3\2"+
		"\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\24\3\2\2\2BF\7#\2\2CE\13\2\2\2DC\3"+
		"\2\2\2EH\3\2\2\2FG\3\2\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IK\7\17\2\2JI"+
		"\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\f\2\2MN\3\2\2\2NO\b\13\2\2O\26\3\2\2"+
		"\2PR\t\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\f\2"+
		"\2V\30\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7k\2\2Z[\7e\2\2[\\\7k\2\2\\]\7q\2\2"+
		"]\32\3\2\2\2^_\7g\2\2_`\7p\2\2`a\7f\2\2a\34\3\2\2\2bc\7h\2\2cd\7q\2\2"+
		"de\7t\2\2e\36\3\2\2\2\n\2*\628@FJS\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Echelon.g4 by ANTLR 4.7.1

    package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EchelonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, WHITESPACE=6, NUMBER=7, VARIABLE=8, 
		MUL=9, DIV=10, ADD=11, MIN=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "COMMENT", "WHITESPACE", "NUMBER", "VARIABLE", 
		"MUL", "DIV", "ADD", "MIN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'='", "'('", "')'", null, null, null, null, "'*'", "'/'", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "COMMENT", "WHITESPACE", "NUMBER", "VARIABLE", 
		"MUL", "DIV", "ADD", "MIN"
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


	public EchelonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Echelon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6(\n\6\f\6\16\6+\13\6\3\6\3\6\3\7\6\7\60\n\7\r\7\16\7\61\3\7\3\7\3\b"+
		"\6\b\67\n\b\r\b\16\b8\3\t\3\t\7\t=\n\t\f\t\16\t@\13\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\3\2\7\4\2\f\f\17\17\5\2\13\13\17\17\"\"\3\2\62;\4\2C\\c|\5"+
		"\2\62;C\\c|\2L\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3"+
		"\2\2\2\13#\3\2\2\2\r/\3\2\2\2\17\66\3\2\2\2\21:\3\2\2\2\23A\3\2\2\2\25"+
		"C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33\34\7\f\2\2\34\4\3\2\2\2\35\36\7?"+
		"\2\2\36\6\3\2\2\2\37 \7*\2\2 \b\3\2\2\2!\"\7+\2\2\"\n\3\2\2\2#$\7\61\2"+
		"\2$%\7\61\2\2%)\3\2\2\2&(\n\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*,\3\2\2\2+)\3\2\2\2,-\b\6\2\2-\f\3\2\2\2.\60\t\3\2\2/.\3\2\2\2"+
		"\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\b\7\2\2\64"+
		"\16\3\2\2\2\65\67\t\4\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2"+
		"\2\29\20\3\2\2\2:>\t\5\2\2;=\t\6\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?\22\3\2\2\2@>\3\2\2\2AB\7,\2\2B\24\3\2\2\2CD\7\61\2\2D\26\3\2\2"+
		"\2EF\7-\2\2F\30\3\2\2\2GH\7/\2\2H\32\3\2\2\2\7\2)\618>\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
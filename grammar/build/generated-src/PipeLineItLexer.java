// Generated from /Users/Ivan/Development/Sandboxes/wesovi/languages/WesoviLang/grammar/src/main/antlr4/PipeLineItLexer.g4 by ANTLR 4.2.2
package com.wesovi.lang.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipeLineItLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LABEL_REQUIRE=1, WS=2, ID=3, DASHBRACK=4, LABEL_TASK=5, LABEL_JOB=6, EOL=7, 
		INTEGER=8, WORD=9, WHITESPACE=10, COMMENT=11, JOB_DETAIL=12, REQUIRE_DETAIL=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'require'", "WS", "ID", "DASHBRACK", "'task'", "'job'", "'[\n]'", "INTEGER", 
		"WORD", "WHITESPACE", "COMMENT", "JOB_DETAIL", "REQUIRE_DETAIL"
	};
	public static final String[] ruleNames = {
		"WS", "ID", "DASHBRACK", "LABEL_REQUIRE", "LABEL_TASK", "LABEL_JOB", "EOL", 
		"INTEGER", "WORD", "WHITESPACE", "COMMENT", "JOB_DETAIL", "REQUIRE_DETAIL", 
		"DIGIT", "LETTER"
	};


	public PipeLineItLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PipeLineItLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\2\3\2\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\6\4\61\n\4\r\4\16\4\62"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\6\tK\n\t\r\t\16\tL\3\n\6\nP\n\n\r\n\16\nQ\3\13\6\13"+
		"U\n\13\r\13\16\13V\3\f\3\f\3\f\3\f\6\f]\n\f\r\f\16\f^\5\fa\n\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\2\2"+
		"\21\3\4\5\5\7\6\t\3\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\2\37\2\3\2\b\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\4\2//^_\4\2\13"+
		"\13\"\"\6\2C\\aac|\u0082\u0101y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\"\3\2\2\2\5"+
		"(\3\2\2\2\7\60\3\2\2\2\t\64\3\2\2\2\13<\3\2\2\2\rA\3\2\2\2\17E\3\2\2\2"+
		"\21J\3\2\2\2\23O\3\2\2\2\25T\3\2\2\2\27X\3\2\2\2\31d\3\2\2\2\33h\3\2\2"+
		"\2\35n\3\2\2\2\37p\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$"+
		"%\3\2\2\2%&\3\2\2\2&\'\b\2\2\2\'\4\3\2\2\2(,\t\3\2\2)+\t\4\2\2*)\3\2\2"+
		"\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\6\3\2\2\2.,\3\2\2\2/\61\t\5\2\2\60/"+
		"\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\b\3\2\2\2\64\65"+
		"\7t\2\2\65\66\7g\2\2\66\67\7s\2\2\678\7w\2\289\7k\2\29:\7t\2\2:;\7g\2"+
		"\2;\n\3\2\2\2<=\7v\2\2=>\7c\2\2>?\7u\2\2?@\7m\2\2@\f\3\2\2\2AB\7l\2\2"+
		"BC\7q\2\2CD\7d\2\2D\16\3\2\2\2EF\7]\2\2FG\7\f\2\2GH\7_\2\2H\20\3\2\2\2"+
		"IK\4\62;\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\22\3\2\2\2NP\5\37"+
		"\20\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\24\3\2\2\2SU\t\6\2\2TS"+
		"\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\26\3\2\2\2X`\7%\2\2Y]\5\23\n\2"+
		"Z]\5\21\t\2[]\5\25\13\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_a\3\2\2\2`\\\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\f\2\2"+
		"c\30\3\2\2\2de\5\r\7\2ef\5\25\13\2fg\5\23\n\2g\32\3\2\2\2hi\5\t\5\2ij"+
		"\5\25\13\2jk\5\23\n\2kl\3\2\2\2lm\b\16\2\2m\34\3\2\2\2no\4\62;\2o\36\3"+
		"\2\2\2pq\t\7\2\2q \3\2\2\2\f\2$,\62LQV\\^`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
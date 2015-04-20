// Generated from /Users/Ivan/Development/Sandboxes/wesovi/languages/WesoviLang/grammar/src/main/antlr4/PipeLineItParser.g4 by ANTLR 4.2.2
package com.wesovi.lang.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipeLineItParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LABEL_JOB=6, JOB_DETAIL=12, WORD=9, DASHBRACK=4, EOL=7, LABEL_REQUIRE=1, 
		LABEL_TASK=5, COMMENT=11, REQUIRE_DETAIL=13, WHITESPACE=10, ID=3, WS=2, 
		INTEGER=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'require'", "WS", "ID", "DASHBRACK", "'task'", "'job'", 
		"'\n'", "INTEGER", "WORD", "WHITESPACE", "COMMENT", "JOB_DETAIL", "REQUIRE_DETAIL"
	};
	public static final int
		RULE_dependendies = 0, RULE_dependency = 1, RULE_tasks = 2, RULE_task = 3, 
		RULE_jobs = 4, RULE_job = 5, RULE_header = 6, RULE_onSuccess = 7, RULE_onError = 8;
	public static final String[] ruleNames = {
		"dependendies", "dependency", "tasks", "task", "jobs", "job", "header", 
		"onSuccess", "onError"
	};

	@Override
	public String getGrammarFileName() { return "PipeLineItParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PipeLineItParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DependendiesContext extends ParserRuleContext {
		public DependencyContext dependency() {
			return getRuleContext(DependencyContext.class,0);
		}
		public DependendiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependendies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterDependendies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitDependendies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitDependendies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependendiesContext dependendies() throws RecognitionException {
		DependendiesContext _localctx = new DependendiesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dependendies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_la = _input.LA(1);
			if (_la==REQUIRE_DETAIL) {
				{
				setState(18); dependency();
				}
			}

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

	public static class DependencyContext extends ParserRuleContext {
		public TerminalNode REQUIRE_DETAIL() { return getToken(PipeLineItParser.REQUIRE_DETAIL, 0); }
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitDependency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dependency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(REQUIRE_DETAIL);
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

	public static class TasksContext extends ParserRuleContext {
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public TasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tasks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterTasks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitTasks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitTasks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TasksContext tasks() throws RecognitionException {
		TasksContext _localctx = new TasksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tasks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if (_la==LABEL_TASK) {
				{
				setState(23); task();
				}
			}

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

	public static class TaskContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PipeLineItParser.WORD, 0); }
		public TerminalNode LABEL_TASK() { return getToken(PipeLineItParser.LABEL_TASK, 0); }
		public TerminalNode WHITESPACE() { return getToken(PipeLineItParser.WHITESPACE, 0); }
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_task);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(26); match(LABEL_TASK);
			setState(27); match(WHITESPACE);
			setState(28); match(WORD);
			}
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

	public static class JobsContext extends ParserRuleContext {
		public JobContext job() {
			return getRuleContext(JobContext.class,0);
		}
		public JobsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterJobs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitJobs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitJobs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobsContext jobs() throws RecognitionException {
		JobsContext _localctx = new JobsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jobs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if (_la==LABEL_JOB) {
				{
				setState(30); job();
				}
			}

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

	public static class JobContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PipeLineItParser.WORD, 0); }
		public TerminalNode LABEL_JOB() { return getToken(PipeLineItParser.LABEL_JOB, 0); }
		public TerminalNode WHITESPACE() { return getToken(PipeLineItParser.WHITESPACE, 0); }
		public JobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_job; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterJob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitJob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitJob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobContext job() throws RecognitionException {
		JobContext _localctx = new JobContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_job);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(LABEL_JOB);
			{
			setState(34); match(WHITESPACE);
			setState(35); match(WORD);
			}
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipeLineItParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(PipeLineItParser.INTEGER, 0); }
		public TerminalNode WORD() { return getToken(PipeLineItParser.WORD, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(ID);
			setState(38); match(WORD);
			setState(39); match(INTEGER);
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

	public static class OnSuccessContext extends ParserRuleContext {
		public OnSuccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSuccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterOnSuccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitOnSuccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitOnSuccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnSuccessContext onSuccess() throws RecognitionException {
		OnSuccessContext _localctx = new OnSuccessContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_onSuccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class OnErrorContext extends ParserRuleContext {
		public OnErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).enterOnError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipeLineItParserListener ) ((PipeLineItParserListener)listener).exitOnError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipeLineItParserVisitor ) return ((PipeLineItParserVisitor<? extends T>)visitor).visitOnError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnErrorContext onError() throws RecognitionException {
		OnErrorContext _localctx = new OnErrorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_onError);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"+
		"\n\2\3\3\3\3\3\4\5\4\33\n\4\3\5\3\5\3\5\3\5\3\6\5\6\"\n\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\2)\2\25\3\2\2\2\4\27\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n!\3\2\2\2\f#"+
		"\3\2\2\2\16\'\3\2\2\2\20+\3\2\2\2\22-\3\2\2\2\24\26\5\4\3\2\25\24\3\2"+
		"\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30\7\17\2\2\30\5\3\2\2\2\31\33\5\b"+
		"\5\2\32\31\3\2\2\2\32\33\3\2\2\2\33\7\3\2\2\2\34\35\7\7\2\2\35\36\7\f"+
		"\2\2\36\37\7\13\2\2\37\t\3\2\2\2 \"\5\f\7\2! \3\2\2\2!\"\3\2\2\2\"\13"+
		"\3\2\2\2#$\7\b\2\2$%\7\f\2\2%&\7\13\2\2&\r\3\2\2\2\'(\7\5\2\2()\7\13\2"+
		"\2)*\7\n\2\2*\17\3\2\2\2+,\3\2\2\2,\21\3\2\2\2-.\3\2\2\2.\23\3\2\2\2\5"+
		"\25\32!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
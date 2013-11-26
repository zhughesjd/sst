// Generated from C:\Users\hughes\git\sst\src\main\resources\SST.g4 by ANTLR 4.1
package com.metsci.sst.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SSTParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Quit=1, Read=2, Print=3, New=4, Equals=5, Colon=6, Double=7, Float=8, 
		Bool=9, True=10, False=11, Dollar=12, String=13, LP=14, RP=15, LB=16, 
		RB=17, CopySignal=18, CompareSignals=19, ClearSignal=20, PrintEigenrays=21, 
		PrintGSMEigenrays=22, Identifier=23, Number=24, WhiteSpace=25, MulitlineComment=26, 
		SinglelineComment=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'quit'", "'read'", "'print'", "'new'", "'='", "':'", "'double'", 
		"'float'", "'bool'", "'true'", "'false'", "'$'", "String", "'('", "')'", 
		"'{'", "'}'", "'CopySignal'", "'CompareSignals'", "'ClearSignal'", "'PrintEigenrays'", 
		"'PrintGSMEigenrays'", "Identifier", "Number", "WhiteSpace", "MulitlineComment", 
		"SinglelineComment"
	};
	public static final int
		RULE_sstinput = 0, RULE_statement = 1, RULE_read = 2, RULE_print = 3, 
		RULE_assignmentstatement = 4, RULE_copysignal = 5, RULE_comparesignals = 6, 
		RULE_identifierbrackets = 7, RULE_clearsignal = 8, RULE_printeigenrays = 9, 
		RULE_quit = 10, RULE_assignment = 11, RULE_assignmentvalue = 12, RULE_brackets = 13, 
		RULE_parenthesis = 14, RULE_copysignalvalue = 15;
	public static final String[] ruleNames = {
		"sstinput", "statement", "read", "print", "assignmentstatement", "copysignal", 
		"comparesignals", "identifierbrackets", "clearsignal", "printeigenrays", 
		"quit", "assignment", "assignmentvalue", "brackets", "parenthesis", "copysignalvalue"
	};

	@Override
	public String getGrammarFileName() { return "SST.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SSTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SstinputContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SstinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sstinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterSstinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitSstinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitSstinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SstinputContext sstinput() throws RecognitionException {
		SstinputContext _localctx = new SstinputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sstinput);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(32); statement();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public QuitContext quit() {
			return getRuleContext(QuitContext.class,0);
		}
		public ComparesignalsContext comparesignals() {
			return getRuleContext(ComparesignalsContext.class,0);
		}
		public AssignmentstatementContext assignmentstatement() {
			return getRuleContext(AssignmentstatementContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IdentifierbracketsContext identifierbrackets() {
			return getRuleContext(IdentifierbracketsContext.class,0);
		}
		public ClearsignalContext clearsignal() {
			return getRuleContext(ClearsignalContext.class,0);
		}
		public CopysignalContext copysignal() {
			return getRuleContext(CopysignalContext.class,0);
		}
		public PrinteigenraysContext printeigenrays() {
			return getRuleContext(PrinteigenraysContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(38); read();
				}
				break;

			case 2:
				{
				setState(39); print();
				}
				break;

			case 3:
				{
				setState(40); assignmentstatement();
				}
				break;

			case 4:
				{
				setState(41); copysignal();
				}
				break;

			case 5:
				{
				setState(42); comparesignals();
				}
				break;

			case 6:
				{
				setState(43); clearsignal();
				}
				break;

			case 7:
				{
				setState(44); identifierbrackets();
				}
				break;

			case 8:
				{
				setState(45); printeigenrays();
				}
				break;

			case 9:
				{
				setState(46); quit();
				}
				break;
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SSTParser.String, 0); }
		public TerminalNode Read() { return getToken(SSTParser.Read, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(Read);
			setState(50); match(String);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SSTParser.String, 0); }
		public TerminalNode Identifier() { return getToken(SSTParser.Identifier, 0); }
		public TerminalNode Print() { return getToken(SSTParser.Print, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(Print);
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==String || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AssignmentstatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterAssignmentstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitAssignmentstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitAssignmentstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentstatementContext assignmentstatement() throws RecognitionException {
		AssignmentstatementContext _localctx = new AssignmentstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); assignment();
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

	public static class CopysignalContext extends ParserRuleContext {
		public TerminalNode CopySignal() { return getToken(SSTParser.CopySignal, 0); }
		public CopysignalvalueContext copysignalvalue() {
			return getRuleContext(CopysignalvalueContext.class,0);
		}
		public CopysignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copysignal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterCopysignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitCopysignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitCopysignal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopysignalContext copysignal() throws RecognitionException {
		CopysignalContext _localctx = new CopysignalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_copysignal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(CopySignal);
			setState(58); copysignalvalue();
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

	public static class ComparesignalsContext extends ParserRuleContext {
		public TerminalNode CompareSignals() { return getToken(SSTParser.CompareSignals, 0); }
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SSTParser.Identifier, 0); }
		public ComparesignalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparesignals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterComparesignals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitComparesignals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitComparesignals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparesignalsContext comparesignals() throws RecognitionException {
		ComparesignalsContext _localctx = new ComparesignalsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparesignals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(CompareSignals);
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(61); match(Identifier);
				setState(62); match(Identifier);
				}
				}
				break;

			case 2:
				{
				setState(63); brackets();
				}
				break;

			case 3:
				{
				setState(64); parenthesis();
				}
				break;
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

	public static class IdentifierbracketsContext extends ParserRuleContext {
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(SSTParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SSTParser.Identifier); }
		public IdentifierbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterIdentifierbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitIdentifierbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitIdentifierbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierbracketsContext identifierbrackets() throws RecognitionException {
		IdentifierbracketsContext _localctx = new IdentifierbracketsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifierbrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(Identifier);
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(68); match(Identifier);
				}
				break;

			case 2:
				{
				setState(69); parenthesis();
				}
				break;

			case 3:
				{
				setState(70); brackets();
				}
				break;
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

	public static class ClearsignalContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SSTParser.Identifier, 0); }
		public TerminalNode ClearSignal() { return getToken(SSTParser.ClearSignal, 0); }
		public ClearsignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearsignal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterClearsignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitClearsignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitClearsignal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearsignalContext clearsignal() throws RecognitionException {
		ClearsignalContext _localctx = new ClearsignalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_clearsignal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(ClearSignal);
			setState(74); match(Identifier);
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

	public static class PrinteigenraysContext extends ParserRuleContext {
		public TerminalNode PrintGSMEigenrays() { return getToken(SSTParser.PrintGSMEigenrays, 0); }
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public TerminalNode PrintEigenrays() { return getToken(SSTParser.PrintEigenrays, 0); }
		public PrinteigenraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printeigenrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterPrinteigenrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitPrinteigenrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitPrinteigenrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinteigenraysContext printeigenrays() throws RecognitionException {
		PrinteigenraysContext _localctx = new PrinteigenraysContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printeigenrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==PrintEigenrays || _la==PrintGSMEigenrays) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77); brackets();
				}
				break;
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

	public static class QuitContext extends ParserRuleContext {
		public TerminalNode Quit() { return getToken(SSTParser.Quit, 0); }
		public QuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterQuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitQuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitQuit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuitContext quit() throws RecognitionException {
		QuitContext _localctx = new QuitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(Quit);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(SSTParser.New, 0); }
		public TerminalNode Identifier() { return getToken(SSTParser.Identifier, 0); }
		public TerminalNode Equals() { return getToken(SSTParser.Equals, 0); }
		public AssignmentvalueContext assignmentvalue() {
			return getRuleContext(AssignmentvalueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82); match(New);
				}
				break;
			}
			setState(85); match(Identifier);
			setState(86); match(Equals);
			setState(87); assignmentvalue();
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

	public static class AssignmentvalueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SSTParser.String, 0); }
		public TerminalNode Double() { return getToken(SSTParser.Double, 0); }
		public TerminalNode False() { return getToken(SSTParser.False, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SSTParser.Identifier, 0); }
		public TerminalNode True() { return getToken(SSTParser.True, 0); }
		public TerminalNode Colon() { return getToken(SSTParser.Colon, 0); }
		public TerminalNode Bool() { return getToken(SSTParser.Bool, 0); }
		public TerminalNode LB() { return getToken(SSTParser.LB, 0); }
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public TerminalNode Float() { return getToken(SSTParser.Float, 0); }
		public TerminalNode RB() { return getToken(SSTParser.RB, 0); }
		public TerminalNode Number() { return getToken(SSTParser.Number, 0); }
		public TerminalNode Dollar() { return getToken(SSTParser.Dollar, 0); }
		public AssignmentvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterAssignmentvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitAssignmentvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitAssignmentvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentvalueContext assignmentvalue() throws RecognitionException {
		AssignmentvalueContext _localctx = new AssignmentvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentvalue);
		int _la;
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==String || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(90);
					_la = _input.LA(1);
					if ( !(_la==Double || _la==Float) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(91); match(Colon);
					}
					break;
				}
				setState(94); match(Number);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(95); match(Bool);
					setState(96); match(Colon);
					}
					break;
				}
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(100); match(Identifier);
					setState(102);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(101); match(Colon);
						}
						break;
					}
					}
					break;
				}
				setState(108);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(106); parenthesis();
					}
					break;

				case 2:
					{
					setState(107); brackets();
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110); match(Dollar);
				setState(111); match(LB);
				setState(112); match(Identifier);
				setState(113); match(RB);
				}
				break;
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

	public static class BracketsContext extends ParserRuleContext {
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode LB() { return getToken(SSTParser.LB, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public TerminalNode RB() { return getToken(SSTParser.RB, 0); }
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_brackets);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(LB);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(117); assignment();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(123); match(RB);
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

	public static class ParenthesisContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(SSTParser.String); }
		public TerminalNode Colon(int i) {
			return getToken(SSTParser.Colon, i);
		}
		public TerminalNode String(int i) {
			return getToken(SSTParser.String, i);
		}
		public ParenthesisContext parenthesis(int i) {
			return getRuleContext(ParenthesisContext.class,i);
		}
		public TerminalNode LP() { return getToken(SSTParser.LP, 0); }
		public List<ParenthesisContext> parenthesis() {
			return getRuleContexts(ParenthesisContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(SSTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SSTParser.Identifier, i);
		}
		public TerminalNode RP() { return getToken(SSTParser.RP, 0); }
		public List<TerminalNode> Colon() { return getTokens(SSTParser.Colon); }
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public List<TerminalNode> Number() { return getTokens(SSTParser.Number); }
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public TerminalNode Number(int i) {
			return getToken(SSTParser.Number, i);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parenthesis);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(LP);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(126); parenthesis();
						}
						break;

					case 2:
						{
						setState(127); brackets();
						}
						break;

					case 3:
						{
						setState(128); match(Number);
						}
						break;

					case 4:
						{
						setState(129); match(Identifier);
						setState(134);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(131);
							switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
							case 1:
								{
								setState(130); match(Colon);
								}
								break;
							}
							setState(133); brackets();
							}
							break;
						}
						}
						break;

					case 5:
						{
						setState(136); match(String);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(142); match(RP);
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

	public static class CopysignalvalueContext extends ParserRuleContext {
		public List<TerminalNode> Colon() { return getTokens(SSTParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(SSTParser.Colon, i);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public TerminalNode Number() { return getToken(SSTParser.Number, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(SSTParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SSTParser.Identifier); }
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public CopysignalvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copysignalvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).enterCopysignalvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSTListener ) ((SSTListener)listener).exitCopysignalvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSTVisitor ) return ((SSTVisitor<? extends T>)visitor).visitCopysignalvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopysignalvalueContext copysignalvalue() throws RecognitionException {
		CopysignalvalueContext _localctx = new CopysignalvalueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_copysignalvalue);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); parenthesis();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(Identifier);
				setState(150);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(147);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(146); match(Colon);
						}
						break;
					}
					setState(149); brackets();
					}
					break;
				}
				setState(152); match(Identifier);
				setState(157);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(154);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(153); match(Colon);
						}
						break;
					}
					setState(156); brackets();
					}
					break;
				}
				setState(160);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(159); match(Number);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); brackets();
				}
				break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\35\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bD\n"+
		"\b\3\t\3\t\3\t\3\t\5\tJ\n\t\3\n\3\n\3\n\3\13\3\13\5\13Q\n\13\3\f\3\f\3"+
		"\r\5\rV\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16_\n\16\3\16\3\16\3\16\5"+
		"\16d\n\16\3\16\3\16\3\16\5\16i\n\16\5\16k\n\16\3\16\3\16\5\16o\n\16\3"+
		"\16\3\16\3\16\3\16\5\16u\n\16\3\17\3\17\7\17y\n\17\f\17\16\17|\13\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0086\n\20\3\20\5\20\u0089"+
		"\n\20\3\20\7\20\u008c\n\20\f\20\16\20\u008f\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\5\21\u0096\n\21\3\21\5\21\u0099\n\21\3\21\3\21\5\21\u009d\n\21\3"+
		"\21\5\21\u00a0\n\21\3\21\5\21\u00a3\n\21\3\21\5\21\u00a6\n\21\3\21\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\4\2\17\17\31\31\3\2\27\30"+
		"\3\2\t\n\3\2\f\r\u00be\2%\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\66\3\2\2"+
		"\2\n9\3\2\2\2\f;\3\2\2\2\16>\3\2\2\2\20E\3\2\2\2\22K\3\2\2\2\24N\3\2\2"+
		"\2\26R\3\2\2\2\30U\3\2\2\2\32t\3\2\2\2\34v\3\2\2\2\36\177\3\2\2\2 \u00a5"+
		"\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2"+
		"\2\'%\3\2\2\2(\62\5\6\4\2)\62\5\b\5\2*\62\5\n\6\2+\62\5\f\7\2,\62\5\16"+
		"\b\2-\62\5\22\n\2.\62\5\20\t\2/\62\5\24\13\2\60\62\5\26\f\2\61(\3\2\2"+
		"\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2"+
		"\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\4\2\2\64\65\7\17\2"+
		"\2\65\7\3\2\2\2\66\67\7\5\2\2\678\t\2\2\28\t\3\2\2\29:\5\30\r\2:\13\3"+
		"\2\2\2;<\7\24\2\2<=\5 \21\2=\r\3\2\2\2>C\7\25\2\2?@\7\31\2\2@D\7\31\2"+
		"\2AD\5\34\17\2BD\5\36\20\2C?\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\17\3\2\2\2E"+
		"I\7\31\2\2FJ\7\31\2\2GJ\5\36\20\2HJ\5\34\17\2IF\3\2\2\2IG\3\2\2\2IH\3"+
		"\2\2\2J\21\3\2\2\2KL\7\26\2\2LM\7\31\2\2M\23\3\2\2\2NP\t\3\2\2OQ\5\34"+
		"\17\2PO\3\2\2\2PQ\3\2\2\2Q\25\3\2\2\2RS\7\3\2\2S\27\3\2\2\2TV\7\6\2\2"+
		"UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\31\2\2XY\7\7\2\2YZ\5\32\16\2Z\31\3"+
		"\2\2\2[u\t\2\2\2\\]\t\4\2\2]_\7\b\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`"+
		"u\7\32\2\2ab\7\13\2\2bd\7\b\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eu\t\5\2"+
		"\2fh\7\31\2\2gi\7\b\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jf\3\2\2\2jk\3\2"+
		"\2\2kn\3\2\2\2lo\5\36\20\2mo\5\34\17\2nl\3\2\2\2nm\3\2\2\2ou\3\2\2\2p"+
		"q\7\16\2\2qr\7\22\2\2rs\7\31\2\2su\7\23\2\2t[\3\2\2\2t^\3\2\2\2tc\3\2"+
		"\2\2tj\3\2\2\2tp\3\2\2\2u\33\3\2\2\2vz\7\22\2\2wy\5\30\r\2xw\3\2\2\2y"+
		"|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\23\2\2~\35\3\2\2"+
		"\2\177\u008d\7\20\2\2\u0080\u008c\5\36\20\2\u0081\u008c\5\34\17\2\u0082"+
		"\u008c\7\32\2\2\u0083\u0088\7\31\2\2\u0084\u0086\7\b\2\2\u0085\u0084\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\5\34\17\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008c\7\17"+
		"\2\2\u008b\u0080\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0082\3\2\2\2\u008b"+
		"\u0083\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\21\2\2\u0091\37\3\2\2\2\u0092\u00a6\5\36\20\2\u0093\u0098\7\31"+
		"\2\2\u0094\u0096\7\b\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\5\34\17\2\u0098\u0095\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\7\31\2\2\u009b\u009d\7\b\2\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\5\34"+
		"\17\2\u009f\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u00a3\7\32\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a6\5\34\17\2\u00a5\u0092\3\2\2\2\u00a5\u0093\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6!\3\2\2\2\31%\61CIPU^chjntz\u0085\u0088\u008b\u008d"+
		"\u0095\u0098\u009c\u009f\u00a2\u00a5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:\Users\Joshua\Desktop\SST.g4 by ANTLR 4.1
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
		RULE_sstinput = 0, RULE_read = 1, RULE_print = 2, RULE_assignment = 3, 
		RULE_copysignal = 4, RULE_comparesignals = 5, RULE_identifierbrackets = 6, 
		RULE_clearsignal = 7, RULE_printeigenrays = 8, RULE_quit = 9, RULE_assignmentvalue = 10, 
		RULE_brackets = 11, RULE_parenthesis = 12, RULE_copysignalvalue = 13;
	public static final String[] ruleNames = {
		"sstinput", "read", "print", "assignment", "copysignal", "comparesignals", 
		"identifierbrackets", "clearsignal", "printeigenrays", "quit", "assignmentvalue", 
		"brackets", "parenthesis", "copysignalvalue"
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
		public ComparesignalsContext comparesignals(int i) {
			return getRuleContext(ComparesignalsContext.class,i);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public List<IdentifierbracketsContext> identifierbrackets() {
			return getRuleContexts(IdentifierbracketsContext.class);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public List<PrinteigenraysContext> printeigenrays() {
			return getRuleContexts(PrinteigenraysContext.class);
		}
		public IdentifierbracketsContext identifierbrackets(int i) {
			return getRuleContext(IdentifierbracketsContext.class,i);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public List<QuitContext> quit() {
			return getRuleContexts(QuitContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public List<ComparesignalsContext> comparesignals() {
			return getRuleContexts(ComparesignalsContext.class);
		}
		public PrinteigenraysContext printeigenrays(int i) {
			return getRuleContext(PrinteigenraysContext.class,i);
		}
		public ClearsignalContext clearsignal(int i) {
			return getRuleContext(ClearsignalContext.class,i);
		}
		public List<CopysignalContext> copysignal() {
			return getRuleContexts(CopysignalContext.class);
		}
		public List<ClearsignalContext> clearsignal() {
			return getRuleContexts(ClearsignalContext.class);
		}
		public QuitContext quit(int i) {
			return getRuleContext(QuitContext.class,i);
		}
		public CopysignalContext copysignal(int i) {
			return getRuleContext(CopysignalContext.class,i);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(37);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(28); read();
						}
						break;

					case 2:
						{
						setState(29); print();
						}
						break;

					case 3:
						{
						setState(30); assignment();
						}
						break;

					case 4:
						{
						setState(31); copysignal();
						}
						break;

					case 5:
						{
						setState(32); comparesignals();
						}
						break;

					case 6:
						{
						setState(33); clearsignal();
						}
						break;

					case 7:
						{
						setState(34); identifierbrackets();
						}
						break;

					case 8:
						{
						setState(35); printeigenrays();
						}
						break;

					case 9:
						{
						setState(36); quit();
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 2, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(Read);
			setState(43); match(String);
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
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(Print);
			setState(46);
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48); match(New);
				}
				break;
			}
			setState(51); match(Identifier);
			setState(52); match(Equals);
			setState(53); assignmentvalue();
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
		enterRule(_localctx, 8, RULE_copysignal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(CopySignal);
			setState(56); copysignalvalue();
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
		enterRule(_localctx, 10, RULE_comparesignals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(CompareSignals);
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(59); match(Identifier);
				setState(60); match(Identifier);
				}
				}
				break;

			case 2:
				{
				setState(61); brackets();
				}
				break;

			case 3:
				{
				setState(62); parenthesis();
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
		enterRule(_localctx, 12, RULE_identifierbrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(Identifier);
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(66); match(Identifier);
				}
				break;

			case 2:
				{
				setState(67); parenthesis();
				}
				break;

			case 3:
				{
				setState(68); brackets();
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
		enterRule(_localctx, 14, RULE_clearsignal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(ClearSignal);
			setState(72); match(Identifier);
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
		enterRule(_localctx, 16, RULE_printeigenrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==PrintEigenrays || _la==PrintGSMEigenrays) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75); brackets();
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
		enterRule(_localctx, 18, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(Quit);
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
		enterRule(_localctx, 20, RULE_assignmentvalue);
		int _la;
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
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
				setState(83);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(81);
					_la = _input.LA(1);
					if ( !(_la==Double || _la==Float) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(82); match(Colon);
					}
					break;
				}
				setState(85); match(Number);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(86); match(Bool);
					setState(87); match(Colon);
					}
					break;
				}
				setState(90);
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
				setState(95);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(91); match(Identifier);
					setState(93);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(92); match(Colon);
						}
						break;
					}
					}
					break;
				}
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(97); parenthesis();
					}
					break;

				case 2:
					{
					setState(98); brackets();
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101); match(Dollar);
				setState(102); match(LB);
				setState(103); match(Identifier);
				setState(104); match(RB);
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
		enterRule(_localctx, 22, RULE_brackets);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(LB);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(108); assignment();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(114); match(RB);
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
		public List<TerminalNode> Colon() { return getTokens(SSTParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(SSTParser.Colon, i);
		}
		public TerminalNode String(int i) {
			return getToken(SSTParser.String, i);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public ParenthesisContext parenthesis(int i) {
			return getRuleContext(ParenthesisContext.class,i);
		}
		public TerminalNode LP() { return getToken(SSTParser.LP, 0); }
		public List<TerminalNode> Number() { return getTokens(SSTParser.Number); }
		public List<ParenthesisContext> parenthesis() {
			return getRuleContexts(ParenthesisContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(SSTParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SSTParser.Identifier); }
		public TerminalNode RP() { return getToken(SSTParser.RP, 0); }
		public TerminalNode Number(int i) {
			return getToken(SSTParser.Number, i);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
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
		enterRule(_localctx, 24, RULE_parenthesis);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(LP);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(128);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(117); parenthesis();
						}
						break;

					case 2:
						{
						setState(118); brackets();
						}
						break;

					case 3:
						{
						setState(119); match(Number);
						}
						break;

					case 4:
						{
						setState(120); match(Identifier);
						setState(125);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(122);
							switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
							case 1:
								{
								setState(121); match(Colon);
								}
								break;
							}
							setState(124); brackets();
							}
							break;
						}
						}
						break;

					case 5:
						{
						setState(127); match(String);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(133); match(RP);
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
		enterRule(_localctx, 26, RULE_copysignalvalue);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); parenthesis();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(Identifier);
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(138);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(137); match(Colon);
						}
						break;
					}
					setState(140); brackets();
					}
					break;
				}
				setState(143); match(Identifier);
				setState(148);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(145);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(144); match(Colon);
						}
						break;
					}
					setState(147); brackets();
					}
					break;
				}
				setState(151);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(150); match(Number);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153); brackets();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\35\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\5\5\64\n"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\b\3\b\3"+
		"\b\3\b\5\bH\n\b\3\t\3\t\3\t\3\n\3\n\5\nO\n\n\3\13\3\13\3\f\3\f\3\f\5\f"+
		"V\n\f\3\f\3\f\3\f\5\f[\n\f\3\f\3\f\3\f\5\f`\n\f\5\fb\n\f\3\f\3\f\5\ff"+
		"\n\f\3\f\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\7\rp\n\r\f\r\16\rs\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16}\n\16\3\16\5\16\u0080\n\16\3\16\7"+
		"\16\u0083\n\16\f\16\16\16\u0086\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u008d"+
		"\n\17\3\17\5\17\u0090\n\17\3\17\3\17\5\17\u0094\n\17\3\17\5\17\u0097\n"+
		"\17\3\17\5\17\u009a\n\17\3\17\5\17\u009d\n\17\3\17\2\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\6\4\2\17\17\31\31\3\2\27\30\3\2\t\n\3\2\f\r\u00b7"+
		"\2)\3\2\2\2\4,\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n9\3\2\2\2\f<\3\2\2\2\16"+
		"C\3\2\2\2\20I\3\2\2\2\22L\3\2\2\2\24P\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2"+
		"\32v\3\2\2\2\34\u009c\3\2\2\2\36(\5\4\3\2\37(\5\6\4\2 (\5\b\5\2!(\5\n"+
		"\6\2\"(\5\f\7\2#(\5\20\t\2$(\5\16\b\2%(\5\22\n\2&(\5\24\13\2\'\36\3\2"+
		"\2\2\'\37\3\2\2\2\' \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2"+
		"\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+"+
		")\3\2\2\2,-\7\4\2\2-.\7\17\2\2.\5\3\2\2\2/\60\7\5\2\2\60\61\t\2\2\2\61"+
		"\7\3\2\2\2\62\64\7\6\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\7\31\2\2\66\67\7\7\2\2\678\5\26\f\28\t\3\2\2\29:\7\24\2\2:;\5\34\17"+
		"\2;\13\3\2\2\2<A\7\25\2\2=>\7\31\2\2>B\7\31\2\2?B\5\30\r\2@B\5\32\16\2"+
		"A=\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\r\3\2\2\2CG\7\31\2\2DH\7\31\2\2EH\5\32"+
		"\16\2FH\5\30\r\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\17\3\2\2\2IJ\7\26\2\2"+
		"JK\7\31\2\2K\21\3\2\2\2LN\t\3\2\2MO\5\30\r\2NM\3\2\2\2NO\3\2\2\2O\23\3"+
		"\2\2\2PQ\7\3\2\2Q\25\3\2\2\2Rl\t\2\2\2ST\t\4\2\2TV\7\b\2\2US\3\2\2\2U"+
		"V\3\2\2\2VW\3\2\2\2Wl\7\32\2\2XY\7\13\2\2Y[\7\b\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[\\\3\2\2\2\\l\t\5\2\2]_\7\31\2\2^`\7\b\2\2_^\3\2\2\2_`\3\2\2\2`b\3"+
		"\2\2\2a]\3\2\2\2ab\3\2\2\2be\3\2\2\2cf\5\32\16\2df\5\30\r\2ec\3\2\2\2"+
		"ed\3\2\2\2fl\3\2\2\2gh\7\16\2\2hi\7\22\2\2ij\7\31\2\2jl\7\23\2\2kR\3\2"+
		"\2\2kU\3\2\2\2kZ\3\2\2\2ka\3\2\2\2kg\3\2\2\2l\27\3\2\2\2mq\7\22\2\2np"+
		"\5\b\5\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2t"+
		"u\7\23\2\2u\31\3\2\2\2v\u0084\7\20\2\2w\u0083\5\32\16\2x\u0083\5\30\r"+
		"\2y\u0083\7\32\2\2z\177\7\31\2\2{}\7\b\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2"+
		"\2~\u0080\5\30\r\2\177|\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\u0083\7\17\2\2\u0082w\3\2\2\2\u0082x\3\2\2\2\u0082y\3\2\2\2\u0082"+
		"z\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\21\2\2\u0088\33\3\2\2\2\u0089\u009d\5\32\16\2\u008a\u008f\7\31\2\2"+
		"\u008b\u008d\7\b\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\5\30\r\2\u008f\u008c\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0096\7\31\2\2\u0092\u0094\7\b\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\5\30\r\2"+
		"\u0096\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a"+
		"\7\32\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u009d\5\30\r\2\u009c\u0089\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\35\3\2\2\2\31\')\63AGNUZ_aekq|\177\u0082\u0084\u008c\u008f"+
		"\u0093\u0096\u0099\u009c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
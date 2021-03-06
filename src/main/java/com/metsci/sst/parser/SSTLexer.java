// Generated from C:\Users\hughes\git\sst\src\main\resources\SST.g4 by ANTLR 4.1
package com.metsci.sst.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SSTLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Quit=1, Read=2, Print=3, New=4, Equals=5, Colon=6, Double=7, Float=8, 
		Bool=9, True=10, False=11, Dollar=12, String=13, LP=14, RP=15, LB=16, 
		RB=17, CopySignal=18, CompareSignals=19, ClearSignal=20, PrintEigenrays=21, 
		PrintGSMEigenrays=22, Identifier=23, Number=24, WhiteSpace=25, MulitlineComment=26, 
		SinglelineComment=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'quit'", "'read'", "'print'", "'new'", "'='", "':'", "'double'", "'float'", 
		"'bool'", "'true'", "'false'", "'$'", "String", "'('", "')'", "'{'", "'}'", 
		"'CopySignal'", "'CompareSignals'", "'ClearSignal'", "'PrintEigenrays'", 
		"'PrintGSMEigenrays'", "Identifier", "Number", "WhiteSpace", "MulitlineComment", 
		"SinglelineComment"
	};
	public static final String[] ruleNames = {
		"Quit", "Read", "Print", "New", "Equals", "Colon", "Double", "Float", 
		"Bool", "True", "False", "Dollar", "String", "LP", "RP", "LB", "RB", "CopySignal", 
		"CompareSignals", "ClearSignal", "PrintEigenrays", "PrintGSMEigenrays", 
		"Identifier", "Number", "ValidIdChar", "Letter", "Digit", "WhiteSpace", 
		"MulitlineComment", "SinglelineComment"
	};


	public SSTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SST.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;

		case 28: MulitlineComment_action((RuleContext)_localctx, actionIndex); break;

		case 29: SinglelineComment_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SinglelineComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = 1;  break;
		}
	}
	private void MulitlineComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = 1;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u012c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\7\16y\n\16\f\16\16\16|\13\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00d1\n\30\f\30\16"+
		"\30\u00d4\13\30\3\31\5\31\u00d7\n\31\3\31\6\31\u00da\n\31\r\31\16\31\u00db"+
		"\3\31\3\31\7\31\u00e0\n\31\f\31\16\31\u00e3\13\31\5\31\u00e5\n\31\3\31"+
		"\7\31\u00e8\n\31\f\31\16\31\u00eb\13\31\3\31\5\31\u00ee\n\31\3\31\6\31"+
		"\u00f1\n\31\r\31\16\31\u00f2\5\31\u00f5\n\31\3\31\3\31\5\31\u00f9\n\31"+
		"\3\31\6\31\u00fc\n\31\r\31\16\31\u00fd\5\31\u0100\n\31\3\32\3\32\3\32"+
		"\5\32\u0105\n\32\3\33\3\33\3\34\3\34\3\35\6\35\u010c\n\35\r\35\16\35\u010d"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0116\n\36\f\36\16\36\u0119\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0123\n\37\3\37\7\37\u0126"+
		"\n\37\f\37\16\37\u0129\13\37\3\37\3\37\3\u0117 \3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\2\1\65\2\1\67\2\19\33\2;\34\3=\35\4\3\2\t\5\2\f\f\17\17$$\4\2--//"+
		"\4\2\60\60aa\4\2&&C|\5\2&&\62;aa\b\2\13\f\17\17\"\"..\60\60==\4\2\f\f"+
		"\17\17\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2"+
		"\5D\3\2\2\2\7I\3\2\2\2\tO\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21"+
		"^\3\2\2\2\23d\3\2\2\2\25i\3\2\2\2\27n\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2"+
		"\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0087"+
		"\3\2\2\2\'\u0092\3\2\2\2)\u00a1\3\2\2\2+\u00ad\3\2\2\2-\u00bc\3\2\2\2"+
		"/\u00ce\3\2\2\2\61\u00d6\3\2\2\2\63\u0104\3\2\2\2\65\u0106\3\2\2\2\67"+
		"\u0108\3\2\2\29\u010b\3\2\2\2;\u0111\3\2\2\2=\u0122\3\2\2\2?@\7s\2\2@"+
		"A\7w\2\2AB\7k\2\2BC\7v\2\2C\4\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7c\2\2GH\7f"+
		"\2\2H\6\3\2\2\2IJ\7r\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\b\3\2\2"+
		"\2OP\7p\2\2PQ\7g\2\2QR\7y\2\2R\n\3\2\2\2ST\7?\2\2T\f\3\2\2\2UV\7<\2\2"+
		"V\16\3\2\2\2WX\7f\2\2XY\7q\2\2YZ\7w\2\2Z[\7d\2\2[\\\7n\2\2\\]\7g\2\2]"+
		"\20\3\2\2\2^_\7h\2\2_`\7n\2\2`a\7q\2\2ab\7c\2\2bc\7v\2\2c\22\3\2\2\2d"+
		"e\7d\2\2ef\7q\2\2fg\7q\2\2gh\7n\2\2h\24\3\2\2\2ij\7v\2\2jk\7t\2\2kl\7"+
		"w\2\2lm\7g\2\2m\26\3\2\2\2no\7h\2\2op\7c\2\2pq\7n\2\2qr\7u\2\2rs\7g\2"+
		"\2s\30\3\2\2\2tu\7&\2\2u\32\3\2\2\2vz\7$\2\2wy\n\2\2\2xw\3\2\2\2y|\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~\34\3\2\2\2\177"+
		"\u0080\7*\2\2\u0080\36\3\2\2\2\u0081\u0082\7+\2\2\u0082 \3\2\2\2\u0083"+
		"\u0084\7}\2\2\u0084\"\3\2\2\2\u0085\u0086\7\177\2\2\u0086$\3\2\2\2\u0087"+
		"\u0088\7E\2\2\u0088\u0089\7q\2\2\u0089\u008a\7r\2\2\u008a\u008b\7{\2\2"+
		"\u008b\u008c\7U\2\2\u008c\u008d\7k\2\2\u008d\u008e\7i\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091&\3\2\2\2\u0092\u0093"+
		"\7E\2\2\u0093\u0094\7q\2\2\u0094\u0095\7o\2\2\u0095\u0096\7r\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a\7U\2\2"+
		"\u009a\u009b\7k\2\2\u009b\u009c\7i\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0(\3\2\2\2\u00a1\u00a2"+
		"\7E\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7i\2\2"+
		"\u00a9\u00aa\7p\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac*\3\2\2"+
		"\2\u00ad\u00ae\7R\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7i\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7t\2\2"+
		"\u00b8\u00b9\7c\2\2\u00b9\u00ba\7{\2\2\u00ba\u00bb\7u\2\2\u00bb,\3\2\2"+
		"\2\u00bc\u00bd\7R\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7I\2\2\u00c2\u00c3\7U\2\2\u00c3"+
		"\u00c4\7O\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7i\2\2"+
		"\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7{\2\2\u00cc\u00cd\7u\2\2\u00cd.\3\2\2\2\u00ce\u00d2"+
		"\5\65\33\2\u00cf\u00d1\5\63\32\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\60\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00f4\3\2\2\2\u00d8\u00da\5\67\34\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e4\3\2\2\2\u00dd"+
		"\u00e1\7\60\2\2\u00de\u00e0\5\67\34\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f5\3\2"+
		"\2\2\u00e6\u00e8\5\67\34\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00f1\5\67\34\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00d9\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f5\u00ff\3\2\2\2\u00f6\u00f8\7g"+
		"\2\2\u00f7\u00f9\7/\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00fc\5\67\34\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00f6\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\62\3\2\2\2\u0101\u0105\5\65\33"+
		"\2\u0102\u0105\5\67\34\2\u0103\u0105\t\4\2\2\u0104\u0101\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\64\3\2\2\2\u0106\u0107\t\5\2"+
		"\2\u0107\66\3\2\2\2\u0108\u0109\t\6\2\2\u01098\3\2\2\2\u010a\u010c\t\7"+
		"\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\35\2\2\u0110:\3\2\2\2"+
		"\u0111\u0112\7\61\2\2\u0112\u0113\7,\2\2\u0113\u0117\3\2\2\2\u0114\u0116"+
		"\13\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b"+
		"\7,\2\2\u011b\u011c\7\61\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\36\3\2"+
		"\u011e<\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0123\7\61\2\2\u0121\u0123"+
		"\7%\2\2\u0122\u011f\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0127\3\2\2\2\u0124"+
		"\u0126\n\b\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012b\b\37\4\2\u012b>\3\2\2\2\25\2z\u00d2\u00d6\u00db\u00e1\u00e4\u00e9"+
		"\u00ed\u00f2\u00f4\u00f8\u00fd\u00ff\u0104\u010d\u0117\u0122\u0127";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
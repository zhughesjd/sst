// Generated from C:\Users\Joshua\Desktop\SST.g4 by ANTLR 4.1
package com.metsci.sst.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SSTParser}.
 */
public interface SSTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SSTParser#clearsignal}.
	 * @param ctx the parse tree
	 */
	void enterClearsignal(@NotNull SSTParser.ClearsignalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#clearsignal}.
	 * @param ctx the parse tree
	 */
	void exitClearsignal(@NotNull SSTParser.ClearsignalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#identifierbrackets}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierbrackets(@NotNull SSTParser.IdentifierbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#identifierbrackets}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierbrackets(@NotNull SSTParser.IdentifierbracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SSTParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SSTParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#printeigenrays}.
	 * @param ctx the parse tree
	 */
	void enterPrinteigenrays(@NotNull SSTParser.PrinteigenraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#printeigenrays}.
	 * @param ctx the parse tree
	 */
	void exitPrinteigenrays(@NotNull SSTParser.PrinteigenraysContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#copysignal}.
	 * @param ctx the parse tree
	 */
	void enterCopysignal(@NotNull SSTParser.CopysignalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#copysignal}.
	 * @param ctx the parse tree
	 */
	void exitCopysignal(@NotNull SSTParser.CopysignalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#copysignalvalue}.
	 * @param ctx the parse tree
	 */
	void enterCopysignalvalue(@NotNull SSTParser.CopysignalvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#copysignalvalue}.
	 * @param ctx the parse tree
	 */
	void exitCopysignalvalue(@NotNull SSTParser.CopysignalvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#comparesignals}.
	 * @param ctx the parse tree
	 */
	void enterComparesignals(@NotNull SSTParser.ComparesignalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#comparesignals}.
	 * @param ctx the parse tree
	 */
	void exitComparesignals(@NotNull SSTParser.ComparesignalsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull SSTParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull SSTParser.ReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#sstinput}.
	 * @param ctx the parse tree
	 */
	void enterSstinput(@NotNull SSTParser.SstinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#sstinput}.
	 * @param ctx the parse tree
	 */
	void exitSstinput(@NotNull SSTParser.SstinputContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(@NotNull SSTParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(@NotNull SSTParser.ParenthesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(@NotNull SSTParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(@NotNull SSTParser.BracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#assignmentvalue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentvalue(@NotNull SSTParser.AssignmentvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#assignmentvalue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentvalue(@NotNull SSTParser.AssignmentvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#quit}.
	 * @param ctx the parse tree
	 */
	void enterQuit(@NotNull SSTParser.QuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#quit}.
	 * @param ctx the parse tree
	 */
	void exitQuit(@NotNull SSTParser.QuitContext ctx);

	/**
	 * Enter a parse tree produced by {@link SSTParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull SSTParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSTParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull SSTParser.PrintContext ctx);
}
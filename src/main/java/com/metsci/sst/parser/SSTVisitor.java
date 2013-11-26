// Generated from C:\Users\Joshua\Desktop\SST.g4 by ANTLR 4.1
package com.metsci.sst.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SSTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SSTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SSTParser#clearsignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearsignal(@NotNull SSTParser.ClearsignalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#identifierbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierbrackets(@NotNull SSTParser.IdentifierbracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SSTParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#printeigenrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinteigenrays(@NotNull SSTParser.PrinteigenraysContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#copysignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopysignal(@NotNull SSTParser.CopysignalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#copysignalvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopysignalvalue(@NotNull SSTParser.CopysignalvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#comparesignals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparesignals(@NotNull SSTParser.ComparesignalsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull SSTParser.ReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#sstinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSstinput(@NotNull SSTParser.SstinputContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#parenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(@NotNull SSTParser.ParenthesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(@NotNull SSTParser.BracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#assignmentvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentvalue(@NotNull SSTParser.AssignmentvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#quit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit(@NotNull SSTParser.QuitContext ctx);

	/**
	 * Visit a parse tree produced by {@link SSTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull SSTParser.PrintContext ctx);
}
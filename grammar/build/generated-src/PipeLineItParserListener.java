// Generated from /Users/Ivan/Development/Sandboxes/wesovi/languages/WesoviLang/grammar/src/main/antlr4/PipeLineItParser.g4 by ANTLR 4.2.2
package com.wesovi.lang.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PipeLineItParser}.
 */
public interface PipeLineItParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(@NotNull PipeLineItParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(@NotNull PipeLineItParser.TaskContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#onError}.
	 * @param ctx the parse tree
	 */
	void enterOnError(@NotNull PipeLineItParser.OnErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#onError}.
	 * @param ctx the parse tree
	 */
	void exitOnError(@NotNull PipeLineItParser.OnErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#dependency}.
	 * @param ctx the parse tree
	 */
	void enterDependency(@NotNull PipeLineItParser.DependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#dependency}.
	 * @param ctx the parse tree
	 */
	void exitDependency(@NotNull PipeLineItParser.DependencyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#jobs}.
	 * @param ctx the parse tree
	 */
	void enterJobs(@NotNull PipeLineItParser.JobsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#jobs}.
	 * @param ctx the parse tree
	 */
	void exitJobs(@NotNull PipeLineItParser.JobsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull PipeLineItParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull PipeLineItParser.HeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#job}.
	 * @param ctx the parse tree
	 */
	void enterJob(@NotNull PipeLineItParser.JobContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#job}.
	 * @param ctx the parse tree
	 */
	void exitJob(@NotNull PipeLineItParser.JobContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#tasks}.
	 * @param ctx the parse tree
	 */
	void enterTasks(@NotNull PipeLineItParser.TasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#tasks}.
	 * @param ctx the parse tree
	 */
	void exitTasks(@NotNull PipeLineItParser.TasksContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#dependendies}.
	 * @param ctx the parse tree
	 */
	void enterDependendies(@NotNull PipeLineItParser.DependendiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#dependendies}.
	 * @param ctx the parse tree
	 */
	void exitDependendies(@NotNull PipeLineItParser.DependendiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PipeLineItParser#onSuccess}.
	 * @param ctx the parse tree
	 */
	void enterOnSuccess(@NotNull PipeLineItParser.OnSuccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipeLineItParser#onSuccess}.
	 * @param ctx the parse tree
	 */
	void exitOnSuccess(@NotNull PipeLineItParser.OnSuccessContext ctx);
}
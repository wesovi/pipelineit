// Generated from /Users/Ivan/Development/Sandboxes/wesovi/languages/WesoviLang/grammar/src/main/antlr4/PipeLineIt.g4 by ANTLR 4.2.2
package com.wesovi.lang.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PipeLineItParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PipeLineItVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(@NotNull PipeLineItParser.TaskContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#onError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnError(@NotNull PipeLineItParser.OnErrorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#dependency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency(@NotNull PipeLineItParser.DependencyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#jobs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobs(@NotNull PipeLineItParser.JobsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(@NotNull PipeLineItParser.HeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#job}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJob(@NotNull PipeLineItParser.JobContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#tasks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTasks(@NotNull PipeLineItParser.TasksContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#dependendies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependendies(@NotNull PipeLineItParser.DependendiesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PipeLineItParser#onSuccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSuccess(@NotNull PipeLineItParser.OnSuccessContext ctx);
}
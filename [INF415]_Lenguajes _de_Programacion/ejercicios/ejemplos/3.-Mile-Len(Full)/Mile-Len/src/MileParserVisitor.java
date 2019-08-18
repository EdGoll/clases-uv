// Generated from MileParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MileParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MileParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MileParserParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(MileParserParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MileParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MileParserParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#start_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_block(MileParserParser.Start_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_block(MileParserParser.End_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(MileParserParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(MileParserParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(MileParserParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(MileParserParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MileParserParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(MileParserParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(MileParserParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(MileParserParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(MileParserParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MileParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MileParserParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(MileParserParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MileParserParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MileParserParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link MileParserParser#read_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(MileParserParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MileParserParser#write_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MileParserParser.PrintContext ctx);
}
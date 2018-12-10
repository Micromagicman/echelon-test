// Generated from Echelon.g4 by ANTLR 4.7.1

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EchelonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EchelonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EchelonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EchelonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchelonParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(EchelonParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchelonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EchelonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstPriorityExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstPriorityExpression(EchelonParser.FirstPriorityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(EchelonParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(EchelonParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpression(EchelonParser.NumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(EchelonParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code secondPriorityExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondPriorityExpression(EchelonParser.SecondPriorityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchelonParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(EchelonParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link EchelonParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(EchelonParser.Op2Context ctx);
}
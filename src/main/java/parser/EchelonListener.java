// Generated from Echelon.g4 by ANTLR 4.7.1

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EchelonParser}.
 */
public interface EchelonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EchelonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EchelonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchelonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EchelonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchelonParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(EchelonParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchelonParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(EchelonParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchelonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EchelonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchelonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EchelonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstPriorityExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFirstPriorityExpression(EchelonParser.FirstPriorityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstPriorityExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFirstPriorityExpression(EchelonParser.FirstPriorityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(EchelonParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(EchelonParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(EchelonParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(EchelonParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(EchelonParser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(EchelonParser.NumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(EchelonParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(EchelonParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code secondPriorityExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSecondPriorityExpression(EchelonParser.SecondPriorityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code secondPriorityExpression}
	 * labeled alternative in {@link EchelonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSecondPriorityExpression(EchelonParser.SecondPriorityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchelonParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(EchelonParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link EchelonParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(EchelonParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link EchelonParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(EchelonParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link EchelonParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(EchelonParser.Op2Context ctx);
}
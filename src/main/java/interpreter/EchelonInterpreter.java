package interpreter;

import interpreter.exception.VariableNotDefinedException;
import interpreter.operation.BinaryOperation;
import interpreter.operation.OperationFactory;
import parser.EchelonBaseVisitor;
import parser.EchelonParser;

public class EchelonInterpreter extends EchelonBaseVisitor<Integer> {

    private VariableSet variables;  // Хранилище переменных

    public EchelonInterpreter() {
        this.variables = new VariableSet();
    }

    @Override
    public Integer visitProgram(EchelonParser.ProgramContext ctx) {
        // Так как программа состоит из строк, проходимся по всем найденным строкам
        for (int i = 0; i < ctx.line().size(); i++) {
            this.visit(ctx.line(i));
        }

        return 0;
    }

    @Override
    public Integer visitLine(EchelonParser.LineContext ctx) {
        if (ctx.expression() != null) {
            System.out.println(this.visit(ctx.expression()));
        }

        if (ctx.assignment() != null) {
            this.visit(ctx.assignment());
        }

        return 0;
    }

    @Override
    public Integer visitAssignment(EchelonParser.AssignmentContext ctx) {
        this.variables.set(
                ctx.VARIABLE().getText(),
                this.visit(ctx.expression())
        );

        return 0;
    }

    @Override
    public Integer visitFirstPriorityExpression(EchelonParser.FirstPriorityExpressionContext ctx) {
        return calculateBinaryOperation(
                ctx.op1().getText(),
                this.visit(ctx.left),
                this.visit(ctx.right)
        );
    }

    @Override
    public Integer visitSecondPriorityExpression(EchelonParser.SecondPriorityExpressionContext ctx) {
        return calculateBinaryOperation(
                ctx.op2().getText(),
                this.visit(ctx.left),
                this.visit(ctx.right)
        );
    }

    @Override
    public Integer visitParenthesisExpression(EchelonParser.ParenthesisExpressionContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Integer visitNumericExpression(EchelonParser.NumericExpressionContext ctx) {
        return Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override
    public Integer visitVariableExpression(EchelonParser.VariableExpressionContext ctx) {
        int variableValue = 0;

        try {
            variableValue = this.variables.get(ctx.VARIABLE().getText());
        } catch (VariableNotDefinedException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        return variableValue;
    }

    @Override
    public Integer visitUnaryExpression(EchelonParser.UnaryExpressionContext ctx) {
        return -this.visit(ctx.expression());
    }

    private Integer calculateBinaryOperation(String sign, int left, int right) {
        BinaryOperation operation = (BinaryOperation) OperationFactory.createOperation(sign);
        operation.setRight(right);
        operation.setLeft(left);

        return operation.execute();
    }
}

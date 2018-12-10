package interpreter.operation;

public class Divide extends BinaryOperation {

    Divide() {
        this.right = 1;
    }

    @Override
    public void setRight(int right) {
        this.checkRightOperand();
        super.setRight(right);
    }

    @Override
    public int execute() {
        this.checkRightOperand();
        return left / right;
    }

    private void checkRightOperand() {
        if (this.right == 0) {
            throw new IllegalArgumentException("Правый операнд для операции деления не может быть равен нулю");
        }
    }
}

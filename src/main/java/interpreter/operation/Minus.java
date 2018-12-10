package interpreter.operation;

public class Minus extends BinaryOperation {

    @Override
    public int execute() {
        return this.left - this.right;
    }
}

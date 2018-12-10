package interpreter.operation;

public class Multiply extends BinaryOperation {

    @Override
    public int execute() {
        return this.left * this.right;
    }
}

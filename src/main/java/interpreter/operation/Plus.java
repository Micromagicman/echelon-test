package interpreter.operation;

public class Plus extends BinaryOperation  {

    @Override
    public int execute() {
        return this.left + this.right;
    }
}

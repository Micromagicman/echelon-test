package interpreter.operation;

public abstract class BinaryOperation implements IOperation {

    protected int left;

    protected int right;

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }
}

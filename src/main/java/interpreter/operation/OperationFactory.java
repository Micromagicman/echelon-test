package interpreter.operation;

public class OperationFactory {

    public static IOperation createOperation(String sign) {
        switch (sign) {
            case "+": return new Plus();
            case "-": return new Minus();
            case "*": return new Multiply();
            case "/": return new Divide();
            default: return new Plus();
        }
    }
}

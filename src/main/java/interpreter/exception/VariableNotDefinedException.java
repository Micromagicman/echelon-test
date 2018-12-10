package interpreter.exception;

public class VariableNotDefinedException extends InterpreterException {

    public VariableNotDefinedException(String name) {
        super("Переменная с именем '" + name + "' не определена");
    }
}

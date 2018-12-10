package interpreter;

import interpreter.exception.VariableNotDefinedException;

import java.util.HashMap;

class VariableSet {

    private HashMap<String, Integer> variables;

    VariableSet() {
        this.variables = new HashMap<>();
    }

    int get(String name) throws VariableNotDefinedException {
        if (!this.variables.containsKey(name)) {
            throw new VariableNotDefinedException(name);
        }

        return this.variables.get(name);
    }

    void set(String name, int value) {
        this.variables.put(name, value);
    }
}

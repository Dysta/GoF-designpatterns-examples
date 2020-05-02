package Interpreter;

public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String expression) {
        return data.contains(expression);
    }
}

package Interpreter;

public class AndExpression implements Expression {
    private Expression e1,e2;

    AndExpression(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public boolean interpreter(String expression) {
        return e1.interpreter(expression) && e2.interpreter(expression);
    }
}

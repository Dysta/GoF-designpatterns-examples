package Interpreter;

public class InterpreterTest {
    public static void main(String[] args){
        Expression e1 = new TerminalExpression("Ann");
        Expression e2 = new TerminalExpression("Daniel");

        Expression or = new OrExpression(e1,e2);

        System.out.println(or.interpreter("Ann"));
    }
}

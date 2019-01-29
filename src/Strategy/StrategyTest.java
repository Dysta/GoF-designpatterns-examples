package Strategy;

public class StrategyTest {
    public static void main(String[] args){
        Context context = new Context(new PayPalStrategy());
        context.execute(15);

        context = new Context(new CreditCardStrategy());
        context.execute(20);
    }
}

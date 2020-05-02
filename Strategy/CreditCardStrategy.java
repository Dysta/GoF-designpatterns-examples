package Strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(int price) {
        System.out.println("You've paid with cc");
    }
}

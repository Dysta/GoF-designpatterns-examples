package Strategy;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(int price) {
        System.out.println("You've paid with PayPal");
    }
}

package Strategy;

public class Context {
    private PaymentStrategy strategy;

    public Context(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int price){
        strategy.pay(price);
    }
}

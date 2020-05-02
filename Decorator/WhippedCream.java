package Decorator;

public class WhippedCream extends CoffeeDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void displayIngredients() {
        coffee.displayIngredients();
        System.out.print("+WhippedCream");
    }
}

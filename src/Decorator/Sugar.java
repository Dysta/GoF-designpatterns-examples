package Decorator;

public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void displayIngredients() {
        coffee.displayIngredients();
        System.out.print("+Sugar");
    }
}

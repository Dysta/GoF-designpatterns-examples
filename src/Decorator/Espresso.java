package Decorator;

public class Espresso implements Coffee {
    @Override
    public void displayIngredients() {
        System.out.print("Espresso");
    }
}

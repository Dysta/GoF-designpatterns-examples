package Decorator;

public class Latte implements Coffee {
    @Override
    public void displayIngredients() {
        System.out.print("Latte");
    }
}

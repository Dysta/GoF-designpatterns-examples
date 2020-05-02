package Decorator;

public class DecoratorTest {
    public static void main(String[] args){
        Coffee coffee = new Latte();
        coffee.displayIngredients();
        System.out.println();
        coffee = new Espresso();
        coffee.displayIngredients();
        System.out.println();

        coffee = new Sugar(new Sugar(new Sugar(new Latte())));
        coffee.displayIngredients();
    }
}

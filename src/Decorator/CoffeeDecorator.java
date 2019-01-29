package Decorator;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

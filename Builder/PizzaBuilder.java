package Builder;

// "Builder abstraction"
public interface PizzaBuilder {
    Pizza build();
    PizzaBuilder setDough(String dough);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder setTopping(String topping);
}

package Builder;

public class PizzaBuilderImpl implements PizzaBuilder {
    private Pizza pizzaTmp;

    public PizzaBuilderImpl() {
        pizzaTmp = new Pizza();
    }

    @Override
    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setDough(pizzaTmp.getDough());
        pizza.setTopping(pizzaTmp.getTopping());
        pizza.setSauce(pizzaTmp.getSauce());
        return pizza;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        pizzaTmp.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        pizzaTmp.setSauce(sauce);
        return this;
    }

    @Override
    public PizzaBuilder setTopping(String topping) {
        pizzaTmp.setTopping(topping);
        return this;
    }
}

package Builder;

//"Director"
public class PizzaBuildDirector {
    PizzaBuilder pizzaBuilder;

    public PizzaBuildDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza construct(){
        return pizzaBuilder
                .setDough("pan baked")
                .setSauce("bbq")
                .setTopping("salami")
                .build();
    }
}

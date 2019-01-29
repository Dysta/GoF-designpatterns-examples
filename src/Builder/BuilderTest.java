package Builder;

public class BuilderTest {
    public static void main(String[] args){
        PizzaBuilder builder = new PizzaBuilderImpl();
        PizzaBuildDirector director = new PizzaBuildDirector(builder);
        System.out.print(director.construct());
    }
}

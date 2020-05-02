package AbstractFactory;

public class FactoryProducer {
    public static CarFactory getCarFactory(String country){
        if(country.equals("Poland")) return new PolishCarFactory();
        else return new GermanCarFactory();
    }
}

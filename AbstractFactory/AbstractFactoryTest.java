package AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args){
        CarFactory cf = FactoryProducer.getCarFactory("Poland");
        Car car = cf.getCar("Polonez");
        car.getModel();
    }
}

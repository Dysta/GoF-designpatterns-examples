package AbstractFactory;

public class PolishCarFactory implements CarFactory{

    @Override
    public Car getCar(String type) {
        if(type.equals("Polonez")) return new Polonez();
        else return new Syrena();
    }
}

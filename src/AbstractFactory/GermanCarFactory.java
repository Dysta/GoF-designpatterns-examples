package AbstractFactory;

public class GermanCarFactory implements CarFactory{

    @Override
    public Car getCar(String type) {
        if(type.equals("Mercedes")) return new Mercedes();
        else return new Polonez();
    }
}

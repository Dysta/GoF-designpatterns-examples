package Factory;

public class VehicleFactory {
    Vehicle createVehicle(String type){
        if(type.equals("plane")) return new Plane();
        else return new Ship();
    }
}

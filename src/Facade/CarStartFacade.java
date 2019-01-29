package Facade;

public class CarStartFacade {
    private Engine engine;
    private Lights lights;

    public CarStartFacade() {
        this.engine = new Engine();
        this.lights = new Lights();
    }

    void start(){
        engine.turnOnEngine();
        lights.turnOnLights();
    }

    void stop(){
        lights.turnOffLights();
        engine.turnOffEngine();
    }
}

package Singleton;

public class SampleSingletonClass {
    private static SampleSingletonClass singleton = new SampleSingletonClass();
    private SampleSingletonClass(){}

    public static SampleSingletonClass getInstance() {
        return singleton;
    }
}

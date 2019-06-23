package Singleton;

public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){}

    private static DoubleCheckedLockingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

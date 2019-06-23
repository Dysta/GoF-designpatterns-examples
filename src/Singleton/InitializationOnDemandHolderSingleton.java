package Singleton;

public class InitializationOnDemandHolderSingleton {
    private InitializationOnDemandHolderSingleton() {}

    private static class LazyHolder {
        private static final InitializationOnDemandHolderSingleton INSTANCE =
                new InitializationOnDemandHolderSingleton();
    }

    public static InitializationOnDemandHolderSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}

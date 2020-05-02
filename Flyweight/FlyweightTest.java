package Flyweight;

public class FlyweightTest {
    public static void main(String[] args){
        ChainFactory factory = new ChainFactory();

        Chain c1 = factory.getChain(ChainFactory.ChainType.X);
        c1.setLength(5);
        Chain c2 = factory.getChain(ChainFactory.ChainType.Y);
        c2.setLength(6);
        Chain c3 = factory.getChain(ChainFactory.ChainType.X);
        c3.setLength(6);
        Chain c4 = factory.getChain(ChainFactory.ChainType.Y);
        c4.setLength(8);

        c1.draw();
        c2.draw();
        c3.draw();
        c4.draw();
    }
}

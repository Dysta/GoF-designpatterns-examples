package Bridge;

public class BridgeTest {
    public static void main(String[] args){
        Shape oct = new Octagon(new Red());
        Shape pent = new Pentagon(new Yellow());

        oct.fill();
        pent.fill();
    }
}

package State;

public class Slow implements State {
    @Override
    public void pull(CeilingFanPullChain chain) {
        chain.setState(new Fast());
        System.out.println("Switched to the third state");
    }
}

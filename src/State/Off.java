package State;

public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain chain) {
        chain.setState(new Slow());
        System.out.println("Switched to the second state");
    }
}

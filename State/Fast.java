package State;

public class Fast implements State {
    @Override
    public void pull(CeilingFanPullChain chain) {
        chain.setState(new Off());
        System.out.println("Switched back to the first state");
    }
}

package State;

public class CeilingFanPullChain {
    private State currState;

    public CeilingFanPullChain() {
        this.currState = new Off();
    }

    public void setState(State s){
        currState = s;
    }

    public void switchToNextState(){
        currState.pull(this);
    }
}

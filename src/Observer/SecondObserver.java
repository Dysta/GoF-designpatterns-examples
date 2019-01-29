package Observer;

public class SecondObserver extends Observer {
    public SecondObserver(Subject s) {
        subject = s;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("New subject status is: " + subject.getState());
    }
}

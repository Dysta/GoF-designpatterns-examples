package Observer;

public class FirstObserver extends Observer {
    public FirstObserver(Subject s) {
        subject = s;
        s.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Subject state was changed to: " + subject.getState());
    }
}

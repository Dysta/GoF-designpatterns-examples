package Observer;

import java.util.Scanner;

public class ObserverTest {
    public static void main(String[] args){
        Subject subject = new Subject();

        new FirstObserver(subject);
        new FirstObserver(subject);
        new SecondObserver(subject);

        subject.setState("Off");

        new Scanner(System.in).nextLine();
        subject.setState("On");
    }
}

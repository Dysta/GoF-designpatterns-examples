package State;

import java.util.Scanner;

public class StateTest {
    public static void main(String[] args){
        CeilingFanPullChain chain = new CeilingFanPullChain();
        Scanner scanner = new Scanner(System.in);
        while (true){
            scanner.nextLine();
            chain.switchToNextState();
        }
    }
}

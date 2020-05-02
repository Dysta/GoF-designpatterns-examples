package ChainOfResponsibility;

import java.util.Scanner;

public class ChainOfResponsibilityTest {
    public static void main(String[] args){
        ATMDispenseChain atm = new ATMDispenseChain();
        atm.setChain();
        while (true){
            int amount;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10");
            }else
                atm.firstChain.dispense(new Currency(amount));
        }
    }
}

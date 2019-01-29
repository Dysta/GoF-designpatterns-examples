package Proxy;

import java.util.Scanner;

public class ProxyTest {
    public static void main(String[] args){
        AccountImpl acc = new AccountImpl("login","password");

        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        String password = in.nextLine();

        Account proxy = new AccountProxy(acc, login, password);
        proxy.makeBillionDollarTransfer();
    }
}

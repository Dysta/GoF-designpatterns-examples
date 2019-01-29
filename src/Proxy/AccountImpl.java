package Proxy;

public class AccountImpl implements Account {
    String login, password;

    public AccountImpl(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void makeBillionDollarTransfer(){
        System.out.println("Transfer has been made successfully!");
    }
}

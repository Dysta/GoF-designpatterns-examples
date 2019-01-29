package Proxy;

public class AccountProxy implements Account{
    AccountImpl account;
    String login;
    String password;

    public AccountProxy(AccountImpl account, String login, String password) {
        this.account = account;
        this.login = login;
        this.password = password;
    }


    @Override
    public void makeBillionDollarTransfer() {
        if(login.equals(account.login) && password.equals(account.password)){
            account.makeBillionDollarTransfer();
        }else{
            System.out.println("Access denied!");
        }
    }
}

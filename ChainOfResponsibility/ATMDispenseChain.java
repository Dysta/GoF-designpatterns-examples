package ChainOfResponsibility;

public class ATMDispenseChain {
    public DispenseChain firstChain;

    public void setChain(){
        DispenseChain hundred = new PLNDispenser(100);
        DispenseChain fifty = new PLNDispenser(50);
        DispenseChain twenty = new PLNDispenser(20);
        DispenseChain ten = new PLNDispenser(10);

        firstChain = hundred;

        hundred.setNextChain(fifty);
        fifty.setNextChain(twenty);
        twenty.setNextChain(ten);
    }
}

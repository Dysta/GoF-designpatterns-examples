package ChainOfResponsibility;

public class PLNDispenser implements DispenseChain{
    private DispenseChain nextChain;
    private int amount;

    public PLNDispenser(DispenseChain nextChain, int amount) {
        this.nextChain = nextChain;
        this.amount = amount;
    }

    public PLNDispenser(int amount) {
        this.amount = amount;
    }

    private PLNDispenser(){}

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.nextChain = dispenseChain;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount() >= amount){
            int num = curr.getAmount()/amount;
            int remainder = curr.getAmount() % amount;
            System.out.println("Dispensing "+num+" "+amount+"PLN banknote");
            if(remainder !=0) this.nextChain.dispense(new Currency(remainder));
        }else{
            this.nextChain.dispense(curr);
        }
    }
}

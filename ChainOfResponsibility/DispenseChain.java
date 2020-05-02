package ChainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);
    void dispense(Currency curr);
}

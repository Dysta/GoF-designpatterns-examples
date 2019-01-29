package Flyweight;

public class OChain implements Chain {
    private int length;

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        for(int i=0; i<length; i++){
            System.out.print("O");
        }
        System.out.println();
    }
}

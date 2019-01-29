package Visitor;

public class Book implements Item{
    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}

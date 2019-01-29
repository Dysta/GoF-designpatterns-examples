package Visitor;

public class CD implements Item {
    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}

package Visitor;

public interface Item {
    void accept(ItemVisitor visitor);
}

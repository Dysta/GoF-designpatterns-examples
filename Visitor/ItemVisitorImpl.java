package Visitor;

public class ItemVisitorImpl implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book visited!");
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD visited!");
    }
}

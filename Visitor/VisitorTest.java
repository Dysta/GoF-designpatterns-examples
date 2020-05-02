package Visitor;

public class VisitorTest {
    public static void main(String[] args){
        Item book = new Book();
        book.accept(new ItemVisitorImpl());
    }
}

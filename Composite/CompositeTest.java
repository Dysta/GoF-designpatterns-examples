package Composite;

public class CompositeTest {
    public static void main(String[] args){
        Shape s = new Rectangle();
        s.draw("Red");
        s = new Triangle();
        s.draw("Blue");
        System.out.println("-----------------------------------");

        ShapeComposite composite = new ShapeComposite();
        ShapeComposite composite1 = new ShapeComposite();
        composite.add(new Rectangle());
        composite.add(new Triangle());
        composite.add(new Rectangle());

        composite1.add(new Rectangle());
        composite1.add(new Triangle());

        composite.add(composite1);

        composite.draw("Yellow");
    }
}

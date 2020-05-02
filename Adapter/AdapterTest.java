package Adapter;

import java.util.ArrayList;
import java.util.List;


public class AdapterTest {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(6));
        shapes.add(new ComplexShapeAdapter(new MoreComplexCircle(5, "Yellow")));
        shapes.add(new ComplexShapeAdapter(new MoreComplexSquare(6, "Green")));

        for(Shape s: shapes){
            s.calculatePerimeter();
            s.calculateField();
        }
    }
}

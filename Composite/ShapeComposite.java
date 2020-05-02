package Composite;

import java.util.ArrayList;
import java.util.List;

//composite
public class ShapeComposite implements Shape{
    private List<Shape> list;

    public ShapeComposite(){
        this.list = new ArrayList<>();
    }

    public void add(Shape s){
        list.add(s);
    }

    public void remove(Shape s){
        list.remove(s);
    }

    public void clear(){
        list.clear();
    }

    @Override
    public void draw(String color) {
        for (Shape s:list) {
            s.draw(color);
        }
    }
}

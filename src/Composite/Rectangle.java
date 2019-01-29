package Composite;

//leaf
public class Rectangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println(color + " rectangle drawn");
    }
}

package Composite;

//leaf
public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println(color + " triangle drawn");
    }
}

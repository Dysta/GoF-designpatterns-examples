package Adapter;

public class Circle implements Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateField() {
        System.out.println("Circle field is: " + radius*radius*Math.PI);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle circumference is: " + 2*radius*Math.PI);
    }
}

package Adapter;

public class MoreComplexCircle implements MoreComplexShape {
    private int radius;
    private String color;

    MoreComplexCircle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void fillCollor(String color) {
        this.color = color;
    }

    @Override
    public void resize(int scale) {
        radius = radius*scale;
    }

    @Override
    public void countShapeField() {
        System.out.println("Circle field counting... ");
        System.out.println("The field is: " + radius*radius*Math.PI);
    }

    @Override
    public void countShapePerimeter() {
        System.out.println("Circle perimeter counting... ");
        System.out.println("The field is: " + 2*radius*Math.PI);
    }
}

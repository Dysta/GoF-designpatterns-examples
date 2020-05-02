package Adapter;

public class MoreComplexSquare implements MoreComplexShape {
    private int side;
    private String color;

    MoreComplexSquare(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void fillCollor(String color) {
        this.color = color;
    }

    @Override
    public void resize(int scale) {
        side = side*scale;
    }

    @Override
    public void countShapeField() {
        System.out.println("Square field counting... ");
        System.out.println("The field is: " + side*side);
    }

    @Override
    public void countShapePerimeter() {
        System.out.println("Circle perimeter counting... ");
        System.out.println("The field is: " + 4*side);
    }
}

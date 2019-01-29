package Adapter;

public class Square implements Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateField() {
        System.out.println("Square field is: " + side*side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square perimeter is: " + side*side);
    }
}

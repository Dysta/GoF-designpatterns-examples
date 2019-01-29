package Adapter;

public class ComplexShapeAdapter implements Shape {
    private MoreComplexShape adaptee;

    ComplexShapeAdapter(MoreComplexShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void calculateField() {
        adaptee.countShapeField();
    }

    @Override
    public void calculatePerimeter() {
        adaptee.countShapePerimeter();
    }
}

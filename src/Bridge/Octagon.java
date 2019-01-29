package Bridge;

public class Octagon extends Shape {
    public Octagon(Color c){
       super(c);
    }

    @Override
    void fill() {
        System.out.print("Octagon filled with ");
        color.fill();
        System.out.print(" color");
        System.out.println();
    }
}

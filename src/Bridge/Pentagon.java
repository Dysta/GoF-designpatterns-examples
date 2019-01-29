package Bridge;

public class Pentagon extends Shape {
    public Pentagon(Color c){
        super(c);
    }

    @Override
    void fill() {
        System.out.print("Pentagon filled with ");
        color.fill();
        System.out.print(" color");
        System.out.println();
    }
}

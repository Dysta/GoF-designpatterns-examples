package Bridge;

public abstract class Shape {
    Color color;

    public Shape(Color c){
        this.color = c;
    }

    abstract void fill();
}

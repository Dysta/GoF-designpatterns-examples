package Command;

public class Item {
    String name = "Wheel";
    int price = 1200;

    public void buy(){
        System.out.println("Item " + name + " bought for " + price);
    }

    public void fix(){
        System.out.println("Item " + name + " fixed");
        price += 400;
    }

    public void sell(){
        System.out.println("Item " + name + " sold for " + price);
    }
}

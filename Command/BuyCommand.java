package Command;

public class BuyCommand implements Command {
    private Item item;

    public BuyCommand(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.buy();
    }
}

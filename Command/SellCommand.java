package Command;

public class SellCommand implements Command {
    private Item item;

    public SellCommand(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.sell();
    }
}

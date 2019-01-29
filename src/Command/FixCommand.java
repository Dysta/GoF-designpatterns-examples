package Command;

public class FixCommand implements Command {
    private Item item;

    public FixCommand(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.fix();
    }
}

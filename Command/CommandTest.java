package Command;

public class CommandTest {
    public static void main(String[] args){
        Item item = new Item();
        Command buy = new BuyCommand(item);
        Command fix = new FixCommand(item);
        Command sell = new SellCommand(item);
        Invoker invoker = new Invoker();
        invoker.addCommand(buy);
        invoker.addCommand(fix);
        invoker.addCommand(sell);
        invoker.executeCommands();
    }
}

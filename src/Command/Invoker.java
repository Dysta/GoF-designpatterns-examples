package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands;

    public Invoker(){
        this.commands = new ArrayList<Command>();
    }

    public void addCommand(Command c){
        commands.add(c);
    }

    public void executeCommands(){
        for (Command c:commands){
            c.execute();
        }
        commands.clear();
    }
}

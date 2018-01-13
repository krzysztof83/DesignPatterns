package itemsForControl;

import commands.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Professional on 2018-01-13.
 */
public class MacroComand implements Command {
    public List<Command> getCommands() {
        return commands;
    }

    private List<Command> commands = new ArrayList<Command>();
    
    public void execute() {
        commands.forEach(c -> c.execute());
    }


}

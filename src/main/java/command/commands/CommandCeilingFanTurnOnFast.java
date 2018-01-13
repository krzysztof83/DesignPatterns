package commands;

import itemsForControl.CeilingFan;

/**
 * Created by Professional on 2018-01-13.
 */
public class CommandCeilingFanTurnOnFast implements Command {
    private CeilingFan ceilingFan;

    public CommandCeilingFanTurnOnFast(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.fast();
    }
}

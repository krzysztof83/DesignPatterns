package commands;

import itemsForControl.CeilingFan;

/**
 * Created by Professional on 2018-01-13.
 */
public class CommandCeilingFanTurnOff implements Command {
    private CeilingFan ceilingFan;

    public CommandCeilingFanTurnOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}

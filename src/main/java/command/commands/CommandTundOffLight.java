package commands;

import itemsForControl.Light;

/**
 * Created by Professional on 2018-01-11.
 */
public class CommandTundOffLight implements Command {

    Light light;

    public CommandTundOffLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

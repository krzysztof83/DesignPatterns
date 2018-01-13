package commands;

import itemsForControl.Light;

/**
 * Created by Professional on 2018-01-10.
 */
public class CommandTurnOnLight implements Command {

    Light light;

    public CommandTurnOnLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

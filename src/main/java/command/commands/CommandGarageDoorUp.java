package commands;

import itemsForControl.GarageDoor;

/**
 * Created by Professional on 2018-01-11.
 */
public class CommandGarageDoorUp implements Command {

    GarageDoor garageDoor;

    public CommandGarageDoorUp(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.doorUp();
        garageDoor.lightOn();
    }
}

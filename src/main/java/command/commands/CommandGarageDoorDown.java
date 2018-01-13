package commands;

import itemsForControl.GarageDoor;

/**
 * Created by Professional on 2018-01-11.
 */
public class CommandGarageDoorDown implements Command{

    GarageDoor garageDoor;

    public CommandGarageDoorDown(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.doorDown();
        garageDoor.lightOff();
    }
}

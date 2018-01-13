package itemsForControl;

import commands.Command;

/**
 * Created by Professional on 2018-01-10.
 */
public class SimpleRemoteControl {

    private static final int NUMBER_OF_BUTTONS_ON_REMOTE_CONTROL = 7;

    Command[] commandsOn;
    Command[] commandsOff;


    public SimpleRemoteControl() {
        this.commandsOn = new Command[NUMBER_OF_BUTTONS_ON_REMOTE_CONTROL];
        this.commandsOff = new Command[NUMBER_OF_BUTTONS_ON_REMOTE_CONTROL];

        Command emptyCommand = new Command() {
            public void execute() {
            }
        };
        for (int i = 0; i < NUMBER_OF_BUTTONS_ON_REMOTE_CONTROL; i++) {
            commandsOn[i] = emptyCommand;
            commandsOff[i] = emptyCommand;
        }
    }

    public void setCommandsInSlot(int slot, Command commandOn, Command commandOff) {
        if (slot >= 0 && slot < commandsOn.length && slot < commandsOff.length) {
            commandsOn[slot] = commandOn;
            commandsOff[slot] = commandOff;
        }
    }

    public void onButtonWasPushed(int slotPushed) {
        commandsOn[slotPushed].execute();
    }

    public void offButtonWasPushed(int slotPushed) {
        commandsOff[slotPushed].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < commandsOn.length; i++) {
            stringBuff.append("[slot " + i + "] " + commandsOn[i].getClass().getName()
                    + "    " + commandsOff[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}

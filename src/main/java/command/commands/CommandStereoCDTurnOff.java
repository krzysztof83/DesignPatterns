package commands;

import itemsForControl.Stereo;

/**
 * Created by Professional on 2018-01-11.
 */
public class CommandStereoCDTurnOff implements Command {

    Stereo stereo;

    public CommandStereoCDTurnOff(Stereo stereo) {
        this.stereo = stereo;
    }


    public void execute() {
        stereo.off();
    }
}

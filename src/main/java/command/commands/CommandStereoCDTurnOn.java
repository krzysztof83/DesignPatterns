package commands;

import itemsForControl.Stereo;

/**
 * Created by Professional on 2018-01-11.
 */
public class CommandStereoCDTurnOn implements Command {

    Stereo stereo;

    public CommandStereoCDTurnOn(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(7);
    }
}

package itemsForControl;

import rooms.RoomsEnum;

/**
 * Created by Professional on 2018-01-11.
 */
public class Stereo {
    RoomsEnum roomsEnum;

    public Stereo(RoomsEnum roomsEnum) {
        this.roomsEnum = roomsEnum;
    }

    public void on() {
        System.out.println(roomsEnum.getRoomName() + " stereo is on");
    }

    public void off() {
        System.out.println(roomsEnum.getRoomName() + " stereo is off");
    }

    public void setCD() {
        System.out.println(roomsEnum.getRoomName() + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(roomsEnum.getRoomName() + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(roomsEnum.getRoomName() + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        System.out.println(roomsEnum.getRoomName() + " Stereo volume set to " + volume);
    }
}

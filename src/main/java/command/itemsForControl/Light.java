package itemsForControl;

import rooms.RoomsEnum;

/**
 * Created by Professional on 2018-01-10.
 */
public class Light {

    private RoomsEnum roomsEnum;
    public Light(RoomsEnum roomsEnum){
        this.roomsEnum = roomsEnum;
    }

    public void turnOn() {
        System.out.println("Light On");
    }

    public void turnOff() {
        System.out.println("Light Off");
    }
}

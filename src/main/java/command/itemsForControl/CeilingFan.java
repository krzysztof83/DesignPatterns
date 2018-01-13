package itemsForControl;

import rooms.RoomsEnum;

/**
 * Created by Professional on 2018-01-12.
 */
public class CeilingFan {

    public static final int FAST = 3;
    public static final int MEDIUM = 2;
    public static final int SLOW = 1;
    public static final int OFF = 0;

    private RoomsEnum roomsEnum;
    private int speed;

    public CeilingFan(RoomsEnum roomsEnum) {
        this.roomsEnum = roomsEnum;
        this.speed = OFF;
    }

    public void fast() {
        speed = FAST;
    }
    public void medium() {
        speed = MEDIUM;
    }
    public void slow() {
        speed = SLOW;
    }
    public void off() {
        speed = OFF;
    }


    public RoomsEnum getRoomsEnum() {
        return roomsEnum;
    }
    public int getSpeed() {
        return speed;
    }
}

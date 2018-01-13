package rooms;

/**
 * Created by Professional on 2018-01-11.
 */
public enum RoomsEnum {

    LIVING_ROOM("Living room"),
    DINING_ROOM("Dining room");

    private String roomName;

    private RoomsEnum(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}

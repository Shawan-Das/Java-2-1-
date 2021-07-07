package theory;

public class Room {
    private int roomNo, floorNo, capacity;

    public Room(int roomNo, int floorNo, int capacity) {
        this.roomNo = roomNo;
        this.floorNo = floorNo;
        this.capacity = capacity;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void increaseCapacity(int value){
        capacity+=value;
    }
}

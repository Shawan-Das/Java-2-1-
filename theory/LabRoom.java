package theory;

public class LabRoom {
    private String attendanceName, type;

    public LabRoom(String attendanceName, String type) {
        this.attendanceName = attendanceName;
        this.type = type;
    }

    public String getAttendanceName() {
        return attendanceName;
    }

    public void setAttendanceName(String attendanceName) {
        this.attendanceName = attendanceName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

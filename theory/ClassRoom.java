package theory;

public class ClassRoom {
    private String isProjectAvailable;

    public ClassRoom(String isProjectAvailable) {
        this.isProjectAvailable = isProjectAvailable;
    }

    public void toggleProjectAvailable(){
        if(isProjectAvailable.equals("yes"))
            isProjectAvailable="no";
        else isProjectAvailable="yes";
    }

    public String getIsProjectAvailable() {
        return isProjectAvailable;
    }

    public void setIsProjectAvailable(String isProjectAvailable) {
        this.isProjectAvailable = isProjectAvailable;
    }
}

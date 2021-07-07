package exam;

public class Vaccination {
    private String name, status; private int age;
    public int NID;

    public Vaccination(String name, int age, String status, int NID) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.NID = NID;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "Name='" + name + '\'' +
                ", Age='" + age + '\'' +
                ", NID='" + NID + '\'' +
                ", Status=" + status +
                '}';
    }

}

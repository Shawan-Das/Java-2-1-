package theory;

public class Patient {
    private String name;
    private int age;
    private static int patientCount = 0;
    private final static String hospitalName = "Patient Care";

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getTreatment(String doctor){ }
    public  int getPatientCount() {
        return patientCount;
    }

    public static String getHospitalName() {
        return hospitalName;
    }
}

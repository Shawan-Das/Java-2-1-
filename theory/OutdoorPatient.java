package theory;

public class OutdoorPatient extends Patient {
    String emergencyContact;

    public OutdoorPatient(String name, int age, String emergencyContact) {
        super(name, age);
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactInfo() {
        return emergencyContact;
    }

    public static String getHospitalName(){
        return "Outdoor Patient";
    }

    public int getPatientCount(){
        return getPatientCount()+1;
    }
}

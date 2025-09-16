class Patient {
    private static String hospitalName = "CodInClub Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
    public void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital: " + hospitalName);
    }
    public static void checkPatient(Object obj) {
        if (obj instanceof Patient) {
            ((Patient) obj).displayDetails();
        } else {
            System.out.println("Not a Patient instance");
        }
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 1001, 35, "Fever");
        Patient patient2 = new Patient("Jane Smith", 1002, 28, "Fracture");
        
        Patient.getTotalPatients();
        
        Patient.checkPatient(patient1);
        Patient.checkPatient("Invalid object");
    }
}

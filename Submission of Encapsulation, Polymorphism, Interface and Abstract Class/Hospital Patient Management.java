import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill: " + calculateBill());
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomCharges;
    private List<String> records;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomCharges) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomCharges = roomCharges;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return (daysAdmitted * roomCharges) + 5000;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        for (String record : records) {
            System.out.println("Record: " + record);
        }
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private double consultationFee;
    private List<String> records;

    public OutPatient(String patientId, String name, int age, int visits, double consultationFee) {
        super(patientId, name, age);
        this.visits = visits;
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return (visits * consultationFee) + 1000;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        for (String record : records) {
            System.out.println("Record: " + record);
        }
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        
        InPatient ip1 = new InPatient("IP001", "John Doe", 45, 5, 2000);
        ip1.addRecord("Admitted for surgery");
        ip1.addRecord("Surgery completed successfully");
        
        OutPatient op1 = new OutPatient("OP001", "Jane Smith", 30, 3, 500);
        op1.addRecord("Regular checkup");
        op1.addRecord("Blood test done");
        
        InPatient ip2 = new InPatient("IP002", "Bob Johnson", 60, 10, 2500);
        ip2.addRecord("Heart treatment");
        
        OutPatient op2 = new OutPatient("OP002", "Alice Brown", 25, 2, 400);
        op2.addRecord("Vaccination");
        
        patients.add(ip1);
        patients.add(op1);
        patients.add(ip2);
        patients.add(op2);
        
        for (Patient patient : patients) {
            patient.getPatientDetails();
            
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
            
            System.out.println("-------------------");
        }
    }
}

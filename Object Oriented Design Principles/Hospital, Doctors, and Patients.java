import java.util.ArrayList;
import java.util.List;

class Hospital {
    class Doctor {
        private String name;
        private List<Patient> patients;
        
        public Doctor(String name) {
            this.name = name;
            this.patients = new ArrayList<>();
        }
        
        public void consult(Patient patient) {
            System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
            patients.add(patient);
            patient.addDoctor(this);
        }
        
        public String getName() {
            return name;
        }
        
        public List<Patient> getPatients() {
            return patients;
        }
    }
    
    class Patient {
        private String name;
        private List<Doctor> doctors;
        
        public Patient(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
        }       
        public void addDoctor(Doctor doctor) {
            doctors.add(doctor);
        }        
        public String getName() {
            return name;
        }  
        public List<Doctor> getDoctors() {
            return doctors;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        
        Hospital.Doctor doctor1 = hospital.new Doctor("Smith");
        Hospital.Doctor doctor2 = hospital.new Doctor("Johnson");
        
        Hospital.Patient patient1 = hospital.new Patient("Alice");
        Hospital.Patient patient2 = hospital.new Patient("Bob");
        
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        doctor2.consult(patient2);
    }
}

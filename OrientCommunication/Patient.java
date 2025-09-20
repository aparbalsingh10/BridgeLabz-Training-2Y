import java.util.*;
class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public String getName() {
        return name;
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " consulted doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}
class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this); 
        System.out.println("Doctor " + name + " consulted patient " + p.getName());
    }

    public String getName() {
        return name;
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
public class Problem3Demo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Verma");
        Doctor d2 = new Doctor("Dr. Singh");

        Patient p1 = new Patient("Aman");
        Patient p2 = new Patient("Riya");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        hospital.showHospital();
        d1.showPatients();
        d2.showPatients();
        p1.showDoctors();
        p2.showDoctors();
    }
}

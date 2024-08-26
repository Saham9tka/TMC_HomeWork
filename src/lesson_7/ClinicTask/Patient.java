package lesson_7.ClinicTask;

public class Patient {
    private final String name;
    private Doctor doctor;

    public Patient(String name){
        this.name = name;
    }

    public void setTreatment(int treatmentPlan, Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoc() {
        return doctor;
    }

    public String getName(){
        return "Name patient: " + name;
    }

}
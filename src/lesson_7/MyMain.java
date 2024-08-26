package lesson_7;

import lesson_7.ClinicTask.*;
//import lesson_7.Apple.*;

public class MyMain {
    public static void main(String[] args) {
        generateClinic();
    }

    public static void generateClinic() {
        Doctor[] clinic = new Doctor[]{
                new Surgeon("surgeon", "Kira"),
                new Dentist("dentist", "Alexey"),
                new Therapist("therapist", "Timur")
        };
        Patient patient = new Patient("Anton");
        Therapist.chTreatmentPlan(patient, clinic);
        System.out.println("\n");
        System.out.println(patient.getDoc().getFInfo());
        System.out.println(patient.getName());
    }
}
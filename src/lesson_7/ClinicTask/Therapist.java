package lesson_7.ClinicTask;

public class Therapist extends Doctor {
    public Therapist(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    public void treat() {
        System.out.println("The therapist has treated the cold. Wishing you good health!");
    }

    public static void chTreatmentPlan(Patient patient, Doctor[] clinic){
        switch (showTreatmentPlan()){
            case 1 -> patient.setTreatment(1, clinic[0]);
            case 2 -> patient.setTreatment(2, clinic[1]);
            default -> patient.setTreatment(3, clinic[2]);
        }
        patient.getDoc().treat();
    }

    private static int showTreatmentPlan(){
        System.out.println("    Treatment Plan Options");
        System.out.println("Enter '1' - if the patient has bone issues.");
        System.out.println("Enter '2' - if the patient has dental issues.");
        System.out.println("For any other problems, enter another number.");
        System.out.print("Please enter your choice: ");
        return getScanner().nextInt();
    }

}
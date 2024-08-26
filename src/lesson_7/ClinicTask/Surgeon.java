package lesson_7.ClinicTask;

public class Surgeon extends Doctor {
    public Surgeon(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    void treat() {
        System.out.println("The surgeon has successfully treated the fracture. Wishing you a speedy recovery!\n");
    }
}
package lesson_7.ClinicTask;

public class Dentist extends Doctor {
    public Dentist(String doctorType, String name) {
        super(doctorType, name);
    }

    void treat() {
        System.out.println("The dentist will cure your teeth. Be healthy!");
    }
}
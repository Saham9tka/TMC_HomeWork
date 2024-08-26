package lesson_7.ClinicTask;

import java.util.Scanner;

public class Doctor
{
    private final String DoctorType;
    private final String Name;
    Doctor(String doctorType, String name){
        this.DoctorType = doctorType;
        this.Name = name;
    }

    void treat(){
        System.out.println("Unknown treatment method.");
    }

    public String getFInfo(){
        return "Doctor's specialty: " + DoctorType + "\n" + "doctor's name: " + Name;
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
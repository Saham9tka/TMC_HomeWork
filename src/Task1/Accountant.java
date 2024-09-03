package Task1;

public class Accountant extends Person{
    public Accountant(String name) {
        super(name, "Accountant");
    }

    @Override
    public void doResponsibilities() {
        System.out.println("An accountant is responsible for calculating the company's income and expenses.");
    }
}
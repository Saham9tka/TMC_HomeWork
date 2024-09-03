package Task1;

public class Director extends Person{
    public Director(String name) {
        super(name, "Director");
    }

    @Override
    public void doResponsibilities() {
        System.out.println("Director - head of the company");
    }
}
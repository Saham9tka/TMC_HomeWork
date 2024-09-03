import Task1.*;
import Task2.*;
public class Main {
    public static void main(String[] args) {
        showInterface();
        showFigures();
    }

    public static void showInterface() {
        Person[] people = new Person[]{
                new Director("Atom"),
                new Accountant("Ksenia"),
                new Worker("Omar")
        };
        for (Person person : people) {
            person.GiveTitle();
            person.doResponsibilities();
            System.out.println("__________________________________________________");
        }
    }

    public static void showFigures() {
        double sumPerimeter = 0;

        Figure[] figures = new Figure[]{
                new Triangle(9, 12, 15),
                new Circle(12),
                new Rectangle(5, 10),
                new Circle(7),
                new Triangle(6, 6, 6),
        };
        for (Figure figure : figures) {
            System.out.println(figure);
            sumPerimeter += figure.getPerimeter();
           System.out.println();
        }
        System.out.println("Total perimeter of shapes: " + sumPerimeter);
    }

}
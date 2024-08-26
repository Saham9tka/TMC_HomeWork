package lesson_1;

//import java.util.Scanner;
public class L1_T1_6 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        TSt();
    }

    public static void Task1() {
        System.out.println("\n Task1 ");
        int a;
        int b = 2;
        int c = 3;
        System.out.println("a = " + (4 * (b + c - 1) / 2));
    }
    public static void Task2() {
        System.out.println("\n Task2 ");
        int n = 26;
        System.out.println("n = " + (n/10 + n%10));
    }
    public static void Task3() {
        System.out.println("\n Task3 ");
        int n = 126;
        System.out.println("Sum = " + (n/100 + n/10%10 + n % 10));
    }
    public static void Task4() {
        System.out.println("\n Task4 ");
        int q = 8;
        int w = 21;
        System.out.println("remainder = " + w%q);
        System.out.println("quotient= " + w/q);
    }
    public static void TSt(){
        System.out.println("\n Task* ");
        int a = 1;
        int b = 2;
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
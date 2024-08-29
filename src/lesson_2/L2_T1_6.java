package lesson_2;
import java.util.Scanner;
public class L2_T1_6 {
    public static void main(String[] args){
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }
    public static void Task1(){
        System.out.println("\n Task1 \n Enter num " );
        Scanner inputnum = new Scanner(System.in);
        int num = inputnum.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        } else {System.out.println("Number is odd");
        }
    }
    public static void Task2(){
        System.out.println("\n Task2 \n Enter num " );
        Scanner inputtemp = new Scanner(System.in);
        int temp = inputtemp.nextInt();
        if(temp > -5){
            System.out.println("outside temperature is Warm");
        }
        else if(temp > -20){
            System.out.println("outside temperature is Normal");
        }
        else {
            System.out.println("outside temperature is Cold");
        }
    }
    public static void Task3(){
        System.out.println("\n Task3");
        for(int count = 10; count <=20; count++){
            System.out.println(count * count);
        }
    }
    public static void Task4(){
        System.out.println("\n Task4");
       int n = 7;
       while (n <=98){
        System.out.println(n);
        n = n +7;
       }
    }
    public static void Task5() {
        System.out.println("\n Task5");
        System.out.println("Enter any positive number: ");
        Scanner inputnum = new Scanner(System.in);
        int num  = inputnum .nextInt();
        int sum = 0;
        if (num > 0){
            for(int count =1;count <= num;count++){
                sum = sum + count;
            }
        }else {
            System.out.println("The entered data is incorrect");
        }
        System.out.println(sum);
    }
}

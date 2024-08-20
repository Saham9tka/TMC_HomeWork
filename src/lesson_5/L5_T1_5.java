package lesson_5;

import java.util.Scanner;

public class L5_T1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1(scanner);
        task2();
        taskStar(scanner);
    }

    public static void task1(Scanner scanner) {
        System.out.println("\nTask 1:");
        System.out.print("Enter the number of lines: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array1 = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1[i][j] = (int) (Math.random() * 100); // случайные числа от 0 до 99
            }
        }

        System.out.print("Enter the number to add to each item: ");
        int addNumber = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1[i][j] += addNumber;
            }
        }
        System.out.println("Massive:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array1[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }

    public static void task2() {
        System.out.println("\nTask 2:");
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = "W";
                } else {
                    chessboard[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void taskStar(Scanner scanner) {
        System.out.println("\nTask *:");
        System.out.print("Enter light: ");
        int light = scanner.nextInt();
        System.out.print("Enter m: ");
        int width = scanner.nextInt();
        int id = 0;
        int[][] array = new int[light][width];

        for (int i = 0; i < light; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = id;
                    id++;
                }
            } else {
                for (int j = width - 1; j >= 0; j--) {
                    array[i][j] = id;
                    id++;
                }
            }
        }
        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
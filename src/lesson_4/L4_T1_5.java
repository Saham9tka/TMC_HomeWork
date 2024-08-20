package lesson_4;

import java.util.Scanner;

public class L4_T1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        int choice = 0;
        while (choice != 1 && choice != 2) { // Цикл, пока выбор неверен
            System.out.println("Выберите способ заполнения массива:");
            System.out.println("1. Случайные числа (Math.random())");
            System.out.println("2. Ввод пользователем");
            System.out.print("Введите номер варианта: ");
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Неверный выбор! Попробуйте еще раз.");
            }
        }

        if (choice == 1) {
            // Заполнение с помощью Math.random()
            System.out.println("Массив заполнен случайными числами:");
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 101); // случайное число от 0 до 100
                System.out.println("[" + i + "]: " + array[i] + " "); // Вывод индекса
            }
            System.out.println();
        } else { // choice == 2
            // Ручное заполнение
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент [" + i + "]: ");
                array[i] = scanner.nextInt();
            }
            System.out.println("Массив заполнен:");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }

        T1(array, size);
        T2(array, size);
        T3(array, size);
        T4(array, size);
        T6(array, size);
        T5(array, size);
    }

    private static void T1(int[] array, int size) {
        System.out.println("T1");
        System.out.println("Элементы массива в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    private static void T2(int[] array, int size) {
        System.out.println("T2");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println();
    }

    private static void T3(int[] array, int size) {
        System.out.println("T3");
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println();
    }

    private static void T4(int[] array, int size) {
        System.out.println("T4");
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов нет");
        }
        System.out.println();
    }

    private static void T5(int[] array, int size) {
        System.out.println("T5");
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("Массив после перестановки элементов:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    private static void T6(int[] array, int size) {
        System.out.println("T6");
        boolean isIncreasing = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
        System.out.println();
    }

}
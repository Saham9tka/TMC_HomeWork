import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.function.Consumer;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Birthday();
//        PositiveNumbers();
//        Converter1();
//        Converter2();
//        ReversString();
    }

    static void Birthday() {
            System.out.println("Task Birthday");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дату рождения (ДД.ММ.ГГГГ): ");
            String inputDate = scanner.nextLine();
                LocalDate birthDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

                LocalDate hundredYearsLater = birthDate.plusYears(100);
                System.out.println("Вам исполнится 100 лет " + hundredYearsLater.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }

    static void PositiveNumbers() {
        System.out.print("Task PositiveNumbers");
        int[] numbers = {1, -2, 3, -4, 5, -6};

        Predicate<Integer> isPositive = integer -> integer > 0;
        IntStream.of(numbers).boxed().filter(isPositive).forEach(System.out::println);
    }


    static void Converter1() {
        System.out.print("Task Converter(BYN)");
        Function<String, Double> convertToDollars = bynString -> {
            double bynAmount = Double.parseDouble(bynString.split(" ")[0]);
            return bynAmount / 3.4;
        };

        String bynValue = "100 BYN";
        double dollarValue = convertToDollars.apply(bynValue);

        System.out.println(dollarValue + " USD");
    }

    static void Converter2() {
        System.out.print("Task Converter(BYN)");
        Consumer<String> printDollars = bynString -> {
            double bynAmount = Double.parseDouble(bynString.split(" ")[0]);
            double dollarValue = bynAmount / 3.4; // Примерный курс BYN к USD
            System.out.println(dollarValue + " USD");
        };

        String bynValue = "150 BYN";
        printDollars.accept(bynValue);
    }


    static void  ReversString() {
        System.out.print("Task  ReversString");
        Supplier<String> reversedString = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();
            return new StringBuilder(inputString).reverse().toString();
        };

        String reversed = reversedString.get();

        System.out.println("Перевернутая строка: " + reversed);
    }
}

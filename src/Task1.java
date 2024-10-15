import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {

    public static void getAnniversary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату рождения (ДД.ММ.ГГГГ): ");
        String inputDate = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate hundredYearsLater = birthDate.plusYears(100);

        System.out.println("Вам исполнится 100 лет " + hundredYearsLater.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
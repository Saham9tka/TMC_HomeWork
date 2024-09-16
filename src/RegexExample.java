import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println("Аббревиатуры:");
        findAbbreviations(input);
    }
    static void findAbbreviations(String input) {
        String pattern = "[A-Z]{2,6}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
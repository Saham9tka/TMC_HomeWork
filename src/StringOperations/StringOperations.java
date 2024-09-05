 package StringOperations;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        scanner.close();

        // 1. Самая короткая и самая длинная строки
        System.out.println("n1. Самая короткая и самая длинная строки:");
        findShortestAndLongest(str1, str2, str3);

        // 2. Упорядоченные строки по длине
        System.out.println("n2. Упорядоченные строки по длине:");
        sortStringsByLength(str1, str2, str3);

        // 3. Строки короче средней длины
        System.out.println("n3. Строки короче средней длины:");
        findShorterThanAverage(str1, str2, str3);

        // 4. Слово с разными символами
        System.out.println("n4. Слово с разными символами:");
        findUniqueCharactersWord(str1, str2, str3);

        // 5. Дублирование каждой буквы
        System.out.println("n5. Дублирование каждой буквы:");
        duplicateCharacters(str1);
    }

    private static void findShortestAndLongest(String str1, String str2, String str3) {
        String shortest = str1;
        String longest = str1;

        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        System.out.println("Самая короткая строка: " + shortest + " (" + shortest.length() + " символов)");
        System.out.println("Самая длинная строка: " + longest + " (" + longest.length() + " символов)");
    }

    private static void sortStringsByLength(String str1, String str2, String str3) {
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
        for (String str : strings) {
            System.out.println(str);
        }
    }

    private static void findShorterThanAverage(String str1, String str2, String str3) {
        int totalLength = str1.length() + str2.length() + str3.length();
        double averageLength = totalLength / 3.0;

        if (str1.length() < averageLength) {
            System.out.println(str1 + " (" + str1.length() + " символов)");
        }
        if (str2.length() < averageLength) {
            System.out.println(str2 + " (" + str2.length() + " символов)");
        }
        if (str3.length() < averageLength) {
            System.out.println(str3 + " (" + str3.length() + " символов)");
        }
    }

    private static void findUniqueCharactersWord(String str1, String str2, String str3) {
        String[] words1 = str1.split("\\s+");
        String[] words2 = str2.split("\\s+");
        String[] words3 = str3.split("\\s+");

        for (String word : words1) {
            if (hasUniqueCharacters(word)) {
                System.out.println(word);
                return; // Выходим после нахождения первого слова
            }
        }
        for (String word : words2) {
            if (hasUniqueCharacters(word)) {
                System.out.println(word);
                return;
            }
        }
        for (String word : words3) {
            if (hasUniqueCharacters(word)) {
                System.out.println(word);
                return;
            }
        }
        System.out.println("Слова с уникальными символами не найдены.");
    }

    private static boolean hasUniqueCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void duplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            sb.append(ch).append(ch);
        }
        System.out.println(sb.toString());
    }
}


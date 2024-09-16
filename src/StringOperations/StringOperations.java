package StringOperations;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        scanner.close();

        // 1. Short and Longest
        System.out.println("#1. Самая короткая и самая длинная строки:");
        findShortestAndLongest(str1, str2, str3);

        // 2. ByLength
        System.out.println("#2. Упорядоченные строки по длине:");
        sortStringsByLength(str1, str2, str3);

        // 3. ShortThan
        System.out.println("#3. Строки короче средней длины:");
        findShorterThanAverage(str1, str2, str3);

        // 4. Unique
        System.out.println("#4. Слово с разными символами:");
        findUniqueCharactersWord(str1, str2, str3);

        // 5. Dublicate
        System.out.println("#5. Дублирование каждой буквы:");
        duplicateCharacters(str1);
    }

     static void findShortestAndLongest(String str1, String str2, String str3) {
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

     static void sortStringsByLength(String str1, String str2, String str3) {
        String[] strings = {str1, str2, str3};
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        for (String str : strings) {            System.out.println(str);
        }
    }

     static void findShorterThanAverage(String str1, String str2, String str3) {
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

     static void findUniqueCharactersWord(String str1, String str2, String str3) {
        String wordUniqueChars = findWordUniqueChars(str1);
        if (wordUniqueChars != null) {
            System.out.println(wordUniqueChars);
            return;
        }
        wordUniqueChars = findWordUniqueChars(str2);
        if (wordUniqueChars != null) {
            System.out.println(wordUniqueChars);
            return;
        }
        wordUniqueChars = findWordUniqueChars(str3);
        if (wordUniqueChars != null) {
            System.out.println(wordUniqueChars);
            return;
        }
        System.out.println("Слова с уникальными символами не найдены.");
    }

     static String findWordUniqueChars(String str) {
        int start = 0;
        int end = 0;
        while (end < str.length()) {
            while (end < str.length() && str.charAt(end) == ' ') {
                end++;
            }
            start = end;
            while (end < str.length() && str.charAt(end) != ' ') {
                end++;
            }
            String word = str.substring(start, end);
            if (hasUniqueCharacters(word)) {
                return word;
            }
        }
        return null;
    }

     static boolean hasUniqueCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void duplicateCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}

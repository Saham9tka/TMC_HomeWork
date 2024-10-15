import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StringMan {

    public static void main(String[] args) {
        testWordMultiple();
//        testPairs();
//        testCheckForBalance();
    }

    static void testWordMultiple() {
        String[] input1 = {"a", "b", "a", "c", "b"};
        String[] input2 = {"c", "b", "a"};
        String[] input3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(input1));
        System.out.println(wordMultiple(input2));
        System.out.println(wordMultiple(input3));
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> counts = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        for (String word : counts.keySet()) {
            result.put(word, counts.get(word) >= 2);
        }
        return result;
    }

    // Task 2: pairs
    static void testPairs() {
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};
        System.out.println(pairs(input1));
        System.out.println(pairs(input2));
        System.out.println(pairs(input3));
    }

    public static Map<String, String> pairs(String[] words) {
        Map<String, String> result = new HashMap<>();
        for (String word : words) {
            if (word.length() >= 2) {
                result.put(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(word.length() - 1)));
            }
        }
        return result;
    }

    // Task *: checkForBalance
    static void testCheckForBalance() {
        String[] testCases = {"()",
                "[()]",
                "{[()]}",
                "([{{[(())]}}])",
                "{{[]()}}}}",
                "{[(])}"};
        for (String testCase : testCases) {
            if (checkForBalance(testCase)) {
                System.out.println(testCase + " is balanced");
            } else {
                System.out.println(testCase + " is not balanced");
            }
        }
    }

    static boolean checkForBalance(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static String getScanner() {
        return new Scanner(System.in).nextLine();
    }
}

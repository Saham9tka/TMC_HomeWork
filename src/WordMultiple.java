import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>(); // Создаем HashMap

        for (String word : words) {
            if (result.containsKey(word)) { // Проверяем, есть ли ключ
                result.put(word, true); // Устанавливаем значение true
            } else {
                result.put(word, false); // Добавляем ключ со значением false
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> result1 = wordMultiple(words1);
        System.out.println(result1); // Выведет: {"a":true, "b":true, "c":false}

        String[] words2 = {"c", "b", "a"};
        Map<String, Boolean> result2 = wordMultiple(words2);
        System.out.println(result2); // Выведет: {"a":false, "b":false, "c":false}

        String[] words3 = {"c", "c", "c", "c"};
        Map<String, Boolean> result3 = wordMultiple(words3);
        System.out.println(result3); // Выведет: {"c":true}
    }
}
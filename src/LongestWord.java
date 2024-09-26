import java.io.*;

public class LongestWord {

    public static void main(String[] args) {
        try {
            String longestWord = findLongestWord("C:/Users/saham/IdeaProjects/TMC_HomeWork/src/RomeoAndJulietta.txt");
            saveWord("longest_word.txt", longestWord);
            System.out.println("The longest word is written to the new file. This word is: " + longestWord);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String findLongestWord(String myFile) throws IOException {
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s.,;?!]+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        }
        return longestWord;
    }

    public static void saveWord(String newFile, String word) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            writer.write(word);
        }
    }
}

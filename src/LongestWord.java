import java.;

public class LongestWord {

    public static void main(String[] args) {
        try {
            File inputFile = new File("Romeo and Julietta.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String longestWord = "";
            String currentWord;

            while ((currentWord = reader.readLine()) != null) {
                String[] words = currentWord.split("[\\s.,;?!]+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            reader.close();

            File outputFile = new File("longest_word.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(longestWord);
            writer.close();

            System.out.println("\n" + "Longest word: " + longestWord);

        } catch (IOException e) {
            System.err.println("Er1ror: " + e.getMessage());
        }
    }
}

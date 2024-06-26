import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReverseWordsFromFile {
    private static final Logger logger = Logger.getLogger(ReverseWordsFromFile.class.getName());
        public static void main(String[] args) {
            String inputFile = "D:\\Assessment\\Task 1\\input.txt";
            String outputFile = "D:\\Assessment\\Task 1\\output.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));) {

                String line;
                while ((line = reader.readLine())!= null) {
                    String reversedLine = Reverse.reverseWords(line);
                    writer.write(reversedLine);
                    writer.newLine();
                }
                logger.info("Words successfully reversed from file.");
            } catch (FileNotFoundException e) {
                logger.info("Input file not found: " + inputFile);
            } catch (IOException e) {
                logger.info("Error Occur: " + e.getMessage());
                e.printStackTrace();
        }
    }
}

class Reverse {
    public static String reverseWords(String line) {
        String[] words = line.split(" ");
        StringBuilder reversedLine = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            StringBuilder punctuation = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                    reverseWord.append(ch);
                } else {
                    punctuation.append(ch);
                }
            }
            reverseWord.reverse();
            reversedLine.append(reverseWord).append(punctuation).append(" ");
        }

        return reversedLine.toString().trim();
    }
}
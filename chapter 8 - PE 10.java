import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordCounter {
    public static int countWordsInFile(String filename) {
        int wordCount = 0;
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        int wordCount = countWordsInFile(filename);
        System.out.println("Number of words in file: " + wordCount);
    }
}

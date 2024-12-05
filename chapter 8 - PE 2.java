import java.util.Scanner;

public class WordCounter {
    public static int countWords(String str) {
        if (str.isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }
}



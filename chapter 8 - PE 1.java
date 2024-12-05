import java.util.Scanner;

public class BackwardString {
    public static void displayBackward(String str) {
        StringBuilder reversed = new StringBuilder(str);
        System.out.println("Reversed string: " + reversed.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        displayBackward(input);
    }
}

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of your favorite city: ");
        String city = keyboard.nextLine();

        System.out.println("Number of characters: " + city.length());

        System.out.println("City in uppercase: " + city.toUpperCase());

        System.out.println("City in lowercase: " + city.toLowerCase());

        System.out.println("First character: " + city.charAt(0));
    }
}

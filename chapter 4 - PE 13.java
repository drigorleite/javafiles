import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books purchased: ");
        int books = scanner.nextInt();

        int points;
        if (books == 0) {
            points = 0;
        } else if (books == 1) {
            points = 5;
        } else if (books == 2) {
            points = 15;
        } else if (books == 3) {
            points = 30;
        } else {
            points = 60;
        }

        System.out.println("Points awarded: " + points);

        scanner.close();
    }
}

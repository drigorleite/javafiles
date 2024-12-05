import java.util.Scanner;

public class RoulettePocket {
    private int pocketNumber;

    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }

    public String getPocketColor() {
        if (pocketNumber == 0) {
            return "Green";
        } else if (pocketNumber >= 1 && pocketNumber <= 10 || pocketNumber >= 19 && pocketNumber <= 28) {
            if (pocketNumber % 2 == 0) {
                return "Black";
            } else {
                return "Red";
            }
        } else if (pocketNumber >= 11 && pocketNumber <= 18 || pocketNumber >= 29 && pocketNumber <= 36) {
            if (pocketNumber % 2 == 0) {
                return "Red";
            } else {
                return "Black";
            }
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a pocket number (0–36): ");
        int number = scanner.nextInt();

        RoulettePocket pocket = new RoulettePocket(number);
        String color = pocket.getPocketColor();

        if (color.equals("Invalid")) {
            System.out.println("Error: The number must be between 0 and 36.");
        } else {
            System.out.println("Pocket color: " + color);
        }

        scanner.close();
    }
}

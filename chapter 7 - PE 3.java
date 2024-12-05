import java.util.Scanner;

public class ChargeAccount {
    // Array of valid account numbers
    private final int[] validAccounts = {
        5658845, 4520125, 7895122, 8777541, 8451277,
        1302850, 8080152, 4562555, 5552012, 5050552,
        7825877, 1250255, 1005231, 6545231, 3852085,
        7576651, 7881200, 4581002
    };

    // Method to validate account number
    public boolean isValid(int accountNumber) {
        for (int validAccount : validAccounts) {
            if (validAccount == accountNumber) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ChargeAccount validator = new ChargeAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a charge account number: ");
        int accountNumber = scanner.nextInt();

        if (validator.isValid(accountNumber)) {
            System.out.println("The account number is valid.");
        } else {
            System.out.println("The account number is invalid.");
        }

        scanner.close();
    }
}

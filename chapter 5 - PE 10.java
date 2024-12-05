import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DepositWithdrawalFiles {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.00, 0.03);  // Starting balance 500.00, annual interest rate 3%
        
        // Process deposits
        try (Scanner depositFile = new Scanner(new File("Deposits.txt"))) {
            while (depositFile.hasNextDouble()) {
                account.deposit(depositFile.nextDouble());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Deposits.txt not found.");
        }

        // Process withdrawals
        try (Scanner withdrawalFile = new Scanner(new File("Withdrawals.txt"))) {
            while (withdrawalFile.hasNextDouble()) {
                account.withdraw(withdrawalFile.nextDouble());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Withdrawals.txt not found.");
        }

        // Add interest
        account.addMonthlyInterest();

        // Display ending balance and total interest earned
        System.out.println("Ending balance: $" + account.getBalance());
        System.out.println("Total interest earned: $" + account.getTotalInterest());
    }
}

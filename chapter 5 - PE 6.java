import java.util.Scanner;

class SavingsAccount {
    private double balance;
    private double annualInterestRate;
    private double totalDeposits = 0;
    private double totalWithdrawals = 0;
    private double totalInterest = 0;

    public SavingsAccount(double startingBalance, double annualInterestRate) {
        this.balance = startingBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        totalDeposits += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
        totalWithdrawals += amount;
    }

    public void addMonthlyInterest() {
        double monthlyInterest = (annualInterestRate / 12) * balance;
        balance += monthlyInterest;
        totalInterest += monthlyInterest;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalDeposits() {
        return totalDeposits;
    }

    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    public double getTotalInterest() {
        return totalInterest;
    }
}

public class SavingsAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting balance: ");
        double startingBalance = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100;
        
        System.out.print("Enter the number of months since the account was established: ");
        int months = scanner.nextInt();
        
        SavingsAccount account = new SavingsAccount(startingBalance, annualInterestRate);
        
        for (int i = 1; i <= months; i++) {
            System.out.print("Month " + i + " - Enter deposit amount: ");
            double deposit = scanner.nextDouble();
            account.deposit(deposit);
            
            System.out.print("Month " + i + " - Enter withdrawal amount: ");
            double withdrawal = scanner.nextDouble();
            account.withdraw(withdrawal);
            
            account.addMonthlyInterest();
        }
        
        System.out.println("Ending balance: $" + account.getBalance());
        System.out.println("Total deposits: $" + account.getTotalDeposits());
        System.out.println("Total withdrawals: $" + account.getTotalWithdrawals());
        System.out.println("Total interest earned: $" + account.getTotalInterest());
    }
}

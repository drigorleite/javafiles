public abstract class BankAccount {
    protected double balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected double annualInterestRate;
    protected double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        numDeposits++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        numWithdrawals++;
    }

    public void calcInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        calcInterest();
        numWithdrawals = 0;
        numDeposits = 0;
        monthlyServiceCharges = 0;
    }

    public double getBalance() {
        return balance;
    }
}

public class SavingsAccount extends BankAccount {
    private boolean isActive;

    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        this.isActive = balance >= 25;
    }

    @Override
    public void withdraw(double amount) {
        if (isActive) {
            super.withdraw(amount);
            if (balance < 25) {
                isActive = false;
            }
        } else {
            System.out.println("Withdrawal denied: Account is inactive.");
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (!isActive && balance >= 25) {
            isActive = true;
        }
    }

    @Override
    public void monthlyProcess() {
        if (numWithdrawals > 4) {
            monthlyServiceCharges += (numWithdrawals - 4);
        }
        super.monthlyProcess();
        if (balance < 25) {
            isActive = false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(50, 0.05);
        savings.deposit(10);
        savings.withdraw(20);
        savings.monthlyProcess();
        System.out.println("Balance: $" + savings.getBalance());
    }
}

import java.util.Scanner;

public class BudgetAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget, expense, totalExpenses = 0;
        
        System.out.print("Enter the monthly budget: ");
        budget = scanner.nextDouble();

        while (true) {
            System.out.print("Enter an expense (or 0 to finish): ");
            expense = scanner.nextDouble();
            if (expense == 0) break;
            totalExpenses += expense;
        }
        
        if (totalExpenses > budget) {
            System.out.println("You are over budget by $" + (totalExpenses - budget));
        } else {
            System.out.println("You are under budget by $" + (budget - totalExpenses));
        }
    }
}

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        final double TAX_RATE = 0.075;
        final double TIP_RATE = 0.18;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the charge for the meal: ");
        double mealCharge = keyboard.nextDouble();

        double tax = mealCharge * TAX_RATE;
        double tip = (mealCharge + tax) * TIP_RATE;
        double totalBill = mealCharge + tax + tip;

        System.out.println("Meal charge: $" + mealCharge);
        System.out.println("Tax amount: $" + tax);
        System.out.println("Tip amount: $" + tip);
        System.out.println("Total bill: $" + totalBill);
    }
}

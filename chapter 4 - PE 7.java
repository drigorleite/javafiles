import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in pounds): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = scanner.nextDouble();

        double bmi = (weight * 703) / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi <= 25) {
            System.out.println("Your weight is optimal.");
        } else {
            System.out.println("You are overweight.");
        }

        scanner.close();
    }
}

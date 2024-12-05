import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first test score: ");
        double score1 = keyboard.nextDouble();

        System.out.print("Enter the second test score: ");
        double score2 = keyboard.nextDouble();

        System.out.print("Enter the third test score: ");
        double score3 = keyboard.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.println("Test 1: " + score1);
        System.out.println("Test 2: " + score2);
        System.out.println("Test 3: " + score3);
        System.out.println("Average score: " + average);
    }
}

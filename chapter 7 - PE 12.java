import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalysis {
    private double[] numbers;

    // Constructor reads numbers from a file
    public NumberAnalysis(String filename) throws FileNotFoundException {
        ArrayList<Double> numberList = new ArrayList<>();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            numberList.add(inputFile.nextDouble());
        }
        inputFile.close();

        numbers = new double[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            numbers[i] = numberList.get(i);
        }
    }

    public double getLowest() {
        double lowest = numbers[0];
        for (double num : numbers) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }

    public double getHighest() {
        double highest = numbers[0];
        for (double num : numbers) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    public double getTotal() {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    public double getAverage() {
        return getTotal() / numbers.length;
    }

    public static void main(String[] args) {
        try {
            NumberAnalysis analysis = new NumberAnalysis("Numbers.txt");
            System.out.printf("Lowest Number: %.2f%n", analysis.getLowest());
            System.out.printf("Highest Number: %.2f%n", analysis.getHighest());
            System.out.printf("Total of Numbers: %.2f%n", analysis.getTotal());
            System.out.printf("Average of Numbers: %.2f%n", analysis.getAverage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure 'Numbers.txt' exists.");
        }
    }
}

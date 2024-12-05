import java.util.Scanner;

class Population {
    private int startingSize;
    private double dailyIncrease;
    private int days;

    public Population(int startingSize, double dailyIncrease, int days) {
        if (startingSize < 2 || dailyIncrease < 0 || days < 1) {
            throw new IllegalArgumentException("Invalid input: Starting size must be at least 2, daily increase non-negative, and days at least 1.");
        }
        this.startingSize = startingSize;
        this.dailyIncrease = dailyIncrease;
        this.days = days;
    }

    public void predictPopulation() {
        System.out.println("Day\tPopulation");
        for (int day = 1; day <= days; day++) {
            System.out.println(day + "\t" + startingSize);
            startingSize += startingSize * dailyIncrease / 100;
        }
    }
}

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting size of the population: ");
        int startingSize = scanner.nextInt();
        
        System.out.print("Enter the average daily population increase (in percentage): ");
        double dailyIncrease = scanner.nextDouble();
        
        System.out.print("Enter the number of days they will multiply: ");
        int days = scanner.nextInt();
        
        Population population = new Population(startingSize, dailyIncrease, days);
        population.predictPopulation();
    }
}

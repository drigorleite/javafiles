public class Rainfall {
    private double[] monthlyRainfall;

    public Rainfall(double[] monthlyRainfall) {
        this.monthlyRainfall = new double[12];
        for (int i = 0; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < 0) {
                throw new IllegalArgumentException("Rainfall values cannot be negative.");
            }
            this.monthlyRainfall[i] = monthlyRainfall[i];
        }
    }

    // Method to calculate total rainfall for the year
    public double getTotalRainfall() {
        double total = 0;
        for (double rain : monthlyRainfall) {
            total += rain;
        }
        return total;
    }

    // Method to calculate average monthly rainfall
    public double getAverageRainfall() {
        return getTotalRainfall() / monthlyRainfall.length;
    }

    // Method to find the month with the most rain
    public int getMonthWithMostRain() {
        int maxMonth = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] > monthlyRainfall[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    // Method to find the month with the least rain
    public int getMonthWithLeastRain() {
        int minMonth = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < monthlyRainfall[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public static void main(String[] args) {
        // Sample data for testing
        double[] rainfallData = {3.2, 4.5, 2.8, 3.6, 5.0, 1.2, 0.8, 2.5, 3.1, 4.9, 2.0, 1.8};

        // Create Rainfall object
        Rainfall rainfall = new Rainfall(rainfallData);

        // Display total rainfall
        System.out.printf("Total Rainfall: %.2f inches%n", rainfall.getTotalRainfall());

        // Display average monthly rainfall
        System.out.printf("Average Monthly Rainfall: %.2f inches%n", rainfall.getAverageRainfall());

        // Display month with the most rain
        System.out.println("Month with Most Rain: " + (rainfall.getMonthWithMostRain() + 1));

        // Display month with the least rain
        System.out.println("Month with Least Rain: " + (rainfall.getMonthWithLeastRain() + 1));
    }
}

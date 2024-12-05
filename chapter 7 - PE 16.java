public class ArrayOperations {

    // Method to calculate total of all values in 2D array
    public static double getTotal(double[][] array) {
        double total = 0;
        for (double[] row : array) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    // Overloaded getTotal for integer arrays
    public static int getTotal(int[][] array) {
        int total = 0;
        for (int[] row : array) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    // Method to calculate average of values in 2D array
    public static double getAverage(double[][] array) {
        return getTotal(array) / (array.length * array[0].length);
    }

    // Overloaded getAverage for integer arrays
    public static double getAverage(int[][] array) {
        return getTotal(array) / (double)(array.length * array[0].length);
    }

    // Method to calculate total of values in a specified row
    public static double getRowTotal(double[][] array, int row) {
        double total = 0;
        for (double value : array[row]) {
            total += value;
        }
        return total;
    }

    // Overloaded getRowTotal for integer arrays
    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int value : array[row]) {
            total += value;
        }
        return total;
    }

    // Method to calculate total of values in a specified column
    public static double getColumnTotal(double[][] array, int column) {
        double total = 0;
        for (double[] row : array) {
            total += row[column];
        }
        return total;
    }

    // Overloaded getColumnTotal for integer arrays
    public static int getColumnTotal(int[][] array, int column) {
        int total = 0;
        for (int[] row : array) {
            total += row[column];
        }
        return total;
    }

    // Method to find highest value in a specified row
    public static double getHighestInRow(double[][] array, int row) {
        double highest = array[row][0];
        for (double value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    // Method to find lowest value in a specified row
    public static double getLowestInRow(double[][] array, int row) {
        double lowest = array[row][0];
        for (double value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        double[][] testData = {
            {1.2, 3.4, 2.5},
            {4.5, 1.1, 6.7},
            {3.3, 4.2, 5.0}
        };

        System.out.println("Total: " + getTotal(testData));
        System.out.println("Average: " + getAverage(testData));
        System.out.println("Total of Row 1: " + getRowTotal(testData, 1));
        System.out.println("Total of Column 2: " + getColumnTotal(testData, 2));
        System.out.println("Highest in Row 0: " + getHighestInRow(testData, 0));
        System.out.println("Lowest in Row 2: " + getLowestInRow(testData, 2));
    }
}

import java.util.Scanner;

public class GradeBook {
    private String[] studentNames = new String[5];
    private char[] letterGrades = new char[5];
    private double[][] testScores = new double[5][4];

    public void setStudent(int index, String name, double[] scores) {
        studentNames[index] = name;
        testScores[index] = scores;
        letterGrades[index] = calculateGrade(getAverage(scores));
    }

    public double getAverage(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }

    private char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    public void displayGrades() {
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("%s - Average: %.2f, Grade: %c%n",
                studentNames[i], getAverage(testScores[i]), letterGrades[i]);
        }
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            double[] scores = new double[4];

            for (int j = 0; j < 4; j++) {
                do {
                    System.out.print("Enter score for test " + (j + 1) + " (0-100): ");
                    scores[j] = scanner.nextDouble();
                } while (scores[j] < 0 || scores[j] > 100);
            }
            scanner.nextLine(); // Clear buffer
            gradeBook.setStudent(i, name, scores);
        }

        gradeBook.displayGrades();
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class DriverExam {
    private final char[] correctAnswers = {
        'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'
    };
    private char[] studentAnswers;

    public DriverExam(char[] studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public boolean passed() {
        return totalCorrect() >= 15;
    }

    public int totalCorrect() {
        int correctCount = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }

    public int totalIncorrect() {
        return correctAnswers.length - totalCorrect();
    }

    public ArrayList<Integer> questionsMissed() {
        ArrayList<Integer> missed = new ArrayList<>();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != correctAnswers[i]) {
                missed.add(i + 1);
            }
        }
        return missed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] studentAnswers = new char[20];

        System.out.println("Enter the answers for the 20 questions (A, B, C, or D):");
        for (int i = 0; i < studentAnswers.length; i++) {
            char answer;
            do {
                System.out.print("Question " + (i + 1) + ": ");
                answer = Character.toUpperCase(scanner.next().charAt(0));
            } while (answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D');
            studentAnswers[i] = answer;
        }

        DriverExam exam = new DriverExam(studentAnswers);
        System.out.println("Passed: " + exam.passed());
        System.out.println("Total Correct: " + exam.totalCorrect());
        System.out.println("Total Incorrect: " + exam.totalIncorrect());
        System.out.println("Questions Missed: " + exam.questionsMissed());

        scanner.close();
    }
}

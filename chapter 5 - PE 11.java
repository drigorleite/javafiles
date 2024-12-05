import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileDisplay {
    private String fileName;

    public FileDisplay(String fileName) {
        this.fileName = fileName;
    }

    public void displayHead() {
        try (Scanner file = new Scanner(new File(fileName))) {
            for (int i = 0; i < 5 && file.hasNextLine(); i++) {
                System.out.println(file.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public void displayContents() {
        try (Scanner file = new Scanner(new File(fileName))) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public void displayWithLineNumbers() {
        try (Scanner file = new Scanner(new File(fileName))) {
            int lineNumber = 1;
            while (file.hasNextLine()) {
                System.out.println(lineNumber++ + ": " + file.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

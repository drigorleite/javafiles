//Algorithm Workbench #1


Scanner scanner = new Scanner(System.in);
int number, product = 0;

while (product < 100) {
    System.out.print("Enter a number: ");
    number = scanner.nextInt();
    product = number * 10;
    System.out.println("Product is: " + product);
}

//#2
Scanner scanner = new Scanner(System.in);
int num1, num2, choice;

do {
    System.out.print("Enter the first number: ");
    num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    num2 = scanner.nextInt();
    System.out.println("Sum: " + (num1 + num2));

    System.out.print("Do you want to perform another operation? (1 for yes, 0 for no): ");
    choice = scanner.nextInt();
} while (choice == 1);


//#3
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}


//#4
for (char ch = 'A'; ch <= 'K'; ch++) {
    System.out.print(ch);
}


//#5
int total = 0;
for (int i = 1; i <= 30; i++) {
    total += i;
}
System.out.println("Total is: " + total);


//#6
for (int row = 1; row <= 10; row++) {
    for (int col = 1; col <= 15; col++) {
        System.out.print("#")
    }
    System.out.println(); 
}

//#7
for (int row = 7; row >= 1; row--) {
    for (int col = 1; col <= row; col++) {
        System.out.print("*");
    }
    System.out.println();  // Move to the next line after each row
}


//#8
for (int row = 1; row <= 6; row++) {
    if (row % 2 == 0) {
        System.out.println("# #");
    } else {
        System.out.println("##");
    }
}


//#9
import java.util.Random;

public class ReviewQuestion {
    public static void main(String[] args) {
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(2);  // Generates 0 or 1
            if (randomNum == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


//#10
Scanner keyboard = new Scanner(System.in);
int x;
do {
    System.out.print("Enter a number: ");
    x = keyboard.nextInt();
} while (x > 0);



//#11
Scanner keyboard = new Scanner(System.in);
String input;
char sure;
System.out.print("Are you sure you want to quit? ");
input = keyboard.next();
sure = input.charAt(0);
while (sure != 'Y' && sure != 'N') {
    System.out.print("Are you sure you want to quit? ");
    input = keyboard.next();
    sure = input.charAt(0);
}


//#12
for (int count = 0; count < 50; count++) {
    System.out.println("count is " + count);
}

//#13
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    for (int j = i - 1; j >= 1; j--) {
        System.out.print(j + " ");
    }
    System.out.println();  
}

//#14
Scanner scanner = new Scanner(System.in);
int number;

do {
    System.out.print("Enter a number between 1 and 5: ");
    number = scanner.nextInt();
} while (number < 1 || number > 5);

System.out.println("You entered: " + number);


//#15
Scanner scanner = new Scanner(System.in);
String input;

do {
    System.out.print("Enter 'yes' or 'no': ");
    input = scanner.nextLine();
} while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

System.out.println("You entered: " + input);


//#16
import java.io.PrintWriter;
import java.io.IOException;

public class WriteEvenNumbersToFile {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("numberList.txt");
        for (int i = 2; i <= 50; i += 2) {
            writer.println(i);
        }
        writer.close();
        System.out.println("Even numbers written to file.");
    }
}


//#17
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbersFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("numberList.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println(number);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

//#18
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendOddNumbersToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("numberList.txt", true);  // true to append data
        PrintWriter writer = new PrintWriter(fileWriter);

        for (int i = 1; i <= 50; i += 2) {
            writer.println(i);
        }

        writer.close();
        System.out.println("Odd numbers appended to file.");
    }
}

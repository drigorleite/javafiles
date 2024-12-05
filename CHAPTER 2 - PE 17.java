import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.print("Enter the name of a city: ");
        String city = keyboard.nextLine();

        System.out.print("Enter the name of a college: ");
        String college = keyboard.nextLine();

        System.out.print("Enter a profession: ");
        String profession = keyboard.nextLine();

        System.out.print("Enter a type of animal: ");
        String animal = keyboard.nextLine();

        System.out.print("Enter a pet's name: ");
        String petName = keyboard.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");
    }
}

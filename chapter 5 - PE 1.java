import java.util.Scanner;

class Vehicle {
    private int speed;
    private int hours;

    public Vehicle(int speed, int hours) {
        if (speed < 0 || hours < 1) {
            throw new IllegalArgumentException("Speed must be non-negative, and hours must be at least 1.");
        }
        this.speed = speed;
        this.hours = hours;
    }

    public void getDistance() {
        System.out.println("Hour\tDistance Traveled");
        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            System.out.println(hour + "\t" + distance);
        }
    }
}

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the speed of the vehicle (mph): ");
        int speed = scanner.nextInt();
        
        System.out.print("Enter the number of hours traveled: ");
        int hours = scanner.nextInt();
        
        Vehicle vehicle = new Vehicle(speed, hours);
        vehicle.getDistance();
    }
}

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }
}

public class ParkingMeter {
    private int minutesPurchased;
 
    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
}


public class ParkingTicket {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private String officerName;
    private String badgeNumber;
    private double fine;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int illegallyParkedMinutes) {
        this.make = car.getMake();
        this.model = car.getModel();
        this.color = car.getColor();
        this.licenseNumber = car.getLicenseNumber();
        this.officerName = officer.getName();
        this.badgeNumber = officer.getBadgeNumber();
        this.fine = calculateFine(illegallyParkedMinutes);
    }

    private double calculateFine(int illegallyParkedMinutes) {
        int hours = (int) Math.ceil(illegallyParkedMinutes / 60.0);
        if (hours <= 1) {
            return 25.0;
        } else {
            return 25.0 + (hours - 1) * 10.0;
        }
    }

    public void printTicket() {
        System.out.println("Parking Ticket:");
        System.out.println("Car - Make: " + make + ", Model: " + model + ", Color: " + color + ", License: " + licenseNumber);
        System.out.println("Officer - Name: " + officerName + ", Badge Number: " + badgeNumber);
        System.out.println("Fine: $" + fine);
    }
}


public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public ParkingTicket inspectCar(ParkedCar car, ParkingMeter meter) {
        int minutesOver = car.getMinutesParked() - meter.getMinutesPurchased();
        if (minutesOver > 0) {
            return new ParkingTicket(car, this, minutesOver);
        }
        return null;
    }

    public class ParkingTicketSimulator {

        public static void main(String[] args) {
            ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 125);
    
            ParkingMeter meter = new ParkingMeter(60);
    
            PoliceOfficer officer = new PoliceOfficer("Officer Jane", "98765");
    
            ParkingTicket ticket = officer.inspectCar(car, meter);
    
            if (ticket != null) {
                ticket.printTicket();
            } else {
                System.out.println("No parking violation. No ticket issued.");
            }
        }
    }
    
}

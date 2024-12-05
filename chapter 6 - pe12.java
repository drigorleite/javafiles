public class CarInstrumentSimulator {

    public static class FuelGauge {
        private int fuel;  
        private final int MAX_FUEL = 15;

        public FuelGauge() {
            this.fuel = 0;  
        }

        public int getFuelLevel() {
            return fuel;
        }

        public void addFuel() {
            if (fuel < MAX_FUEL) {
                fuel++;
            } else {
                System.out.println("Fuel tank is full!");
            }
        }

        public void burnFuel() {
            if (fuel > 0) {
                fuel--;
            } else {
                System.out.println("Out of fuel!");
            }
        }
    }

    public static class Odometer {
        private int mileage;  
        private final int MAX_MILEAGE = 999999;
        private final int MILES_PER_GALLON = 24;

        private FuelGauge fuelGauge;  
        public Odometer(FuelGauge fuelGauge) {
            this.mileage = 0;
            this.fuelGauge = fuelGauge;
        }

        public int getMileage() {
            return mileage;
        }

        public void incrementMileage() {
            if (mileage < MAX_MILEAGE) {
                mileage++;
            } else {
                mileage = 0;  
            }

            if (mileage % MILES_PER_GALLON == 0) {
                fuelGauge.burnFuel();
            }
        }
    }

    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        System.out.println("Filling the car with fuel...");
        for (int i = 0; i < 15; i++) {
            fuelGauge.addFuel();
        }

        System.out.println("Starting the car...");
        while (fuelGauge.getFuelLevel() > 0) {
            odometer.incrementMileage();
            System.out.println("Mileage: " + odometer.getMileage() + " miles, Fuel level: " + fuelGauge.getFuelLevel() + " gallons");
        }

        System.out.println("The car has run out of fuel.");
    }
}

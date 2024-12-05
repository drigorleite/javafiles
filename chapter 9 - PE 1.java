public class Employee {
    private String employeeName;
    private String employeeNumber; // Format: XXX–L
    private String hireDate;

    public Employee(String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

public class ProductionWorker extends Employee {
    private int shift; 
    private double hourlyPayRate;

    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}

public class Main {
    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("John Doe", "123-A", "01/01/2023", 1, 20.50);
        System.out.println("Employee Name: " + worker.getEmployeeName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Shift: " + (worker.getShift() == 1 ? "Day" : "Night"));
        System.out.println("Hourly Pay Rate: $" + worker.getHourlyPayRate());
    }
}

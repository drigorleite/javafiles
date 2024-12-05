public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee [Name: " + name + ", ID: " + idNumber + 
               ", Department: " + department + ", Position: " + position + "]";
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 12345, "Sales", "Manager");
        System.out.println("Employee 1: " + emp1);

        Employee emp2 = new Employee("Jane Smith", 67890);
        System.out.println("Employee 2: " + emp2);

        Employee emp3 = new Employee();
        System.out.println("Employee 3: " + emp3);

        emp3.setName("Michael Johnson");
        emp3.setIdNumber(11223);
        emp3.setDepartment("IT");
        emp3.setPosition("Developer");
        System.out.println("Modified Employee 3: " + emp3);
    }
}

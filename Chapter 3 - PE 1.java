/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class Employee {
    private String name;
    private int id;
    private String department;
    private String position;

    public Employee(String name, int id, String department, String position) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.position = position;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getPosition() {
        return position;
    }
    
    
    public static void main(String[] args) {
        // Criando instâncias da classe Employee
        Employee name1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee name2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee name3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Exemplo de saída (opcional)
        System.out.println("NAME      -    ID   -  DEPARTMENT - POSITION");
        System.out.println("");
        System.out.println(name1.getName() + " - " + name1.getId()  + " - " + name1.getDepartment()  + " - " + name1.getPosition());
        System.out.println(name2.getName() + " - " + name2.getId()  + " - " + name2.getDepartment()  + " - " + name2.getPosition());
        System.out.println(name3.getName() + " - " + name3.getId()  + " - " + name3.getDepartment()  + " - " + name3.getPosition());
    }
}

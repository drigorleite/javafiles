public class Person {
    private String name;
    private String address;
    private String telephoneNumber;

    public Person(String name, String address, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}

public class Customer extends Person {
    private String customerNumber;
    private boolean onMailingList;

    public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean onMailingList) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane Doe", "123 Main St", "555-1234", "C123", true);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Telephone: " + customer.getTelephoneNumber());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("On Mailing List: " + (customer.isOnMailingList() ? "Yes" : "No"));
    }
}

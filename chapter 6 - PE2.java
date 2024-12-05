public class InventoryItem {

    private String description;
    private int units;

    public InventoryItem(String description, int units) {
        this.description =  description;
        this.units = units;
    }

    public InventoryItem(inventoryItem item) {
        this.description = item.description;
        this.units = item.units;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }


    public String toString() {
        return "inventoryItem [Description: " + description + ", Units: " + units + "]"; 
    }

    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem("lapotop", 50);

        InventoryItem item2 = new InventoryItem(item1);

        System.out.println("Item 1: " + item1);
        System.out.println("Item 2 (copy of Item 1): " + item2);

        item1.setUnits(30);
        System.out.println("\nAfter modifying item 1: ");

        System.out.println("Item 1: " + item1);
        System.out.println("Item 2 (copy of item 1): " + item2);
    }
}
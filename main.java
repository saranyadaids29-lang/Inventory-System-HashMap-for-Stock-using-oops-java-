import java.util.*;

public class InventorySystem {

    static HashMap<String, Integer> inventory = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void addItem() {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        inventory.put(name, qty);
        System.out.println("Item added successfully!");
    }
    public static void updateItem() {
        System.out.print("Enter Item Name to update: ");
        String name = sc.nextLine();

        if (inventory.containsKey(name)) {
            System.out.print("Enter new Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            inventory.put(name, qty);
            System.out.println("Item updated successfully!");
        } else {
            System.out.println("Item not found!");
        }
    }
    public static void deleteItem() {
        System.out.print("Enter Item Name to delete: ");
        String name = sc.nextLine();

        if (inventory.containsKey(name)) {
            inventory.remove(name);
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Item not found!");
        }
    }
    public static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n--- Inventory List ---");
        for (Map.Entry<String, Integer> item : inventory.entrySet()) {
            System.out.println("Item: " + item.getKey() + " | Quantity: " + item.getValue());
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== INVENTORY SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Delete Item");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addItem(); break;
                case 2: updateItem(); break;
                case 3: deleteItem(); break;
                case 4: displayInventory(); break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

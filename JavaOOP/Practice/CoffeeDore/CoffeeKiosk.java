import java.util.ArrayList;

public class CoffeeKiosk {
    // MEMBER VARIABLES
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // CONSTRUCTOR
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // getters and setters
    // public ArrayList<Item> getMenu() {
    // return menu;
    // }

    // public void setMenu(ArrayList<Item> menu) {
    // this.menu = menu;
    // }

    // public ArrayList<Order> getOrders() {
    // return orders;
    // }

    // public void setOrders(ArrayList<Order> orders) {
    // this.orders = orders;
    // }

    // addMenuItem
    // The addMenuItem method should create a new item object with the given name
    // and price.
    // Add the new Item object to the menu items array.
    // The new menu item itself will also need to be assigned an index property.
    // The value should be its position, its index, in the menu array.
    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        menu.add(item);
        item.setIndex(menu.indexOf(item));
    }

    // displayMenu
    // Now with an array of items you can display the menu without needing separate
    // arrays of names and prices!
    // The displayMenu method should display all of the items from the menu array
    // like
    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getIndex() + " " + menu.get(i).getName() + " -- " + menu.get(i).getPrice());
        }
    }

    // newOrder
    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();

        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {

            // Get the item object from the menu, and add the item to the order
            try {
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            } catch (IndexOutOfBoundsException i) {
                System.out.println("Invalid selection");
            } catch (NumberFormatException n) {
                System.out.println("Invalid selection");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details
        order.display(order);

    }

}

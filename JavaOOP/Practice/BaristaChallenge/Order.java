import java.util.ArrayList;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // ORDER METHODS

    // Most of your code will go here,
    // so implement the getters and setters first!

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // addItem
    public void addItem(Item item) {
        items.add(item);
    }

    // getStatusMessage
    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // getOrderTotal
    public double getOrderTotal(Order order) {
        ArrayList<Item> items = order.items;
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice();
        }
        return total;
    }

    // display
    public void display(Order order) {
        ArrayList<Item> items = order.items;
        System.out.println("Customer Name: " + order.getName());
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " - " + items.get(i).getPrice());
        }
        System.out.println("Total : " + order.getOrderTotal(order));
    }
}

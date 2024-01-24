import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("Latte", 2.50);
        Item item2 = new Item("Drip Coffe", 1.50);
        Item item3 = new Item("Latte", 3.50);
        Item item4 = new Item("Cappuccino", 2.00);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Diana");
        Order order4 = new Order("Emily");
        Order order5 = new Order("Edward");
        // Orders and Methods
        // order1
        order1.addItem(item4);
        order1.addItem(item3);
        order1.getStatusMessage();
        double total1 = order1.getOrderTotal(order1);
        // order2
        order2.addItem(item4);
        order2.addItem(item3);
        order2.addItem(item3);
        order2.getStatusMessage();
        double total2 = order2.getOrderTotal(order2);
        // order3
        order3.addItem(item4);
        order3.addItem(item3);
        order3.addItem(item1);
        order3.getStatusMessage();
        double total3 = order3.getOrderTotal(order3);
        // order4
        order4.addItem(item4);
        order4.addItem(item3);
        order4.addItem(item1);
        order4.addItem(item2);
        order4.getStatusMessage();
        double total4 = order4.getOrderTotal(order4);
        // order5
        order5.addItem(item4);
        order5.addItem(item3);
        order5.addItem(item1);
        order5.getStatusMessage();
        double total5 = order5.getOrderTotal(order5);

        // Ready
        order1.setReady(true);

        // Display
        order1.display(order1);
        order2.display(order2);
        order3.display(order3);
        order4.display(order4);
        order5.display(order5);

        // Application Simulations
        System.out.println(item1.getName() + "'s price is " + item1.getPrice() + " £");
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Ready: %s\n", order1.getReady());

        System.out.println("Total 1 is : " + total1);
        System.out.println("Total 1 is : " + order1.getOrderTotal(order1));
        System.out.println("Total 2 is : " + total2);
        System.out.println("Total 3 is : " + total3);
        System.out.println("Total 4is : " + total4);
        System.out.println("Total 5 is : " + total5);
    }
}

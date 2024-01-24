import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int numWeeks = 10;
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (Double d : prices) {
            sum = sum + d;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // public void addCustomer(ArrayList<String> customers) {
    // System.out.println("Please enter your name:");
    // String username = System.console().readLine();

    // System.out.println("Hello, " + username + "!");
    // System.out.println("There are " + customers.size() + " people in front of
    // you");
    // customers.add(username);
    // System.out.println("customers: " + customers);
    // }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i < maxQuantity + 1; i++) {
            double discount = (i - 1) * 0.50;
            System.out.println(i + "- $ " + ((i * price) - discount));

        }

    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        } else {
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(i + " " + menuItems.get(i) + " -- $" + prices.get(i));
            }
            return true;
        }

    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please type 'q' when they are finished entering names.");
        String username = "";
        while (!username.equals("q")) {
            System.out.println("Please enter your name:");
            username = System.console().readLine();
            System.out.println("Hello, " + username + "!");
            System.out.println("There are " + customers.size() + " people in front of you");
            customers.add(username);
            System.out.println("customers: " + customers);
        }

    }
}

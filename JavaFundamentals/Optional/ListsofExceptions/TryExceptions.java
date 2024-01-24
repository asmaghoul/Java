import java.util.ArrayList;

public class TryExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {
            try {
                if (myList.get(i) instanceof String) {
                    String newString = (String) myList.get(i);
                    Integer castedValue = Integer.valueOf(newString);
                    System.out.println(castedValue);
                } else {
                    if (myList.get(i) instanceof Integer) {
                        Integer newString = Integer.valueOf(myList.get(i).toString());
                        System.out.println(newString);
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format");
            }
        }
    }

}

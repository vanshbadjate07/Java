/*
Design a shopping cart application that allows users to add items to their cart. The
program should ask the user for item names and prices in a loop until the user types
"checkout". After checking out, display the total amount due and a list of items
purchased.
 */
import java.util.*;

class _30_shopping_cart {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String[] items = new String[100]; // Assuming a maximum of 100 items
        double[] prices = new double[100];
        int count = 0; 
        double totalAmount = 0.0;

        while (true) {
            System.out.println("Enter Item Name (type Checkout to exit): ");
            String item_name = s.nextLine();

            if (item_name.equalsIgnoreCase("Checkout")) {
                break;
            }

            System.out.println("Enter Price: ");
            double price = s.nextDouble();
            s.nextLine();

            items[count] = item_name;
            prices[count] = price;
            count++;

            totalAmount += price;
        }

        System.out.println("\nBill:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i] + " : Rs. " + prices[i]);
        }
        System.out.println("Total Amount is: Rs. " + totalAmount);
    }
}

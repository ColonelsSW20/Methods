import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        double itemPrice;
        boolean moreItems = true;
        // Continue accepting items while the user wants to add more
        while (moreItems) {
            itemPrice = SafeInput.getRangedDouble(
                    in,
                    "Enter the price of your item ($0.50 - $99.99)",
                    0.50,
                    99.99
            );
            // Add item price to the running total
            total += itemPrice;
            // Ask whether the user has more items
            moreItems = SafeInput.getYNConfirm(
                    in,
                    "Do you have another item?"
            );
        }
        // Display the final total to two decimal places
        System.out.printf("The total cost of your items is: $%.2f%n", total);
    }
}
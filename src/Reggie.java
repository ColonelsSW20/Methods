import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get Social Security Number
        String ssn = SafeInput.getRegExString(
                in,
                "Enter your Social Security Number (123-45-6789)",
                "\\d{3}-\\d{2}-\\d{4}"
        );
        // Get UC Student M Number
        String mNumber = SafeInput.getRegExString(
                in,
                "Enter your UC Student M Number (M12345)",
                "(M|m)\\d{5}"
        );
        // Get ZIP+4 Code
        String zipPlusFour = SafeInput.getRegExString(
                in,
                "Enter your ZIP+4 Code (12345-6789)",
                "\\d{5}-\\d{4}"
        );
        // Display the accepted information
        System.out.println("\nYour Information:");
        System.out.println("Social Security Number: " + ssn);
        System.out.println("UC Student M Number: " + mNumber);
        System.out.println("ZIP+4 Code: " + zipPlusFour);
    }
}

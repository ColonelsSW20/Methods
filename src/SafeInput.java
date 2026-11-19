import java.util.Scanner;
public class SafeInput {
    // Gets a non-empty String
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
            if (retString.trim().isEmpty()) {
                System.out.println("You must enter something. Please try again.");
            }
        } while (retString.trim().isEmpty());
        return retString;
    }
    // Gets an integer
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            try {
                retInt = Integer.parseInt(pipe.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        } while (!valid);
        return retInt;
    }
    // Gets a double
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            try {
                retDouble = Double.parseDouble(pipe.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!valid);
        return retDouble;
    }
    // Gets an integer within a specified range
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt;
        do {
            retInt = getInt(pipe, prompt);
            if (retInt < low || retInt > high) {
                System.out.println("Please enter a number between " + low + " and " + high + ".");
            }
        } while (retInt < low || retInt > high);
        return retInt;
    }
    // Gets a double within a specified range
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble;
        do {
            retDouble = getDouble(pipe, prompt);
            if (Double.isNaN(retDouble) || retDouble < low || retDouble > high) {
                System.out.println("Please enter a number between " + low + " and " + high + ".");
            }
        } while (Double.isNaN(retDouble) || retDouble < low || retDouble > high);
        return retDouble;
    }
    // Gets a Yes or No confirmation
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print(prompt + " (Y/N): ");
            response = pipe.nextLine().trim();
            if (!response.equalsIgnoreCase("Y") &&
                    !response.equalsIgnoreCase("N")) {

                System.out.println("Please enter Y or N.");
            }
        } while (!response.equalsIgnoreCase("Y") &&
                !response.equalsIgnoreCase("N"));
        return response.equalsIgnoreCase("Y");
    }
    // Gets a String that matches a specified regular expression
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response;
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
            if (!response.matches(regEx)) {
                System.out.println("Invalid format. Please try again.");
            }
        } while (!response.matches(regEx));
        return response;
    }
}
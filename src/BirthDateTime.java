import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get the birth year
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1921, 2020);
        // Get the birth month
        int month = SafeInput.getRangedInt(in, "Enter birth month (1-12)", 1, 12);
        // Determine the maximum number of days in the month
        int maxDays;
        switch (month) {
            case 2:
                maxDays = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }
        // Get the birthday
        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, maxDays);
        // Get the birth hour
        int hour = SafeInput.getRangedInt(in, "Enter birth hour (1-24)", 1, 24);
        // Get the birth minute
        int minute = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59);
        // Display the completed birthdate and time
        System.out.println("\nBirth Date and Time:");
        System.out.println("Date: " + month + "/" + day + "/" + year);
        System.out.println("Time: " + hour + ":" + minute);
    }
}

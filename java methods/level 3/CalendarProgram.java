import java.util.*;

public class CalendarProgram {

    // Method to print calendar of a given month & year
    public static void printCalendar(int month, int year) {
        // Array with days in each month
        int[] daysInMonth = {
            31, // Jan
            28, // Feb
            31, // Mar
            30, // Apr
            31, // May
            30, // Jun
            31, // Jul
            31, // Aug
            30, // Sep
            31, // Oct
            30, // Nov
            31  // Dec
        };

        // Leap year adjustment for February
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Names of months
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Print header
        System.out.println("     " + months[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Get the first day of the month
        Calendar cal = new GregorianCalendar(year, month - 1, 1);
        int startDay = cal.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 7=Saturday

        // Print initial spaces
        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%2d ", day);

            // New line after Saturday
            if ((day + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}

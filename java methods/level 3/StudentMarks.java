import java.util.*;

public class StudentMarks {

    // Method to calculate grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else if (percentage >= 35) return "D";
        else return "F";
    }

    // Method to check Pass/Fail
    public static String getResult(double percentage) {
        return (percentage >= 35) ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store details
        String[] names = new String[n];
        int[][] marks = new int[n][3]; // 3 subjects
        int[] total = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        String[] result = new String[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.next();

            System.out.print("Marks in Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Marks in Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Marks in Maths: ");
            marks[i][2] = sc.nextInt();

            // Calculations
            total[i] = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total[i] / 3.0;
            grade[i] = getGrade(percentage[i]);
            result[i] = getResult(percentage[i]);
        }

        // Display report card
        System.out.println("\n========= Student Report =========");
        System.out.printf("%-10s %-8s %-10s %-10s %-8s %-12s %-10s\n",
                          "Name", "Total", "Percentage", "Grade", "Physics", "Chemistry", "Maths");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-8d %-10.2f %-10s %-8d %-12d %-10d\n",
                              names[i], total[i], percentage[i], grade[i],
                              marks[i][0], marks[i][1], marks[i][2]);
        }
    }
}

import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert to meters
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{
            String.format("%.1f", weight),
            String.format("%.1f", heightCm),
            String.format("%.2f", bmi),
            status
        };
    }

    // Method that takes height & weight array and returns BMI + Status table
    public static String[][] computeTable(double[][] persons) {
        String[][] result = new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {
            result[i] = calculateBMI(persons[i][0], persons[i][1]);
        }
        return result;
    }

    // Display Method
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("---------------------------------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2]; // 10 rows, weight+height

        System.out.println("Enter weight (kg) and height (cm) of 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] results = computeTable(persons);
        displayTable(results);
    }
}

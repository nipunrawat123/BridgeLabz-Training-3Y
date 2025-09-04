import java.util.*;

public class EmployeePayroll {

    // Method to calculate DA (10% of salary)
    public static double calculateDA(double salary) {
        return salary * 0.10;
    }

    // Method to calculate HRA (15% of salary)
    public static double calculateHRA(double salary) {
        return salary * 0.15;
    }

    // Method to calculate PF (12% of salary)
    public static double calculatePF(double salary) {
        return salary * 0.12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Arrays to store details
        String[] names = new String[n];
        double[] salary = new double[n];
        double[] da = new double[n];
        double[] hra = new double[n];
        double[] gross = new double[n];
        double[] pf = new double[n];
        double[] net = new double[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Basic Salary: ");
            salary[i] = sc.nextDouble();

            // Calculations
            da[i] = calculateDA(salary[i]);
            hra[i] = calculateHRA(salary[i]);
            pf[i] = calculatePF(salary[i]);
            gross[i] = salary[i] + da[i] + hra[i];
            net[i] = gross[i] - pf[i];
        }

        // Display payroll
        System.out.println("\n========= Employee Payroll =========");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Name", "Salary", "DA", "HRA", "Gross", "PF", "Net");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n", 
                              names[i], salary[i], da[i], hra[i], gross[i], pf[i], net[i]);
        }
    }
}

import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("Sum of numbers = " + total);
    }
}

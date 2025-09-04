import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check numbers
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        int first = numbers[0], last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First and last are equal");
        } else if (first > last) {
            System.out.println("First is greater than last");
        } else {
            System.out.println("First is less than last");
        }
    }
}

public class NumberChecker5 {

    // Method to find sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Perfect number check
    // A number equal to the sum of its proper divisors
    public static boolean isPerfect(int number) {
        return number > 1 && sumOfDivisors(number) == number;
    }

    // Abundant number check
    // Sum of divisors > number
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    // Deficient number check
    // Sum of divisors < number
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    // Strong number check
    // Strong number: sum of factorial of digits == number
    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    // Factorial helper
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28; // try with 12, 145, etc.

        System.out.println("Number: " + number);
        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
    }
}

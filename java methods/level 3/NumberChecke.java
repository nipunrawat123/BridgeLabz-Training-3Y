public class NumberChecker {

    // Count digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Store digits in array
    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Duck number check
    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(number);
        return s.contains("0") && !s.startsWith("0");
    }

    // Armstrong number check
    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // Largest and second largest
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    // Smallest and second smallest
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Digits Count: " + countDigits(number));
        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nDuck Number? " + isDuckNumber(number));
        System.out.println("Armstrong? " + isArmstrong(number));
        int[] largestTwo = findLargestTwo(digits);
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Largest & 2nd Largest: " + largestTwo[0] + ", " + largestTwo[1]);
        System.out.println("Smallest & 2nd Smallest: " + smallestTwo[0] + ", " + smallestTwo[1]);
    }
}

public class NumberChecker2 {

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

    // Sum of digits
    public static int sumOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquares(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Harshad number check
    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Frequency of digits
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] freq = new int[10][2]; // digit, frequency
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 156;
        System.out.println("Sum of Digits: " + sumOfDigits(number));
        System.out.println("Sum of Squares: " + sumOfSquares(number));
        System.out.println("Harshad? " + isHarshad(number));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}

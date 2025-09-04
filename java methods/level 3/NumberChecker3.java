import java.util.Arrays;

public class NumberChecker3 {

    // Get digits
    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Reverse array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Compare arrays
    public static boolean areEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Palindrome check
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] rev = reverseArray(digits);
        return areEqual(digits, rev);
    }

    // Duck number check (reuse)
    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(number);
        return s.contains("0") && !s.startsWith("0");
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println("Palindrome? " + isPalindrome(number));
        System.out.println("Duck Number? " + isDuckNumber(number));
    }
}

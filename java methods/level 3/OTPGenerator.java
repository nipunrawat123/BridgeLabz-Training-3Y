import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); // ensures 6-digit number
    }

    // Method to check uniqueness of OTPs
    public static boolean checkUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) { // duplicate found
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check uniqueness
        if (checkUnique(otps)) {
            System.out.println("✅ All OTPs are unique!");
        } else {
            System.out.println("❌ Duplicate OTP found!");
        }
    }
}

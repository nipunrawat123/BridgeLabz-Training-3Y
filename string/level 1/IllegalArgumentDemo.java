import java.util.Scanner;

public class IllegalArgumentDemo {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // invalid start > end
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        //generateException(text);
        handleException(text);
    }
}

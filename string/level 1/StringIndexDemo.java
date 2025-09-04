import java.util.Scanner;

public class StringIndexDemo {
    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
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

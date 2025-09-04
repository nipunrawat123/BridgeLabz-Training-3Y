import java.util.Scanner;

public class ArrayIndexDemo {
    static void generateException(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amit", "Raj", "Simran"};
        handleException(names);
    }
}

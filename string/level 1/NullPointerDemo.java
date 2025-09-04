public class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // generates NullPointerException
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        //generateException(); // Uncomment to see abrupt stop
        handleException();    // Safe execution
    }
}

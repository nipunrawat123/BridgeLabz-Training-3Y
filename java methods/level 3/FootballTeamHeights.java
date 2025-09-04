import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int min = findShortest(heights);
        int max = findTallest(heights);

        System.out.println("Players' Heights:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + min + " cm");
        System.out.println("Tallest: " + max + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static double findMean(int sum, int n) {
        return (double) sum / n;
    }

    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) if (val > max) max = val;
        return max;
    }
}

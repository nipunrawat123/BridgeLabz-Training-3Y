import java.util.Scanner;

public class ShortLongWordDemo {
    static String[] customSplit(String text) {
        return text.split(" "); // reusing split for simplicity
    }

    static int customLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    static int[] findShortestLongest(String[] words) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (customLength(words[i]) < customLength(words[minIndex]))
                minIndex = i;
            if (customLength(words[i]) > customLength(words[maxIndex]))
                maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        int[] result = findShortestLongest(words);

        System.out.println("Shortest Word: " + words[result[0]]);
        System.out.println("Longest Word: " + words[result[1]]);
    }
}

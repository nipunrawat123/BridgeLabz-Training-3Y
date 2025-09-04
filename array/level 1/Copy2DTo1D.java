import java.util.Scanner;

class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter cols: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Copy to 1D
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Print
        System.out.print("1D Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

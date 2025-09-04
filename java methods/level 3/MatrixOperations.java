import java.util.*;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random 0–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = B.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows and columns of matrix A: ");
        int rowsA = sc.nextInt(), colsA = sc.nextInt();

        System.out.print("Enter rows and columns of matrix B: ");
        int rowsB = sc.nextInt(), colsB = sc.nextInt();

        // Generate matrices
        int[][] A = createMatrix(rowsA, colsA);
        int[][] B = createMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        // Addition & Subtraction (only if dimensions match)
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nAddition (A + B):");
            displayMatrix(addMatrix(A, B));

            System.out.println("\nSubtraction (A - B):");
            displayMatrix(subtractMatrix(A, B));
        } else {
            System.out.println("\nAddition & Subtraction not possible (dimension mismatch).");
        }

        // Multiplication (only if colsA == rowsB)
        if (colsA == rowsB) {
            System.out.println("\nMultiplication (A × B):");
            displayMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("\nMultiplication not possible (dimension mismatch).");
        }
    }
}

import java.util.*;

public class MatrixAdvancedOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random values 0–9
            }
        }
        return matrix;
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

    // Method to find transpose
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Matrix has no inverse (determinant = 0).");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] =  m[0][0] / (double) det;
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Matrix has no inverse (determinant = 0).");
            return null;
        }
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int mi = 0, mj = 0;
                for (int row = 0; row < 3; row++) {
                    if (row == i) continue;
                    mj = 0;
                    for (int col = 0; col < 3; col++) {
                        if (col == j) continue;
                        minor[mi][mj] = m[row][col];
                        mj++;
                    }
                    mi++;
                }
                int sign = ((i + j) % 2 == 0) ? 1 : -1;
                inv[j][i] = (sign * determinant2x2(minor)) / (double) det;
            }
        }
        return inv;
    }

    // Display double matrix (for inverse)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createMatrix(n, n);
        System.out.println("\nMatrix:");
        displayMatrix(matrix);

        // Transpose
        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        // Determinant & Inverse
        if (n == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant = " + det);

            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        } else if (n == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant = " + det);

            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        } else {
            System.out.println("Only 2x2 and 3x3 supported.");
        }
    }
}

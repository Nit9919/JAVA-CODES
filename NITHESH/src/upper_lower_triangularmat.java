import java.util.*;
public class upper_lower_triangularmat {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int n = matrix.length;

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            System.out.println("\nUpper Triangular Matrix:");
            printUpperTriangular(matrix, n);

            System.out.println("\nLower Triangular Matrix:");
            printLowerTriangular(matrix, n);
        }

        // Function to print original matrix
        public static void printMatrix(int[][] mat) {
            for (int[] row : mat) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        // Function to print upper triangular matrix
        public static void printUpperTriangular(int[][] mat, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < i) { // elements below diagonal
                        System.out.print("0 ");
                    } else {
                        System.out.print(mat[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        // Function to print lower triangular matrix
        public static void printLowerTriangular(int[][] mat, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > i) { // elements above diagonal
                        System.out.print("0 ");
                    } else {
                        System.out.print(mat[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }



import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr[i][i]; // Elements for primary diagonal
            secondaryDiagonalSum += arr[i][n - 1 - i]; // Elements for secondary diagonal
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum); // Return the absolute difference
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Size of the matrix (n x n)
        int[][] arr = new int[n][n];

        // Read the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the diagonal difference
        System.out.println(diagonalDifference(arr));

        scanner.close();
    }
}

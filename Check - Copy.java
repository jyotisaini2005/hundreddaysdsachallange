<<<<<<< HEAD
import java.util.*;

public class Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // rows
        int m = sc.nextInt();  // columns

        int[][] matrix = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check for Square Matrix
        if (n != m) {
            System.out.println("Not an Identity Matrix");
            return;
        }

        // Assume it is an Identity Matrix
        boolean identity = true;

        // Check Identity Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == j) {
                    // Diagonal elements must be 1
                    if (matrix[i][j] != 1) {
                        identity = false;
                    }
                } 
                else {
                    // Non-diagonal elements must be 0
                    if (matrix[i][j] != 0) {
                        identity = false;
                    }
                }
            }
        }

        // Final result
        if (identity) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }

        sc.close();
    }
=======
import java.util.*;

public class Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // rows
        int m = sc.nextInt();  // columns

        int[][] matrix = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check for Square Matrix
        if (n != m) {
            System.out.println("Not an Identity Matrix");
            return;
        }

        // Assume it is an Identity Matrix
        boolean identity = true;

        // Check Identity Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == j) {
                    // Diagonal elements must be 1
                    if (matrix[i][j] != 1) {
                        identity = false;
                    }
                } 
                else {
                    // Non-diagonal elements must be 0
                    if (matrix[i][j] != 0) {
                        identity = false;
                    }
                }
            }
        }

        // Final result
        if (identity) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }

        sc.close();
    }
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}
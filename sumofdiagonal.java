<<<<<<< HEAD
import java.util.*;

public class sumofdiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns

        int[][] matrix = new int[m][n];

        // Taking input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Finding primary diagonal sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }
=======
import java.util.*;

public class sumofdiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns

        int[][] matrix = new int[m][n];

        // Taking input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Finding primary diagonal sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}
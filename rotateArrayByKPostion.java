import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int j = 0; j < k; j++) {

            // Store the last element
            int temp = arr[n - 1];

            // Shift elements to the right
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            // Put last element at first position
            arr[0] = temp;
        }

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
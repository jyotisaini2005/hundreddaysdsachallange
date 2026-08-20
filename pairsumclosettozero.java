import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store minimum distance from zero
        int minSum = Integer.MAX_VALUE;

        // Store answer pair
        int first = 0;
        int second = 0;

        // Check every possible pair
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                int sum = arr[i] + arr[j];

                // Check if current sum is closer to zero
                if (Math.abs(sum) < minSum) {

                    minSum = Math.abs(sum);

                    first = arr[i];
                    second = arr[j];
                }
            }
        }

        // Print the pair
        System.out.println(first + " " + second);
    }
}
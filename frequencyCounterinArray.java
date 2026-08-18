import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int t = 0;

        // Select each element
        for (int i = 0; i < n; i++) {

            int current = arr[i];
            int count = 0;

            // Check if already counted
            for (int k = 0; k < t; k++) {
                if (temp[k] == current) {
                    count = -1;
                    break;
                }
            }

            // Already counted → skip
            if (count == -1) {
                continue;
            }

            // Count frequency
            count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == current) {
                    count++;
                }
            }

            System.out.print(current + ":" + count + " ");

            // Store element in temp
            temp[t] = current;
            t++;
        }

        sc.close();
    }
}
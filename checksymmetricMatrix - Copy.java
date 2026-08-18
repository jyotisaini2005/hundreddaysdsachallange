// Problem: Write a program to check whether a given matrix is symmetric. A matrix is said to be symmetric if it is a square matrix and is equal to its transpose (i.e., element at position [i][j] is equal to element at position [j][i] for all valid i and j).
import java.util.Scanner;

class Symmetric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n;

        // Rows and columns input
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] arr = new int[m][n];

        // Matrix elements input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // First check whether matrix is square
        if (m != n) {
            System.out.println("Not a Symmetric Matrix");
        } 
        else {
            boolean symmetric = true;

            // Check arr[i][j] == arr[j][i]
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (arr[i][j] != arr[j][i]) {
                        symmetric = false;
                        break;
                    }
                }

                if (!symmetric) {
                    break;
                }
            }

            if (symmetric) {
                System.out.println("Symmetric Matrix");
            } 
            else {
                System.out.println("Not a Symmetric Matrix");
            }
        }

        sc.close();
    }
}
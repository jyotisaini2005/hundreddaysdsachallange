```java
public class Main {
    public static void main(String[] args) {

        int n = 3;

        int[][] graph = new int[n][n];

        // A - B
        graph[0][1] = 1;
        graph[1][0] = 1;

        // A - C
        graph[0][2] = 1;
        graph[2][0] = 1;

        // B - C
        graph[1][2] = 1;
        graph[2][1] = 1;

        // Print adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
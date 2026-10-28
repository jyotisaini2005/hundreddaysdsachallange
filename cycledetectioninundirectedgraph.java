import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;

    static boolean dfs(int node, int parent) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                if (dfs(neighbor, node)) {
                    return true;
                }
            }
            else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                if (dfs(i, -1)) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
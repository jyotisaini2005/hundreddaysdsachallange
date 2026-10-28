import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(
        ArrayList<ArrayList<Integer>> adj, int s) {

        int n = adj.size();

        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        ArrayList<Integer> result = new ArrayList<>();

        q.offer(s);
        visited[s] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            result.add(node);

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    q.offer(neighbour);
                }
            }
        }

        return result;
    }
}
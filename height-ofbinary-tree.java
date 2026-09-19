import java.util.*;

class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find height of binary tree
    static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create root
        Node root = new Node(arr[0]);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < n) {

            Node current = q.poll();

            // Left child
            if (arr[i] != -1) {
                current.left = new Node(arr[i]);
                q.add(current.left);
            }
            i++;

            // Right child
            if (i < n && arr[i] != -1) {
                current.right = new Node(arr[i]);
                q.add(current.right);
            }
            i++;
        }

        System.out.println(height(root));
    }
}
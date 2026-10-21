
import java.util.*;

class Main {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0 || arr[0] == -1) {
            sc.close();
            return;
        }

        // Build the binary tree
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int index = 1;

        while (!q.isEmpty() && index < n) {
            TreeNode current = q.poll();

            if (index < n && arr[index] != -1) {
                current.left = new TreeNode(arr[index]);
                q.offer(current.left);
            }
            index++;

            if (index < n && arr[index] != -1) {
                current.right = new TreeNode(arr[index]);
                q.offer(current.right);
            }
            index++;
        }

        // Right View
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == size - 1) {
                    System.out.print(node.data + " ");
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        sc.close();
    }
}

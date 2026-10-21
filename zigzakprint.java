
import java.util.*;

public class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node buildTree(int[] arr, int n) {
        if (n == 0 || arr[0] == -1) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < n) {
            Node current = q.poll();

            if (i < n && arr[i] != -1) {
                current.left = new Node(arr[i]);
                q.offer(current.left);
            }
            i++;

            if (i < n && arr[i] != -1) {
                current.right = new Node(arr[i]);
                q.offer(current.right);
            }
            i++;
        }

        return root;
    }

    static void zigzag(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;
        List<Integer> answer = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                temp.add(current.data);

                if (current.left != null) {
                    q.offer(current.left);
                }

                if (current.right != null) {
                    q.offer(current.right);
                }
            }

            if (!leftToRight) {
                Collections.reverse(temp);
            }

            answer.addAll(temp);
            leftToRight = !leftToRight;
        }

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr, n);
        zigzag(root);

        sc.close();
    }
}

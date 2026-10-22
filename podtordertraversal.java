import java.util.*;

class Main {
    static int postIndex;
    static int[] inorder, postorder;
    static Map<Integer, Integer> map = new HashMap<>();

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node buildTree(int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        // Postorder ka last unused element root hai
        int rootVal = postorder[postIndex--];
        Node root = new Node(rootVal);

        // Inorder mein root ki position
        int mid = map.get(rootVal);

        // Reverse postorder mein right subtree pehle banta hai
        root.right = buildTree(mid + 1, inEnd);
        root.left = buildTree(inStart, mid - 1);

        return root;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        inorder = new int[n];
        postorder = new int[n];

        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            postorder[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        postIndex = n - 1;

        Node root = buildTree(0, n - 1);
        preorder(root);
    }
}
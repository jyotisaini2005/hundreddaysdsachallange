class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTSearch {

    // Function to search an element in BST
    static boolean search(Node root, int key) {

        while (root != null) {

            // Element found
            if (root.data == key) {
                return true;
            }

            // Key is smaller, go to left
            else if (key < root.data) {
                root = root.left;
            }

            // Key is greater, go to right
            else {
                root = root.right;
            }
        }

        // Element not found
        return false;
    }

    public static void main(String[] args) {

        // Creating BST
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Search
        int key = 60;

        if (search(root, key)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
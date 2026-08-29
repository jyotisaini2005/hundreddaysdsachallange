import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of nodes
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Insertion
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            // First node
            if (head == null) {
                head = newNode;
                tail = newNode;
            }

            // Remaining nodes
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Forward traversal
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }
}
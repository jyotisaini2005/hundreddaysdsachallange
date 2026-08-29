import java.util.*;

public class CountLinkedListOccurrence {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of nodes
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Creating the linked list
        for (int i = 0; i < n; i++) {

            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Input key
        int key = sc.nextInt();

        // Counting occurrences
        int count = 0;

        Node current = head;

        while (current != null) {

            if (current.data == key) {
                count++;
            }

            current = current.next;
        }

        System.out.println(count);

        sc.close();
    }
}
import java.util.*;

public class deleteFirstoccurenceOKey {

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

        // Input n
        int n = sc.nextInt();

        // Create linked list
        Node head = null;
        Node temp = null;

        for (int i = 0; i < n; i++) {

            int data = sc.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } 
            else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Input key
        int key = sc.nextInt();

        // Delete first occurrence
        Node current = head;
        Node previous = null;

        while (current != null) {

            if (current.data == key) {

                // Case 1: key is at first node
                if (previous == null) {
                    head = current.next;
                }

                // Case 2: key is in middle or end
                else {
                    previous.next = current.next;
                }

                break;
            }

            previous = current;
            current = current.next;
        }

        // Print linked list
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}
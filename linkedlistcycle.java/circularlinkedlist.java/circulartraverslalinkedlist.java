package circularlinkedlist.java;
import java.util.Scanner;

public class circulartraverslalinkedlist {
    

public class Main {

    // Node class
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

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                // First node
                head = newNode;
                tail = newNode;
            } 
            else {
                // Add new node
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Make linked list circular
        tail.next = head;

        // Traverse circular linked list
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        sc.close();
    }
}
}
    


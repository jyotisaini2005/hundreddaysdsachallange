import java.util.Scanner;

public class reverseLinkedList {

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

        int data = sc.nextInt();

        Node first = new Node(data);

        Node temp = first;

        // Linked List Creation
        for (int i = 1; i < n; i++) {

            data = sc.nextInt();

            Node newNode = new Node(data);

            temp.next = newNode;

            temp = newNode;
        }

        // Reverse Linked List
        Node prev = null;
        Node curr = first;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        // First node of reversed list
        first = prev;

        // Traversal
        temp = first;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
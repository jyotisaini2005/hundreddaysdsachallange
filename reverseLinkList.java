import java.util.Scanner;

public class Main {

    // Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked list mein node add karna
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Merge two sorted linked lists
    static Node merge(Node list1, Node list2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } 
            else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        // Jo list bach gayi usko attach kar do
        if (list1 != null) {
            tail.next = list1;
        } 
        else {
            tail.next = list2;
        }

        return dummy.next;
    }

    // Print linked list
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First list
        int n = sc.nextInt();

        Node list1 = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list1 = insert(list1, data);
        }

        // Second list
        int m = sc.nextInt();

        Node list2 = null;

        for (int i = 0; i < m; i++) {
            int data = sc.nextInt();
            list2 = insert(list2, data);
        }

        // Merge
        Node result = merge(list1, list2);

        // Print
        printList(result);

        sc.close();
    }
}
public class reverseLinkList {
    

public class Main {

    // Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked list mein node add karna
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Merge two sorted linked lists
    static Node merge(Node list1, Node list2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } 
            else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        // Jo list bach gayi usko attach kar do
        if (list1 != null) {
            tail.next = list1;
        } 
        else {
            tail.next = list2;
        }

        return dummy.next;
    }

    // Print linked list
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First list
        int n = sc.nextInt();

        Node list1 = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list1 = insert(list1, data);
        }

        // Second list
        int m = sc.nextInt();

        Node list2 = null;

        for (int i = 0; i < m; i++) {
            int data = sc.nextInt();
            list2 = insert(list2, data);
        }

        // Merge
        Node result = merge(list1, list2);

        // Print
        printList(result);

        sc.close();
    }
}
    
}

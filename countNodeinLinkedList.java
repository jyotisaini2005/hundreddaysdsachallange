import java.util.Scanner;

public class Main {

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

        for (int i = 1; i < n; i++) {

            data = sc.nextInt();

            Node newNode = new Node(data);

            temp.next = newNode;

            temp = newNode;
        }

        // Counting nodes
        temp = first;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println(count);
    }
}
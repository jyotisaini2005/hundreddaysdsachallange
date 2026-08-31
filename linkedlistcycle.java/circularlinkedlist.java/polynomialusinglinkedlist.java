public class polynomialusinglinkedlist {
 import java.util.Scanner;

class Main {

    static class Node {
        int coefficient;
        int exponent;
        Node next;

        Node(int coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // Add node at end
    static void insert(int coefficient, int exponent) {

        Node newNode = new Node(coefficient, exponent);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print polynomial
    static void display() {

        Node current = head;

        while (current != null) {

            if (current.exponent == 0) {
                System.out.print(current.coefficient);
            } 
            else if (current.exponent == 1) {
                System.out.print(current.coefficient + "x");
            } 
            else {
                System.out.print(current.coefficient + "x^" + current.exponent);
            }

            if (current.next != null) {
                System.out.print(" + ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int coefficient = sc.nextInt();
            int exponent = sc.nextInt();

            insert(coefficient, exponent);
        }

        display();

        sc.close();
    }
}   
}

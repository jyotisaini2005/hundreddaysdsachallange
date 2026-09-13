import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    Queue() {
        front = null;
        rear = null;
    }

    void enqueue(int value) {

        Node newNode = new Node(value);

        if (front == null) {
            front = rear = newNode;
        } 
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {

        if (front == null) {
            System.out.println(-1);
            return;
        }

        System.out.println(front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue q = new Queue();

        for (int i = 0; i < N; i++) {

            String operation = sc.next();

            if (operation.equals("enqueue")) {

                int value = sc.nextInt();
                q.enqueue(value);

            } 
            else if (operation.equals("dequeue")) {

                q.dequeue();
            }
        }
    }
}
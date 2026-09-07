package queeu;
 import java.util.*;

public class circularqueue {
   

class CircularQueue {
    int[] queue;
    int front, rear, size;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // Insert element
    void enqueue(int value) {
        rear = (rear + 1) % size;
        queue[rear] = value;
    }

    // Remove element
    int dequeue() {
        int value = queue[front];
        front = (front + 1) % size;
        return value;
    }

    // Display queue
    void display(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(queue[(front + i) % size] + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        CircularQueue q = new CircularQueue(n);

        // Enqueue elements
        for (int i = 0; i < n; i++) {
            q.enqueue(sc.nextInt());
        }

        int m = sc.nextInt();

        // Dequeue m elements
        for (int i = 0; i < m; i++) {
            q.dequeue();
        }

        // Display remaining elements
        q.display(n - m);
    }
}
}

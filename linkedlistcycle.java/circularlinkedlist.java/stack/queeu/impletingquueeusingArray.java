class Queue {
    int[] arr = new int[5];

    int front = -1;
    int rear = -1;

    void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = x;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front++;

        return value;
    }
}
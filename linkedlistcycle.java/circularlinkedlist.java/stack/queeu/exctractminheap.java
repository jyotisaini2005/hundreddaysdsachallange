 import java.util.*;
public class exctractminheap {


public class Main {

    static int[] heap;
    static int size = 0;

    // Insert element into Min Heap
    static void insert(int x) {
        heap[size] = x;
        int i = size;
        size++;

        // Heapify Up
        while (i > 0) {
            int parent = (i - 1) / 2;

            if (heap[parent] > heap[i]) {
                int temp = heap[parent];
                heap[parent] = heap[i];
                heap[i] = temp;

                i = parent;
            } else {
                break;
            }
        }
    }

    // Return minimum element without removing
    static int peek() {
        if (size == 0) {
            return -1;
        }

        return heap[0];
    }

    // Remove and return minimum element
    static int extractMin() {
        if (size == 0) {
            return -1;
        }

        int min = heap[0];

        // Last element ko root par lao
        heap[0] = heap[size - 1];
        size--;

        // Heapify Down
        int i = 0;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != i) {
                int temp = heap[i];
                heap[i] = heap[smallest];
                heap[smallest] = temp;

                i = smallest;
            } else {
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Maximum N elements ho sakte hain
        heap = new int[N];

        for (int i = 0; i < N; i++) {

            String operation = sc.next();

            if (operation.equals("insert")) {

                int x = sc.nextInt();
                insert(x);

            } else if (operation.equals("peek")) {

                System.out.println(peek());

            } else if (operation.equals("extractMin")) {

                System.out.println(extractMin());
            }
        }

        sc.close();
    }
}   
}

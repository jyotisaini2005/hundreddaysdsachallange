class PriorityQueue {
    int[] data;
    int[] priority;
    int size;

    PriorityQueue(int capacity) {
        data = new int[capacity];
        priority = new int[capacity];
        size = 0;
    }

    void insert(int value, int p) {
        data[size] = value;
        priority[size] = p;
        size++;
    }

    int peek() {
        if (size == 0) {
            return -1;
        }

        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (priority[i] > priority[maxIndex]) {
                maxIndex = i;
            }
        }

        return data[maxIndex];
    }

    int remove() {
        if (size == 0) {
            return -1;
        }

        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (priority[i] > priority[maxIndex]) {
                maxIndex = i;
            }
        }

        int removed = data[maxIndex];

        for (int i = maxIndex; i < size - 1; i++) {
            data[i] = data[i + 1];
            priority[i] = priority[i + 1];
        }

        size--;

        return removed;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
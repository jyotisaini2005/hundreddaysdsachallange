class Solution {

    // Max Heap banane ke liye heapify function
    void heapify(int[] arr, int n, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Agar left child bada hai
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Agar right child bada hai
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Agar largest current node nahi hai
        if (largest != i) {

            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Neeche wale subtree ko bhi heapify karo
            heapify(arr, n, largest);
        }
    }

    public void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract maximum one by one
        for (int i = n - 1; i > 0; i--) {

            // Root (maximum) ko end mein bhejo
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Remaining heap ko heapify karo
            heapify(arr, i, 0);
        }
    }
}
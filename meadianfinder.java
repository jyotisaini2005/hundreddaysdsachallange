import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {

        // Number ko maxHeap mein daalo
        maxHeap.add(num);

        // MaxHeap ka largest element minHeap mein bhejo
        minHeap.add(maxHeap.poll());

        // Dono heaps ko balance karo
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {

        // Odd number of elements
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        // Even number of elements
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
```java
import java.util.*;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // Insert from rear
        deque.addLast(10);
        deque.addLast(20);

        // Insert from front
        deque.addFirst(5);

        // Insert from rear
        deque.addLast(30);

        System.out.println("Deque: " + deque);

        // Front element
        System.out.println("Front: " + deque.peekFirst());

        // Rear element
        System.out.println("Rear: " + deque.peekLast());

        // Delete from front
        deque.removeFirst();
        System.out.println("After pop_front: " + deque);

        // Delete from rear
        deque.removeLast();
        System.out.println("After pop_back: " + deque);

        // Size
        System.out.println("Size: " + deque.size());

        // Check empty
        System.out.println("Is Empty: " + deque.isEmpty());
    }
}
```

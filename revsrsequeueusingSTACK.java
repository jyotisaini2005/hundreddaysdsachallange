import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int N = sc.nextInt();

        // Queue
        Queue<Integer> queue = new LinkedList<>();

        // Stack
        Stack<Integer> stack = new Stack<>();

        // Queue mein elements add karo
        for (int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }

        // Queue se Stack mein elements daalo
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Stack se Queue mein elements wapas daalo
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Reversed Queue print karo
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        sc.close();
    }
}
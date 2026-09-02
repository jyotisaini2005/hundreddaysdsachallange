import java.util.*;

public class pushandpopopertion {

    class stack {
        int[] arr = new int[5];
        int top = -1;

        void push(int value) {
            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            top++;
            arr[top] = value;
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return;
            }

            top--;
        }

        void display() {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        stack s = new pushandpopopertion().new stack();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            s.push(value);
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            s.pop();
        }

        s.display();
    }
}
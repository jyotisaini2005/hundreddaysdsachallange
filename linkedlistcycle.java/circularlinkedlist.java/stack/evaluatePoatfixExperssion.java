import java.util.*;

public class Main {

    // Linked List Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack using Linked List
    static class Stack {
        Node top = null;

        // PUSH
        void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        // POP
        int pop() {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression:");
        String expression = sc.nextLine();

        String[] tokens = expression.split(" ");

        Stack stack = new Stack();

        for (String token : tokens) {

            // Number → PUSH
            if (token.matches("-?\\d+")) {

                stack.push(Integer.parseInt(token));

            } 
            // Operator → POP POP Calculate PUSH
            else {

                int b = stack.pop();
                int a = stack.pop();

                int result;

                if (token.equals("+")) {
                    result = a + b;
                }
                else if (token.equals("-")) {
                    result = a - b;
                }
                else if (token.equals("*")) {
                    result = a * b;
                }
                else {
                    result = a / b;
                }

                stack.push(result);
            }
        }

        System.out.println("Result = " + stack.pop());
    }
}
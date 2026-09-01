public class ImplementingStackUsingArray {

    int[] arr = new int[5];
    int top = -1;

    // Push operation
    void push(int value)
    {
        if(top == arr.length - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = value;
    }

    // Pop operation
    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        int value = arr[top];
        top--;

        System.out.println("Popped: " + value);
    }

    // Peek operation
    void peek()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    // Main method
    public static void main(String[] args)
    {
        ImplementingStackUsingArray stack = new ImplementingStackUsingArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();

        stack.peek();
    }
}
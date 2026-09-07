import java.util.*;

public class InfixToPostfix {

    static int precedence(char ch) {

        if (ch == '+' || ch == '-') {
            return 1;
        }

        if (ch == '*' || ch == '/') {
            return 2;
        }

        return 0;
    }

    static String infixToPostfix(String exp) {

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result = result + ch;
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result = result + stack.pop();
                }

                stack.pop();   // remove '('
            }

            // Operator
            else {

                while (!stack.isEmpty() &&
                       precedence(stack.peek()) >= precedence(ch)) {

                    result = result + stack.pop();
                }

                stack.push(ch);
            }
        }

        // Empty the stack
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();

        System.out.println("Postfix expression: " + infixToPostfix(exp));
    }
}
package stack;

public class validPalindrome {
    import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            // Opening bracket
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing bracket
            else {

                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if((ch == ')' && top != '(') ||
                   (ch == ']' && top != '[') ||
                   (ch == '}' && top != '{')) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
}

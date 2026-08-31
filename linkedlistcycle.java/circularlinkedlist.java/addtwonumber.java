import java.util.Stack;

public class addtwonumber {
    class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Store first linked list in stack
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        // Store second linked list in stack
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;

        // Add digits from right to left
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!s1.isEmpty()) {
                sum += s1.pop();
            }

            if (!s2.isEmpty()) {
                sum += s2.pop();
            }

            int digit = sum % 10;
            carry = sum / 10;

            // Insert new node at the beginning
            ListNode newNode = new ListNode(digit);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }
}
}

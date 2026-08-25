public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Remove matching nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {

            if (current.val == val) {
                previous.next = current.next;
                current = current.next;
            }
            else {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }
} 

public class removeloopinlinkedlist {
class Solution {
    public static void removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        // 1. Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        // No loop
        if (slow != fast)
            return;

        // 2. Find loop starting point
        slow = head;

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // 3. Remove loop
        fast.next = null;
    }
}    
}

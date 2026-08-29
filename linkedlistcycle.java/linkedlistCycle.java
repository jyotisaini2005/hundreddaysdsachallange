package linkedlistcycle.java;

public class linkedlistCycle {
    
    public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect whether a cycle exists
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {

                // Step 2: Find the starting node of the cycle
                ListNode entry = head;

                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }

                return entry;
            }
        }

        // No cycle
        return null;
    }
}
}

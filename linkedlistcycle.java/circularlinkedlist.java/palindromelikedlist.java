package circularlinkedlist.java;

public class palindromelikedlist {
 class Solution {
    public boolean isPalindrome(ListNode head) {

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. Compare first half and reversed second half
        ListNode p1 = head;
        ListNode p2 = prev;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}   
}

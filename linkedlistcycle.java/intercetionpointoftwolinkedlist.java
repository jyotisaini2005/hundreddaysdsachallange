class Solution {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int length(Node head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    Node getIntersection(Node head1, Node head2) {

        int len1 = length(head1);
        int len2 = length(head2);

        // Make both lists equal in length
        if (len1 > len2) {
            int diff = len1 - len2;

            while (diff > 0) {
                head1 = head1.next;
                diff--;
            }
        } 
        else {
            int diff = len2 - len1;

            while (diff > 0) {
                head2 = head2.next;
                diff--;
            }
        }

        // Move both pointers together
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1;
    }
}
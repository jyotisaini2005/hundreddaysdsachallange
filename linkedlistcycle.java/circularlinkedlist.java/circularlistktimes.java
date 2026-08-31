static Node rotateRight(Node head, int k) {

    if (head == null || head.next == null || k == 0)
        return head;

    // Find length and last node
    int n = 1;
    Node tail = head;

    while (tail.next != null) {
        tail = tail.next;
        n++;
    }

    // Reduce k
    k = k % n;

    if (k == 0)
        return head;

    // Make circular
    tail.next = head;

    // Find (n-k)th node
    Node current = head;

    for (int i = 1; i < n - k; i++) {
        current = current.next;
    }

    // New head
    Node newHead = current.next;

    // Break circular list
    current.next = null;

    return newHead;
}
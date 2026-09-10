/*
    Given the head of a singly linked list, delete the head of the linked list 
    and return the head of the modified list. The head is the first node of 
    the linked list.
    Note : Please note that this section might seem a bit difficult without 
    prior knowledge on what linkedList is.

    Example 1
    Input: linkedList = [1, 2, 3]
    Output: [2, 3]
    Explanation:
    The first node was removed.

    Example 2
    Input: linkedList = [1]
    Output: []
    Explanation:
    Note that the head of the linked list gets changed.
*/

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class DeletionAtHead {
    public ListNode deleteAtHead(ListNode head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    public static void main(String[] args) {
        DeletionAtHead solution = new DeletionAtHead();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode modifiedHead = solution.deleteAtHead(head);

        // Print the modified linked list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

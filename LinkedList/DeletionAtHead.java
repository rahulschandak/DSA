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

class ListNode1 {
    public int data;
    public ListNode1 next;
    ListNode1() { data = 0; next = null; }
    ListNode1(int x) { data = x; next = null; }
    ListNode1(int x, ListNode1 next) { data = x; this.next = next; }
}

public class DeletionAtHead {
    public ListNode1 deleteAtHead(ListNode1 head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    public static void main(String[] args) {
        DeletionAtHead solution = new DeletionAtHead();
        ListNode1 head = new ListNode1(1, new ListNode1(2, new ListNode1(3)));
        ListNode1 modifiedHead = solution.deleteAtHead(head);

        // Print the modified linked list
        ListNode1 current = modifiedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

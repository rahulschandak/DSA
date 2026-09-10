/*
    Given the head of a singly linked list and an integer X, insert a node with 
    value X at the head of the linked list and return the head of the modified list.

    Example 1
    Input: linkedList = [1, 2, 3], X = 7
    Output: [7, 1, 2, 3]
    Explanation:
    7 was added as the 1st node.

    Example 2
    Input: linkedList = [], X = 7
    Output: [7]
    Explanation:
    7 was added as the 1st node.
*/


// Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class InsertAtHead {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode result = new ListNode(X, head);
        return result;
    }

    public static void main(String[] args) {
        InsertAtHead solution = new InsertAtHead();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        int X = 7;
        ListNode modifiedHead = solution.insertAtHead(head, X);
        
        // Print the modified linked list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
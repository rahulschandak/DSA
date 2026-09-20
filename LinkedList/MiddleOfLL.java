/*
Given the head of a singly Linked List, return the middle node of the Linked List.
If the Linked List has an even number of nodes, return the second middle one.

Example 1
Input: head -> 3 -> 8 -> 7 -> 1 -> 3
Output(value at returned node): 7
Explanation: There are 5 nodes, so the middle node is the 3rd Node, with value 7.

Example 2
Input: head -> 2 -> 9 -> 1 -> 4 -> 0 -> 4
Output(value at returned node): 4
Explanation: There are 6 nodes, thus both the 3rd and 4th nodes are middle. So the 
2nd middle node (4th Node) is returned with value 4.

*/

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
        val = 0;
        next = null;
    }

    ListNode2(int data1) {
        val = data1;
        next = null;
    }

    ListNode2(int data1, ListNode2 next1) {
        val = data1;
        next = next1;
    }
}

public class MiddleOfLL {

    public ListNode2 middleOfLinkedList(ListNode2 head) {
        if (head == null) {
            return null;
        }
        ListNode2 slow = head;
        ListNode2 fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast.next != null ? slow.next : slow;
    }

    public static void main(String[] args) {
        MiddleOfLL solution = new MiddleOfLL();
        ListNode2 head = new ListNode2(3, new ListNode2(8, new ListNode2(7, new ListNode2(1, new ListNode2(3)))));
        ListNode2 middle = solution.middleOfLinkedList(head);
        System.out.println("Middle node value: " + middle.val);
    }
}
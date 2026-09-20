/*
Given the head of a singly linked list. Reverse the given linked list and return the 
head of the modified list.

Example 1
Input: head -> 1 -> 2 -> 3 -> 4 -> 5
Output: head -> 5 -> 4 -> 3 -> 2 -> 1
Explanation: All the links are reversed and the head now points to the last node of 
the original list.

Example 2
Input: head -> 6 -> 8
Output: head -> 8 -> 6
Explanation: All the links are reversed and the head now points to the last node of 
the original list.
This can be seen like: 6 <- 8 <- head.
*/

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3() {
        val = 0;
        next = null;
    }

    ListNode3(int data) {
        val = data;
        next = null;
    }

    ListNode3(int data, ListNode3 next) {
        val = data;
        this.next = next;
    }
}

public class ReverseLL {
    public ListNode3 reverseList(ListNode3 head) {
        ListNode3 prev = null;
        ListNode3 curr = head;

        while (curr != null) {
            ListNode3 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
 
        return prev;
    }

    public static void main(String[] args) {
        ReverseLL solution = new ReverseLL();
        ListNode3 head = new ListNode3(1, new ListNode3(2, new ListNode3(3, new ListNode3(4, new ListNode3(5)))));
        ListNode3 reversedHead = solution.reverseList(head);

        // Print the reversed linked list
        ListNode3 current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

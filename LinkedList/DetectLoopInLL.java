/*
Given the head of a singly linked list. Return true if a loop exists in the linked list 
or return false.

A loop exists in a linked list if some node in the list can be reached again by 
continuously following the next pointer.

Solve it here - https://takeuforward.org/plus/dsa/problems/detect-a-loop-in-ll?source=strivers-a2z-dsa-track

*/


class DetectLoopInLL {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
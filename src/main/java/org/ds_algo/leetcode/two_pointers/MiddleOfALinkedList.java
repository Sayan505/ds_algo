package org.ds_algo.leetcode.two_pointers;


import org.ds_algo.leetcode.ListNode;

class MiddleOfALinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;          // 1x
            fast = fast.next.next;     // 2x
        }

        return slow;    // 1x is 50% through
    }
}

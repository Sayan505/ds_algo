package org.ds_algo.leetcode.two_pointers;


import org.ds_algo.leetcode.ListNode;

public class RemoveNthNodeFromEndOfLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) return null;

        // insert a node before head
        ListNode genesis = new ListNode(0, head);

        // two ptrs
        ListNode fast = genesis;
        ListNode slow = genesis;

        // fwd n times
        while(n-- > 0) {
            fast = fast.next;
        }

        // calc nth node from end
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // del node
        slow.next = slow.next.next;

        return genesis.next;
    }
}

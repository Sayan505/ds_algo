package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import org.ds_algo.leetcode.ListNode;

public class RemoveNthNodeFromEndOfLLTest {
    RemoveNthNodeFromEndOfLL removeNthNodeFromEndOfLL;

    @BeforeEach
    void init() {
        removeNthNodeFromEndOfLL = new RemoveNthNodeFromEndOfLL();

        craftInput(2);
    }

    int n;
    ListNode head;
    void craftInput(int nth) {
        n = nth;

        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    }

    @Test
    void Test() {
        ListNode expectedHead = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, null))));
        ListNode actualHead = removeNthNodeFromEndOfLL.removeNthFromEnd(head, n);

        // compare node-by-node
        while(expectedHead != null && actualHead != null) {
            Assertions.assertEquals(expectedHead.val, actualHead.val);

            expectedHead = expectedHead.next;
            actualHead   = actualHead.next;
        }

        // both lists must point to the end to ensure equivalence
        Assertions.assertNull(expectedHead);
        Assertions.assertNull(actualHead);
    }
}

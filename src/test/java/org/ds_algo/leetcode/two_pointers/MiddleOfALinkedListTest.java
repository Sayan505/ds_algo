package org.ds_algo.leetcode.two_pointers;

import org.ds_algo.leetcode.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiddleOfALinkedListTest {
    MiddleOfALinkedList middleOfALinkedList;

    @BeforeEach
    void init() {
        middleOfALinkedList = new MiddleOfALinkedList();

        craftInput();
    }

    ListNode head;
    void craftInput() {
        // input linked-list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));
    }

    @Test
    void Test() {
        ListNode expectedHead = new ListNode(4, new ListNode(5, new ListNode(6, null)));
        ListNode actualHead = middleOfALinkedList.middleNode(head);

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

package org.ds_algo.leetcode.linked_list;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

class MergeNodesInBetweenZerosTest {
    MergeNodesInBetweenZeros mergeNodesInBetweenZeros;

    @BeforeEach
    void init() {
        mergeNodesInBetweenZeros = new MergeNodesInBetweenZeros();

        craftInput();
    }

    ListNode head;
    void craftInput() {
        // input linked-list: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0 -> null
        head = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0,
                new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0, null))))))));
    }

    @Test
    void test() {
        ListNode actualHead   = mergeNodesInBetweenZeros.mergeNodes(head);                // actual
        ListNode expectedHead = new ListNode(4, new ListNode(11, null));    // expected: 4 -> 11 -> null

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

package org.ds_algo.leetcode.linked_list;


class MergeNodesInBetweenZeros {
    ListNode mergeNodes(ListNode head) {
        ListNode preNewHead = head;
        ListNode insertPtr = preNewHead;

        int currSum = 0;

        while(head != null) {
            if(head.val == 0) {
                insertPtr.val = currSum;
                currSum = 0;

                if(head.next == null) {
                    insertPtr.next = null;  // terminate if last 0
                }

                insertPtr = insertPtr.next;
            }

            currSum += head.val;

            head = head.next;
        }

        return preNewHead.next;
    }
}

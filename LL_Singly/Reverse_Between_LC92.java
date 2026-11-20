package LL_Singly;

public class Reverse_Between_LC92 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode before = dummy;
        for (int i = 1; i < left; i++) {
            before = before.next;
        }
        ListNode previous = before;
        ListNode current = before.next;
        for (int i = left; i <= right; i++) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        ListNode firstReversed = before.next;
        before.next = previous;
        firstReversed.next = current;
        return dummy.next;
    }
}

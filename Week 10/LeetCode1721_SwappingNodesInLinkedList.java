public class LeetCode1721_SwappingNodesInLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;

        for (int i = 1; i < k; i++) first = first.next;

        ListNode second = head;
        ListNode current = first.next;

        while (current != null) {
            current = current.next;
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}

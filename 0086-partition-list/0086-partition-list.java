/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0);
        ListNode smallCurr = smallHead;
        ListNode largeHead = new ListNode(0);
        ListNode largeCurr = largeHead;

        while(head != null){
            if(head.val >= x){
                largeCurr.next = head;
                largeCurr = largeCurr.next;
            }else{
                smallCurr.next = head;
                smallCurr = smallCurr.next;
            }
            head = head.next;
        }
        largeCurr.next = null;
        smallCurr.next = largeHead.next;
        return smallHead.next;
        
    }
}
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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];
            while(temp != null){
                pq.offer(temp.val);
                temp = temp.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(!pq.isEmpty()){
            ListNode newNode = new ListNode(pq.poll());
            temp.next = newNode;
            temp = temp.next;
        }

        return dummy.next;


        // PriorityQueue<ListNode> pq = new PriorityQueue<>(
        //     (a, b) -> Integer.compare(a.val, b.val)
        // );

        // for(ListNode node : lists){
        //     if(node != null) pq.offer(node);
        // }

        // ListNode dummy = new ListNode(-1);
        // ListNode tail = dummy;

        // while(!pq.isEmpty()){
        //     ListNode s = pq.poll();
        //     tail.next = s;
        //     tail = tail.next;
        //     if(s.next != null) pq.offer(s.next);
        // }

        // return dummy.next;

    }
}
package LL_Singly;

import java.util.HashMap;
import java.util.Map;

public class Copy_List_with_Random_Pointer_LC138 {
    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> copies = new HashMap<>();
        for (Node current = head; current != null; current = current.next) {
            copies.put(current, new Node(current.val));
        }
        for (Node current = head; current != null; current = current.next) {
            Node copy = copies.get(current);
            copy.next = copies.get(current.next);
            copy.random = copies.get(current.random);
        }
        return copies.get(head);
    }
}

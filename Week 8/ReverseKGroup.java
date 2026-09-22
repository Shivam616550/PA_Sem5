public class ReverseKGroup {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverseKGroup(Node head, int k) {
        Node current = head;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count < k) return head;

        Node prev = null;
        current = head;

        for (int i = 0; i < k; i++) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = reverseKGroup(current, k);
        return prev;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node p = head;

        for (int i = 2; i <= 6; i++) {
            p.next = new Node(i);
            p = p.next;
        }

        print(reverseKGroup(head, 2));
    }
}

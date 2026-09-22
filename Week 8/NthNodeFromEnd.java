public class NthNodeFromEnd {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node find(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(find(head, 2).data);
    }
}

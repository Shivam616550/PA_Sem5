public class CircularLinkedListOperations {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertEnd(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            node.next = node;
            return node;
        }

        Node current = head;
        while (current.next != head) current = current.next;

        current.next = node;
        node.next = head;
        return head;
    }

    static int count(Node head) {
        if (head == null) return 0;

        int count = 0;
        Node current = head;

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    static boolean search(Node head, int target) {
        if (head == null) return false;

        Node current = head;

        do {
            if (current.data == target) return true;
            current = current.next;
        } while (current != head);

        return false;
    }

    static Node insertBeginning(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            node.next = node;
            return node;
        }

        Node current = head;
        while (current.next != head) current = current.next;

        current.next = node;
        node.next = head;
        return node;
    }

    static Node delete(Node head, int value) {
        if (head == null) return null;

        Node current = head;
        Node prev = null;

        do {
            if (current.data == value) {
                if (current == head) {
                    if (head.next == head) return null;

                    Node last = head;
                    while (last.next != head) last = last.next;

                    head = head.next;
                    last.next = head;
                    return head;
                }

                prev.next = current.next;
                return head;
            }

            prev = current;
            current = current.next;
        } while (current != head);

        return head;
    }

    static Node reverse(Node head) {
        if (head == null || head.next == head) return head;

        Node prev = null;
        Node current = head;
        Node next;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;

        Node newHead = prev;
        while (newHead.next != null) newHead = newHead.next;
        newHead.next = prev;

        return prev;
    }

    static Node middle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static int max(Node head) {
        if (head == null) return Integer.MIN_VALUE;

        int max = head.data;
        Node current = head.next;

        while (current != head) {
            max = Math.max(max, current.data);
            current = current.next;
        }

        return max;
    }

    static int josephus(int n, int k) {
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }

        return result + 1;
    }

    static void print(Node head) {
        if (head == null) return;

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);

        print(head);
        System.out.println("Count: " + count(head));
        System.out.println("Search 30: " + search(head, 30));
        System.out.println("Middle: " + middle(head).data);
        System.out.println("Maximum: " + max(head));
        System.out.println("Josephus: " + josephus(7, 3));

        head = insertBeginning(head, 5);
        head = delete(head, 20);
        print(head);
    }
}

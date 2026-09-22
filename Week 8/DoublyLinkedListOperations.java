public class DoublyLinkedListOperations {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) return newNode;

        Node current = head;
        while (current.next != null) current = current.next;

        current.next = newNode;
        newNode.prev = current;
        return head;
    }

    static Node insertAfter(Node head, int key, int data) {
        Node current = head;

        while (current != null && current.data != key) current = current.next;
        if (current == null) return head;

        Node newNode = new Node(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) current.next.prev = newNode;
        current.next = newNode;

        return head;
    }

    static Node deleteAll(Node head, int value) {
        Node current = head;

        while (current != null) {
            Node next = current.next;

            if (current.data == value) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;

                if (current.next != null) current.next.prev = current.prev;
            }

            current = next;
        }

        return head;
    }

    static Node reverse(Node head) {
        Node current = head;
        Node newHead = null;

        while (current != null) {
            Node next = current.next;
            current.next = current.prev;
            current.prev = next;
            newHead = current;
            current = next;
        }

        return newHead;
    }

    static int secondLargest(Node head) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        while (head != null) {
            if (head.data > largest) {
                second = largest;
                largest = head.data;
            } else if (head.data > second && head.data != largest) {
                second = head.data;
            }
            head = head.next;
        }

        return second;
    }

    static boolean isPalindrome(Node head) {
        if (head == null) return true;

        Node left = head;
        Node right = head;

        while (right.next != null) right = right.next;

        while (left != right && left.prev != right) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.prev;
        }

        return left.data == right.data;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertEnd(head, 1);
        head = insertEnd(head, 2);
        head = insertEnd(head, 2);
        head = insertEnd(head, 3);

        head = insertAfter(head, 2, 5);
        print(head);

        head = deleteAll(head, 2);
        print(head);

        System.out.println(secondLargest(head));
        System.out.println(isPalindrome(head));

        head = reverse(head);
        print(head);
    }
}

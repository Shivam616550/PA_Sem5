package Tree;

public class Binary_Tree_Validation {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static boolean isBalanced(Node root) {
        return check(root) != -1;
    }

    private static int check(Node root) {
        if (root == null) return 0;
        int left = check(root.left);
        if (left == -1) return -1;
        int right = check(root.right);
        if (right == -1 || Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(isBalanced(root));
    }
}

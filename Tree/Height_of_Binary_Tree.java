package Tree;

public class Height_of_Binary_Tree {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(3);
        System.out.println(height(root));
    }
}

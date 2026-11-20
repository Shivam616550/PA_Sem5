package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Complete_Binary_Tree_Verification {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static boolean isComplete(Node root) {
        if (root == null) return true;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean missing = false;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left == null) {
                missing = true;
            } else {
                if (missing) return false;
                queue.offer(node.left);
            }
            if (node.right == null) {
                missing = true;
            } else {
                if (missing) return false;
                queue.offer(node.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(isComplete(root));
    }
}

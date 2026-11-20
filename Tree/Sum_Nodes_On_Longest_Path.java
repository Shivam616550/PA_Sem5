package Tree;

public class Sum_Nodes_On_Longest_Path {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static int sumOfLongRootToLeafPath(Node root) {
        int[] answer = {0, 0};
        visit(root, 1, 0, answer);
        return answer[1];
    }

    private static void visit(Node root, int depth, int sum, int[] answer) {
        if (root == null) return;
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (depth > answer[0] || depth == answer[0] && sum > answer[1]) {
                answer[0] = depth;
                answer[1] = sum;
            }
            return;
        }
        visit(root.left, depth + 1, sum, answer);
        visit(root.right, depth + 1, sum, answer);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println(sumOfLongRootToLeafPath(root));
    }
}

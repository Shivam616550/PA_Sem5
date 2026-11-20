import java.util.*;

public class combinations_leetcode {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), ans);
        return ans;
    }

    private static void backtrack(int start, int n, int k,
                                  List<Integer> current,
                                  List<List<Integer>> ans) {
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(i + 1, n, k, current, ans);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}
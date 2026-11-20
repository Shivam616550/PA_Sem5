package backTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations_LC46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutations(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private static void findPermutations(int[] nums, boolean[] used,
                                        List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            findPermutations(nums, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}

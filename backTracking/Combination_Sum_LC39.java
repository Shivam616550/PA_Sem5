package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_LC39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinations(int[] candidates, int target, int start,
                                         List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            current.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}

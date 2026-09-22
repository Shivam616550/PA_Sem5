import java.util.ArrayList;
import java.util.List;

public class IndexNegationDuplicatesDisappeared {
    static void find(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> disappeared = new ArrayList<>();

        for (int x : nums) {
            int index = Math.abs(x) - 1;

            if (nums[index] < 0) {
                duplicates.add(Math.abs(x));
            } else {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappeared.add(i + 1);
            }
        }

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Disappeared: " + disappeared);
    }

    public static void main(String[] args) {
        find(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }
}

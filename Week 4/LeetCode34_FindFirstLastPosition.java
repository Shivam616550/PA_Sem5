import java.util.Arrays;

public class LeetCode34_FindFirstLastPosition {
    static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return ans;
    }

    static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return ans;
    }

    static int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}

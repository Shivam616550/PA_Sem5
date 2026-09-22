public class CountValidSubarraysSumLimit {
    static long count(int[] nums, int limit) {
        int left = 0;
        long sum = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > limit && left <= right) {
                sum -= nums[left++];
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3}, 5));
    }
}

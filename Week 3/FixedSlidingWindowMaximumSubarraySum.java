public class FixedSlidingWindowMaximumSubarraySum {
    static int maxSum(int[] arr, int k) {
        if (k <= 0 || k > arr.length) return 0;

        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20}, 4));
    }
}

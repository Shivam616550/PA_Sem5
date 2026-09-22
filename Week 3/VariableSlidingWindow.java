public class VariableSlidingWindow {
    static int longestSubarray(int[] arr, int limit) {
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > limit && left <= right) {
                sum -= arr[left++];
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{2, 1, 5, 1, 3, 2}, 7));
    }
}

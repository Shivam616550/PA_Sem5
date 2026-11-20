import java.util.*;

public class prefix_sum {

    public static int[] buildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        if (arr.length == 0) return prefix;

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // Sum from index left to right, inclusive.
    public static int rangeSum(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int[] prefix = buildPrefixSum(arr);

        System.out.println(Arrays.toString(prefix));
        System.out.println(rangeSum(prefix, 1, 3)); // 18
    }
}
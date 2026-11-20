public class Number_of_array_less_than_K {
    // Counts elements strictly less than k.
    public static int countLessThanK(int[] arr, int k) {
        int count = 0;

        for (int x : arr) {
            if (x < k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3};
        System.out.println(countLessThanK(arr, 5)); // 3
    }
}
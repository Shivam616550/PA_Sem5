import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989_AddToArrayForm {
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {
            if (i >= 0) carry += num[i--];
            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }
}

import java.util.Arrays;

public class LeetCode2418_SortThePeople {
    static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[max]) max = j;
            }

            int h = heights[i];
            heights[i] = heights[max];
            heights[max] = h;

            String s = names[i];
            names[i] = names[max];
            names[max] = s;
        }

        return names;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            sortPeople(
                new String[]{"Mary", "John", "Emma"},
                new int[]{180, 165, 170}
            )
        ));
    }
}

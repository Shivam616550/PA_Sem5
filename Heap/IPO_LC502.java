package Heap;

import java.util.PriorityQueue;

public class IPO_LC502 {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] projects = new int[profits.length][2];
        for (int i = 0; i < profits.length; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        java.util.Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> available = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        int index = 0;
        for (int chosen = 0; chosen < k; chosen++) {
            while (index < projects.length && projects[index][0] <= w) {
                available.offer(projects[index++][1]);
            }
            if (available.isEmpty()) break;
            w += available.poll();
        }
        return w;
    }

    public static void main(String[] args) {
        System.out.println(findMaximizedCapital(2, 0,
                new int[]{1, 2, 3}, new int[]{0, 1, 1}));
    }
}

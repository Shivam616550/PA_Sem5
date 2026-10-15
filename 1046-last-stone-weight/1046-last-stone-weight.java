class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) pq.add(i);

        while (!pq.isEmpty()) {
            if (pq.size() == 1) return pq.poll();
            else {
                int x = pq.poll();
                int y = pq.poll();
                if (x != y) {
                    pq.add(x - y);
                }
            }
        }
        return 0;
    }
}
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // Queue<Integer> queue = new LinkedList<>();
        // Arrays.sort(hand);
		for(int i : hand) queue.offer(i);

		while (!queue.isEmpty()){
			int firstElement = queue.poll();
			for(int i = 1; i < groupSize; i++) {
				if (!queue.remove(firstElement + i)) return false;
			}
		}
		return true;
    }
}
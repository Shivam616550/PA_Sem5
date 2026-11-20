import java.util.PriorityQueue;

public class Priority_Queue_Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);
        System.out.println("Min: " + minHeap.peek());

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        maxHeap.offer(40);
        maxHeap.offer(10);
        maxHeap.offer(30);
        System.out.println("Max: " + maxHeap.peek());

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
}

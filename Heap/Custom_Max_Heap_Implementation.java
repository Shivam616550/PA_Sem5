package Heap;

import java.util.ArrayList;
import java.util.List;

public class Custom_Max_Heap_Implementation {
    static class MaxHeap {
        private final List<Integer> values = new ArrayList<>();

        public void add(int value) {
            values.add(value);
            siftUp(values.size() - 1);
        }

        public int peek() {
            if (values.isEmpty()) throw new IllegalStateException("Heap is empty");
            return values.get(0);
        }

        public int removeMax() {
            if (values.isEmpty()) throw new IllegalStateException("Heap is empty");
            int max = values.get(0);
            int last = values.remove(values.size() - 1);
            if (!values.isEmpty()) {
                values.set(0, last);
                siftDown(0);
            }
            return max;
        }

        public boolean isEmpty() {
            return values.isEmpty();
        }

        private void siftUp(int index) {
            while (index > 0) {
                int parent = (index - 1) / 2;
                if (values.get(parent) >= values.get(index)) break;
                swap(parent, index);
                index = parent;
            }
        }

        private void siftDown(int index) {
            while (true) {
                int largest = index;
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                if (left < values.size() && values.get(left) > values.get(largest)) largest = left;
                if (right < values.size() && values.get(right) > values.get(largest)) largest = right;
                if (largest == index) return;
                swap(index, largest);
                index = largest;
            }
        }

        private void swap(int first, int second) {
            int temp = values.get(first);
            values.set(first, values.get(second));
            values.set(second, temp);
        }
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.add(3);
        heap.add(10);
        heap.add(5);
        System.out.println(heap.removeMax());
        System.out.println(heap.peek());
    }
}

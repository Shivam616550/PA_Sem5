import java.util.ArrayDeque;
import java.util.Queue;

public class Implement_Stack_using_Queues_LC225 {
    static class MyStack {
        private final Queue<Integer> queue = new ArrayDeque<>();

        public void push(int x) {
            queue.offer(x);
            int size = queue.size();
            for (int i = 1; i < size; i++) {
                queue.offer(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}

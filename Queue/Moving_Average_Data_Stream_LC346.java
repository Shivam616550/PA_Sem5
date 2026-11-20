import java.util.ArrayDeque;
import java.util.Queue;

public class Moving_Average_Data_Stream_LC346 {
    static class MovingAverage {
        private final Queue<Integer> values = new ArrayDeque<>();
        private final int size;
        private double sum;

        public MovingAverage(int size) {
            this.size = size;
        }

        public double next(int val) {
            values.offer(val);
            sum += val;
            if (values.size() > size) {
                sum -= values.poll();
            }
            return sum / values.size();
        }
    }

    public static void main(String[] args) {
        MovingAverage average = new MovingAverage(3);
        System.out.println(average.next(1));
        System.out.println(average.next(10));
        System.out.println(average.next(3));
        System.out.println(average.next(5));
    }
}

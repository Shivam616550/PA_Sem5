import java.util.ArrayDeque;
import java.util.Queue;

public class Running_Average {
    private final Queue<Double> values = new ArrayDeque<>();
    private double sum;

    public void add(double value) {
        values.offer(value);
        sum += value;
    }

    public double getAverage() {
        return values.isEmpty() ? 0 : sum / values.size();
    }

    public static void main(String[] args) {
        Running_Average average = new Running_Average();
        average.add(10);
        average.add(20);
        average.add(30);
        System.out.println(average.getAverage());
    }
}

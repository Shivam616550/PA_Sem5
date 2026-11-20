import java.util.PriorityQueue;

public class Hospital_Management_Priority_Queue {
    static class Patient implements Comparable<Patient> {
        String name;
        int priority;

        Patient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Patient other) {
            return Integer.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return name + " (priority " + priority + ")";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>();
        emergencyQueue.offer(new Patient("Rahul", 3));
        emergencyQueue.offer(new Patient("Aman", 1));
        emergencyQueue.offer(new Patient("Neha", 2));

        while (!emergencyQueue.isEmpty()) {
            System.out.println(emergencyQueue.poll());
        }
    }
}

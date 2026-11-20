import java.util.ArrayDeque;
import java.util.Queue;

public class Question1_ServiceDeskQueue {
    private final Queue<Integer> tickets = new ArrayDeque<>();

    public void add(int ticket) {
        tickets.offer(ticket);
    }

    public Integer serve() {
        return tickets.poll();
    }

    public boolean cancel(int ticket) {
        if (!tickets.contains(ticket)) {
            return false;
        }
        tickets.remove(ticket);
        return true;
    }

    public static void main(String[] args) {
        Question1_ServiceDeskQueue desk = new Question1_ServiceDeskQueue();
        desk.add(101);
        desk.add(102);
        desk.add(103);
        desk.cancel(102);
        System.out.println(desk.serve());
        System.out.println(desk.serve());
    }
}

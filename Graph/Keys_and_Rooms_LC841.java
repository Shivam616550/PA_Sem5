package Graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Keys_and_Rooms_LC841 {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null || rooms.isEmpty()) return true;
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        visited[0] = true;
        int count = 0;
        while (!queue.isEmpty()) {
            int room = queue.poll();
            count++;
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                }
            }
        }
        return count == rooms.size();
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = List.of(
                List.of(1), List.of(2), List.of(3), List.of());
        System.out.println(canVisitAllRooms(rooms));
    }
}

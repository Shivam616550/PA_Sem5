import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2_Senate_LC649 {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        int turn = senate.length();
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
                radiant.offer(r + turn);
            } else {
                dire.offer(d + turn);
            }
            turn++;
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD"));
        System.out.println(predictPartyVictory("RDD"));
    }
}

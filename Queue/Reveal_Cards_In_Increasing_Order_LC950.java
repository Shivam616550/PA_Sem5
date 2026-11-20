import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Reveal_Cards_In_Increasing_Order_LC950 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> positions = new ArrayDeque<>();
        for (int i = 0; i < deck.length; i++) {
            positions.offer(i);
        }
        int[] result = new int[deck.length];
        for (int card : deck) {
            int position = positions.poll();
            result[position] = card;
            if (!positions.isEmpty()) {
                positions.offer(positions.poll());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7})));
    }
}

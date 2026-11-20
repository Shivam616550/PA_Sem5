import java.util.ArrayDeque;
import java.util.Deque;

public class Question4_DequePalindrome {
    public static boolean isPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        String normalized = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (char ch : normalized.toCharArray()) {
            deque.offerLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man a plan a canal Panama"));
        System.out.println(isPalindrome("hello"));
    }
}

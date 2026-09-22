public class SubstringsVsSubsequences {
    static void printSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    static void printSubsequences(String s, int index, String current) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        printSubsequences(s, index + 1, current);
        printSubsequences(s, index + 1, current + s.charAt(index));
    }

    public static void main(String[] args) {
        System.out.println("Substrings:");
        printSubstrings("abc");

        System.out.println("Subsequences:");
        printSubsequences("abc", 0, "");
    }
}

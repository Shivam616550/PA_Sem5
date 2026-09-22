public class HeadTailRecursion {
    static void headRecursion(int n) {
        if (n == 0) return;
        headRecursion(n - 1);
        System.out.print(n + " ");
    }

    static void tailRecursion(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        tailRecursion(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Head recursion:");
        headRecursion(5);

        System.out.println("\nTail recursion:");
        tailRecursion(5);
    }
}

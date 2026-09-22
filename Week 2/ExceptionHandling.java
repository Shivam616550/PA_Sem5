public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);

            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

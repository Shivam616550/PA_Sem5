import java.util.*;

public class array_vs_arraylist {
    public static void main(String[] args) {
        // Array
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;

        System.out.println(arr.length);

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.size());
        System.out.println(list.get(1));

        list.set(1, 50);
        list.remove(0);

        System.out.println(list);
    }
}
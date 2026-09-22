import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1));

        list.set(1, 25);

        list.remove(Integer.valueOf(10));

        System.out.println(list.contains(25));
        System.out.println(list);
    }
}

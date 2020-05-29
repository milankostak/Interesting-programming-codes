import java.util.ArrayList;
import java.util.List;

public class ArrayListInit {

    public static void main(String[] args) {
        final int size = 10_000_000;

        final List<String> list1 = new ArrayList<>();
        final long time1 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list1.add("a");
        }
        System.out.println(System.currentTimeMillis() - time1);
        System.out.println(list1.size());
        // necessary for avoiding potential over-optimization by Java
        // (if not printed then the for-loop can be detected as meaningless)


        final List<String> list2 = new ArrayList<>(size);
        final long time2 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list2.add("a");
        }
        System.out.println(System.currentTimeMillis() - time2);
        System.out.println(list2.size());
    }

}

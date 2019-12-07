import java.util.ArrayList;
import java.util.List;

public class FastStringBuilder {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 500_000; i++) {
            list.add("a");
        }

        String res2 = stringBuilder(list);
        System.out.println(res2);

        String res1 = stringConcatenation(list);
        System.out.println(res1);

        // 200_000 items
        // 2800 ms - 11 ms
        // 250 times faster

        // 500_000 items
        // 14400 ms - 17 ms
        // 850 times faster
    }

    private static String stringConcatenation(final List<String> list) {
        long time = System.currentTimeMillis();
        String string = "";
        for (String s : list) {
            string += s;
        }
        System.out.println(System.currentTimeMillis() - time);

        return string;
    }

    private static String stringBuilder(final List<String> list) {
        final long time = System.currentTimeMillis();
        final StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        System.out.println(System.currentTimeMillis() - time);

        return sb.toString();
    }

}

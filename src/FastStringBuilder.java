import java.util.ArrayList;
import java.util.List;

public class FastStringBuilder {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 200_000; i++) {
            list.add("a");
        }

        String res2 = stringBuilder(list);
        System.out.println(res2.substring(0, 5));

        String res1 = stringConcatenation(list);
        System.out.println(res1.substring(0, 5));

        // 200_000 items
        // Concat vs StringBuilder
        // 2800 ms - 11 ms
        // 250 times faster

        // 400_000 items
        // Concat vs StringBuilder
        // 9000 ms - 12 ms
        // 750 times faster
    }

    private static String stringConcatenation(final List<String> list) {
        final long time = System.currentTimeMillis();
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

public class StringConstructor {

    public static void main(String[] args) {
        String a = "ahoj";
        String b = new String(a);
        String c = new String("ahoj");

        System.out.println(a == b); // false
        System.out.println(a == c); // false
        System.out.println(b == c); // false

        System.out.println("---------");

        System.out.println(a == "ahoj"); // true (!)
        System.out.println(b == "ahoj"); // false
        System.out.println(c == "ahoj"); // false

        System.out.println("---------");

        System.out.println(a.equals(b)); // true
        System.out.println("ahoj".equals(a)); // true
        System.out.println("ahoj".equals(b)); // true
        System.out.println("ahoj".equals(c)); // true
    }

}

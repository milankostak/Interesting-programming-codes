public class IntegerConstructor {

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        int c = 1;
        Integer d = 1;
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
        System.out.println(a == 1); // true
        System.out.println(a == c); // true
        System.out.println(a == d); // false (!)
        System.out.println(a.equals(d)); // true

        System.out.println("---------");

        Integer e = Integer.valueOf(2);
        Integer f = Integer.valueOf(2);
        int g = 2;
        Integer h = 2;
        System.out.println(e == f); // true
        System.out.println(e.equals(f)); // true
        System.out.println(e == 2); // true
        System.out.println(e == g); // true
        System.out.println(e == h); // true
        System.out.println(e.equals(h)); // true
    }

}

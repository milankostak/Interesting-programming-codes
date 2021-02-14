public class PrintingNull {

    public static void main(String[] args) {
        // System.out.println(null);// error
        System.out.println(getNullString());
        System.out.println(getNullObject());
    }

    private static String getNullString() {
        return null;
    }

    private static Object getNullObject() {
        return null;
    }

}

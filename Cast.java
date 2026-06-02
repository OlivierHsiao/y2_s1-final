public class Cast {
    public static void main(String[] arr) {
        int a = 2;
        Integer aPrime = a;
        System.out.println(aPrime.getClass());
        double adouble = a;
        System.out.println(adouble);
        Double aDouble = adouble;
        System.out.println(aDouble.getClass());
        int b = (int) adouble; // data loss => explicit
        System.out.println(a == b);
        char c = (char) 65; // ASCII A
        System.out.println(c);
        int d = c;
        System.out.println(d);
    }
}

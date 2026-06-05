public class Generic<T extends Number, E extends Number> {
    Double n1;
    Double n2;

    public Generic(T n1, T n2) {
        this.n1 = n1.doubleValue();
        this.n2 = n2.doubleValue();
    }

    public <D extends Number> void newNo(D newVal) {
        System.out.println(newVal + " is the new value");
    }

    public static void main(String[] args) {
        Double a = 2.3;
        Integer b = 5;
        Integer c = 4;

        new Generic(a, b); // T is Number (chosen upper bound)
        new Generic(b, c); // T is Integer

    }
}

public class Calculator<T extends Number> {
    public Calculator() {
    }

    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public double minus(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
}
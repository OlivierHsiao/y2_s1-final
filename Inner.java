import java.util.*;

public class Inner extends Outer {
    public Inner(String colour, String name, int age) {
        super(colour, name, age);
    }

    @Override
    public void bark() {
        System.out.println("woaf");
    }

    public void hunt() {
        System.out.println("hunting");
    }

    public static void main(String[] args) {
        Outer a = new Inner("Brown", "Lucy", 5);
        Outer b = new Outer("gray", "puppy", 3);
        Inner c = new Inner("yellow", "white", 8);
        // a.hunt(); // error cannot find symbol
        a.bark();
        b.bark();
        c.hunt();
        c.bark();

        List<Inner> inLs = new ArrayList<>(List.of(c));
        List<Outer> outls = new ArrayList<>(inLs);
    }
}

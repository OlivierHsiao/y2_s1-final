
import java.util.*;

public class entry {
    public static void main(String[] args) {
        AbsGreet g1 = new AbsGreet("John", 23) {
            @Override
            public void greetsomeonefamiliar(String other) {
                System.out.printf("What's up %s\n", other);
            }

            @Override
            public void greetsomeonenew() {
                Scanner scan = new Scanner(System.in);
                System.out.println("May I have your name?");
                String name = scan.nextLine();
                System.out.printf("Nice to meet you %s\n", name);

            }

            @Override
            public String toString() {
                return String.format("This is %s, %d years old", name, age);
            }
        };
        ConGreet g2 = new ConGreet("Liam", 19);
        IntfaceGreet g3 = new IntfaceGreet() {
            String name = "Paul";
            Scanner scan = new Scanner(System.in);

            @Override
            public void greetsomeonefamiliar(String other) {
                System.out.printf("Hey %s, how's going\n", other);
            }

            @Override
            public void greetsomeonemightknow() {
                System.out.println("May I have your name");
                String other = scan.nextLine();
                scan.close();
                System.out.printf("Oh, you are %s, I'm %s nice to meet you", other, name);
            }

            @Override
            public String toString() {
                return "this is " + name;
            }
        };

        System.out.println(g1);
        g1.greetsomeonefamiliar("Bennett");
        g1.greetsomeonenew();
        System.out.println(g2);
        g2.greetsomeonefamiliar("Bennett");
        g2.greetsomeonenew();
        System.out.println(g3);
        g3.greetsomeonefamiliar("Bennett");
        g3.greetsomeonemightknow();
    }
}

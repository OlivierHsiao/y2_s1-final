
public class ConGreet {
    public String name;
    public int age;

    public ConGreet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greetsomeonefamiliar(String other) {
        String response = String.format("Hey %s, how's going", other);
        System.out.println(response);
    }

    public void greetsomeonenew() {
        System.out.printf("I'm %s, nice to meet you\n", name);
    }

    @Override
    public String toString() {
        return String.format("This is %s, %d years old", name, age);
    }
}
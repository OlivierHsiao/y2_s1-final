public abstract class AbsGreet {
    public String name;
    public int age;

    public AbsGreet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void greetsomeonefamiliar(String other);

    public abstract void greetsomeonenew();
}

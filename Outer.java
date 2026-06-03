public class Outer {
    private String colour;
    private String name;
    protected int age;

    public Outer(String colour, String name, int age) {
        this.colour = colour;
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("It's barking");
    }

}

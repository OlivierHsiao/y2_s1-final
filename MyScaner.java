import java.util.Scanner;

public class MyScaner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("start scanning");
        System.out.println(scan.next()); // Hello
        System.out.println(scan.nextLine()); // World, I'm five (the rest of the line including \n)
        scan.close();
    }
}
import java.io.*;
import java.util.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("NewText");
        fw.write("Hello World\n");
        fw.write("My name is java\n");
        fw.close();
        File f = new File("NewText");
        Scanner scan = new Scanner(f);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}

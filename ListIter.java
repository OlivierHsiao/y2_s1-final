import java.util.*;

public class ListIter {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println();
        for (int i : ls) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

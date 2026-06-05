import java.util.*;

public class Compare {
    public static void main(String[] args) {
        List<String> l1 = List.of("1", "3", "4", "5");
        List<String> l2 = new ArrayList<>(l1);
        Collections.sort(l1, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (Integer.parseInt(a) > Integer.parseInt(b)) {
                    return -1;
                } else if (Integer.parseInt(a) < Integer.parseInt(b)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        Comparator<String> comp = (String a, String b) -> {
            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                return -1;
            } else if (Integer.parseInt(a) < Integer.parseInt(b)) {
                return 1;
            } else {
                return 0;
            }
        };
        Collections.sort(l2, comp);
        System.out.println(l1);
        System.out.println(l2);
    }
}

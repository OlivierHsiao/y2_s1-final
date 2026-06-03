import java.util.*;

public class toArr {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4));
        Integer[] myArr = myList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(myArr));
    }
}

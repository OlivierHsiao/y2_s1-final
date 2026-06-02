
// ListOf vs. arrays.asList vs. new arrayList
import java.util.*;

public class arrList {
    public static void main(String[] arg) {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> listOf = List.of(arr);
        List<Integer> asList = Arrays.asList(arr);
        List<Integer> newarr = new ArrayList<>(List.of(arr));

        // set (same size mutable)
        try {
            System.out.println(listOf.set(1, 3));
        } catch (UnsupportedOperationException e) {
            System.out.println("List.Of does not support set");
        }
        try {
            System.out.println(asList.set(1, 3));
        } catch (UnsupportedOperationException e) {
            System.out.println("Arrays.asList does not support set");
        }
        try {
            System.out.println(newarr.set(1, 3));
        } catch (UnsupportedOperationException e) {
            System.out.println("new List does not support set");
        }

        // get (basic implementation)
        try {
            System.out.println(listOf.get(1));
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of does not support get");
        }
        try {
            System.out.println(asList.get(1));
        } catch (UnsupportedOperationException e) {
            System.out.println("Arrays.asList does not support get");
        }
        try {
            System.out.println(newarr.get(1));
        } catch (UnsupportedOperationException e) {
            System.out.println("new array does not support get");
        }

        // remove (completely mutable)
        try {
            System.out.println(listOf.remove(4));
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of does not support remove");
        }
        try {
            System.out.println(asList.remove(4));
        } catch (UnsupportedOperationException e) {
            System.out.println("Arrays.asList does not support remove");
        }
        try {
            System.out.println(newarr.remove(4));
        } catch (UnsupportedOperationException e) {
            System.out.println("new array does not support remove");
        }

    }
}
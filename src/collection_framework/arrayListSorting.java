package collection_framework;
import java.util.*;

public class arrayListSorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Jiya");
        names.add("Rohan");
        names.add("Helly");
        names.add("Ahan");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);
    }
}

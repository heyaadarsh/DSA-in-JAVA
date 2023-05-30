package collection_framework;
import java.util.*;

public class arrayListCopyList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);


        List<Integer> numList = new ArrayList<>();

        numList.add(60);
        numList.add(70);
        numList.add(80);


        numbers.addAll(numList);

        System.out.println(numbers);

    }
}

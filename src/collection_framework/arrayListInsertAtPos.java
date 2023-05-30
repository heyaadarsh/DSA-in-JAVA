package collection_framework;
import java.util.*;

public class arrayListInsertAtPos {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        System.out.println(numbers);

        numbers.add(0, 100);

        System.out.println(numbers);
    }
}

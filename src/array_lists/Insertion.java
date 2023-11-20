package array_lists;

import java.util.ArrayList;

public class Insertion {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2,4);
        System.out.println(numbers);
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add(1,"C");
        System.out.println(stringList);
    }
}

package array_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class DeletingElement {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        stringList.remove(2);
        System.out.println(stringList);
    }
}

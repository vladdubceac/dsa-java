package array_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchingElement {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        for(String letter : stringList){
            if(letter.equals("B")){
                System.out.println("The element is found");
                break;
            }
        }
        // indexOf
        int index = stringList.indexOf("F");
        System.out.println("The element is found at index: " + index);
    }
}

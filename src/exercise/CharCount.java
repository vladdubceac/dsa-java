package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharCount {

    public static String charCount(String str) {
        // declare object to return at the end
        String result;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // loop over the string
        for (int i = 0; i < str.length(); i++) {
            // if it is a letter
            if (Character.isLetter(str.charAt(i))) {
                // lowercase the character
                Character c = Character.toLowerCase(str.charAt(i));
                // if the character is in our object, add one to the value
                if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    // if the character is not in our object, add it to the object with the value of 1
                    hashMap.put(c, 1);
                }
            }
        }
        // Convert the object to String
        result = hashMap.toString();
        // return object
        return result;
    }

    public static void main(String[] args) {
        String str = "My name is Vlad";
        String content = charCount(str);
        System.out.println(content);
    }
}

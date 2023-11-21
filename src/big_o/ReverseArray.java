package big_o;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

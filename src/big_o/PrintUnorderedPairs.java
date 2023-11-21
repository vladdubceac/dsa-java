package big_o;

public class PrintUnorderedPairs {
    public static void main(String[] args) {
        PrintUnorderedPairs printUnorderedPairs = new PrintUnorderedPairs();
        int[] array = {1,3,4,5};
        printUnorderedPairs.printUnorderedPairs(array);
    }

    private void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.println(array[i]+","+array[j]);
            }
        }
    }
}

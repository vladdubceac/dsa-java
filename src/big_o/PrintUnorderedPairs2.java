package big_o;

public class PrintUnorderedPairs2 {
    public static void main(String[] args) {
        PrintUnorderedPairs2 printUnorderedPairs2 = new PrintUnorderedPairs2();
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {6,7,8,9,10,11,12,13,14,15,16};
        printUnorderedPairs2.printUnorderedPairs(arrayA, arrayB);
    }

    private void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                System.out.println(arrayA[i]+","+arrayB[j]);
            }
        }
    }
}

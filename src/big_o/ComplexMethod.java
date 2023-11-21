package big_o;

public class ComplexMethod {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {4,5,6,7,8,9};
        printUnorderedPairs(arrayA,arrayB);
    }

    private static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for (int k = 0; k < 1_000_000; k++) {
                    System.out.println(k+1+". "+arrayA[i]+","+arrayB[j]);
                }
            }
        }
    }
}

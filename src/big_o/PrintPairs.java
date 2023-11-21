package big_o;

public class PrintPairs {
    public static void main(String[] args) {
        PrintPairs printPairs = new PrintPairs();
        int[] customArray = {1,3,4,5};
        printPairs.printPairs(customArray);
    }

    private void printPairs(int[] customArray) {
        for(int i = 0; i < customArray.length;i++){
            for(int j=0;j<customArray.length;j++){
                System.out.println(customArray[i]+","+customArray[j]);
            }
        }
    }


}

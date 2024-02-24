package dynamic_programming.exercises.longest_palindromic_subsequence;

public class Exercise {
    public static int findLPSLength(String string) {
        Integer[][] matrix = new Integer[string.length()][string.length()];
        return findLPSLengthAux(matrix,string,0,string.length()-1);
    }

    private static int findLPSLengthAux(Integer[][] matrix, String str, int startIndex, int endIndex) {
        if(startIndex>endIndex){
            return 0;
        }
        if(startIndex==endIndex){
            return 1;
        }
        int temp = 0;
        if(matrix[startIndex][endIndex]==null){
            if(str.charAt(startIndex)==str.charAt(endIndex)){
                temp = 2 + findLPSLengthAux(matrix,str,startIndex+1,endIndex-1);
            }
            int temp1 = findLPSLengthAux(matrix,str,startIndex+1,endIndex);
            int temp2 = findLPSLengthAux(matrix,str,startIndex,endIndex-1);
            matrix[startIndex][endIndex]=Math.max(temp,Math.max(temp1,temp2));
        }
        return matrix[startIndex][endIndex];
    }

    public static void main(String[] args) {
        String string = "ELRMENMET";
        int length = findLPSLength(string);
        System.out.printf("Longest palindromic sequence length for %s is %d", string, length);
    }
}

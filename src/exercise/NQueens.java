package exercise;

public class NQueens {
    private int[] queens;
    private int n;

    public NQueens(int n) {
        queens = new int[n];
        this.n = n;
    }

    public void placeNQueens(){
        if(placeQueen(0)){
            printQueens();
        }else{
            System.out.println("No solution found");
        }
    }

    private boolean placeQueen(int column){
        if(column == n){
            return true; // All queens are placed successfully
        }

        for(int row = 0; row < n; row++){
            if(canPlace(row, column)){
                queens[column] = row; // Place queen
                if(placeQueen(column+1)){ // Recurse; move to next column
                    return true; // Found a valid placement
                }
            }
        }
        return false;
    }

    private boolean canPlace(int row, int column) {
        for (int i = 0; i < column; i++) {
            if (queens[i] == row || Math.abs(queens[i] - row) == Math.abs(i - column)) {
                return false; // Queen cannot be placed here
            }
        }
        return true; // It is safe to place the queen here
    }

    private void printQueens() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens(4+4);
        nQueens.placeNQueens();
    }
}

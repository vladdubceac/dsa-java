package divide_conquer.number_paths_reach_last_cell;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{4, 7, 1, 6}, {5, 7, 3, 9}, {3, 2, 1, 2}, {7, 1, 6, 3}};
        int cost = 25;

        NumberOfPathsToReachLastCell nop = new NumberOfPathsToReachLastCell();
        int result = nop.numberOfPaths(array, array.length - 1, array[0].length - 1, cost);
        System.out.println(result);
    }
}

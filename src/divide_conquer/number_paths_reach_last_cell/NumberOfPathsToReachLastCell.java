package divide_conquer.number_paths_reach_last_cell;

public class NumberOfPathsToReachLastCell {
    public int numberOfPaths(int array[][], int row, int col, int cost) {
        if (cost < 0) {
            return 0;
        }

        if (row == 0 && col == 0) {
            return array[0][0] - cost == 0 ? 1 : 0;
        }

        if (row == 0) {
            return numberOfPaths(array, 0, col - 1, cost - array[row][col]);
        }

        if (col == 0) {
            return numberOfPaths(array, row - 1, 0, cost - array[row][col]);
        }

        int numberOfPathsFromPreviousRow = numberOfPaths(array, row - 1, col, cost - array[row][col]);
        int numberOfPathsFromPreviousCol = numberOfPaths(array, row, col - 1, cost - array[row][col]);

        return numberOfPathsFromPreviousRow + numberOfPathsFromPreviousCol;
    }
}

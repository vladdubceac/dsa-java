package divide_conquer.min_cost_reach_last_cell;

public class MinCostToReachLastCell {
    private int findMinCost(int[][] cost, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) {
            return cost[0][0];
        }
        int minCost1 = findMinCost(cost, row, col - 1);
        int minCost2 = findMinCost(cost, row - 1, col);
        int minCost = Integer.min(minCost1, minCost2);
        return minCost + cost[row][col];
    }

    public int findMinCost(int[][] cost) {
        return findMinCost(cost, cost.length - 1, cost[0].length - 1);
    }
}

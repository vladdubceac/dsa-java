package divide_conquer.house_robber;

public class HouseRobber {
    private int maxMoneyRecursive(int[] houseNetWorth, int currentIndex) {
        if (currentIndex >= houseNetWorth.length) {
            return 0;
        }

        int stealCurrentHouse = houseNetWorth[currentIndex] + maxMoneyRecursive(houseNetWorth, currentIndex + 2);
        int skipCurrentHouse = maxMoneyRecursive(houseNetWorth, currentIndex + 1);

        return Math.max(stealCurrentHouse, skipCurrentHouse);
    }

    public int maxMoney(int[] houseNetWorth) {
        return maxMoneyRecursive(houseNetWorth, 0);
    }
}

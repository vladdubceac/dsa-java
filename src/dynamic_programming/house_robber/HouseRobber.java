package dynamic_programming.house_robber;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public int maxMoneyTopDown(int[] HouseNetWorth) {
        return maxMoneyTopDown(HouseNetWorth, 0, new HashMap<>());
    }

    public int maxMoneyTopDown2(int[] houseNetWorth){
        int dp[] = new int[houseNetWorth.length];
        return maxMoneyTopDown2(dp, houseNetWorth, 0);
    }

    private int maxMoneyTopDown2(int[] dp, int[] HouseNetWorth, int currentIndex) {
        if (currentIndex >= HouseNetWorth.length)
            return 0;

        if (dp[currentIndex] == 0) {
            int stealCurrent = HouseNetWorth[currentIndex] + maxMoneyTopDown2(dp, HouseNetWorth, currentIndex + 2);
            int skipCurrent = maxMoneyTopDown2(dp, HouseNetWorth, currentIndex + 1);
            dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
        }
        return dp[currentIndex];
    }

    private int maxMoneyTopDown(int[] houseNetWorth, int currentHouse, Map<Integer, Integer> houseWorthMap) {
        if (currentHouse >= houseNetWorth.length) {
            return 0;
        }

        if (!houseWorthMap.containsKey(currentHouse)) {
            int stealFirstHouse = houseNetWorth[currentHouse] + maxMoneyTopDown(houseNetWorth, currentHouse + 2, houseWorthMap);
            int skipFirstHouse = maxMoneyTopDown(houseNetWorth, currentHouse + 1, houseWorthMap);
            int max = Math.max(stealFirstHouse, skipFirstHouse);
            houseWorthMap.put(currentHouse, max);
        }
        return houseWorthMap.get(currentHouse);
    }
}

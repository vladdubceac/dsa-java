package dynamic_programming.house_robber;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public int maxMoneyTopDown2(int[] houseNetWorth) {
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

    public int maxMoneyTopDown(int[] HouseNetWorth) {
        return maxMoneyTopDown(HouseNetWorth, 0, new HashMap<>());
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

    public int maxMoneyBottomUp(int[] wealth) {
        int[] maxMoneyArray = new int[wealth.length + 2];
        for (int i = maxMoneyArray.length - 1; i >= 0; i--) {
            if (i >= wealth.length) {
                maxMoneyArray[i] = 0;
            } else if (i == wealth.length - 1) {
                maxMoneyArray[i] = wealth[i];
            } else {
                int stealHouse = wealth[i] + maxMoneyArray[i + 2];
                int skipHouse = maxMoneyArray[i + 1];
                maxMoneyArray[i] = Math.max(stealHouse, skipHouse);
            }
        }
        return maxMoneyArray[0];
    }

    public int maxMoneyBottomUp2(int[] wealth) {
        int dp[] = new int[wealth.length + 2]; // '+1' to handle the zero house
        dp[wealth.length] = 0; // if there are no houses, the thief can't steal anything
        for (int i = wealth.length - 1; i >= 0; i--) {
            dp[i] = Math.max(wealth[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }
}

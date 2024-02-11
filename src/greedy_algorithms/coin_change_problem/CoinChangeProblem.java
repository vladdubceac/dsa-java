package greedy_algorithms.coin_change_problem;

import java.util.Arrays;

public class CoinChangeProblem {
    static void coinChangeProblem(int[] coins, int n) {
        Arrays.sort(coins);
        int index = coins.length - 1;
        while (true) {
            int coinValue = coins[index];
            index--;
            int maxAmount = (n / coinValue) * coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin value : " + coinValue + " taken count : " + (n / coinValue));
                n = n - maxAmount;
            }
            if(n==0){
                break;
            }
        }
    }
}

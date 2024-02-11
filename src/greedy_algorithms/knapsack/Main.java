package greedy_algorithms.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KnapsackItem> items = new ArrayList<>();
        int[] value = {100, 120, 60};
        int[] weight = {20,30,10};
        int capacity = 50;
        for(int i=0;i<value.length;i++){
            items.add(new KnapsackItem(i+1,value[i],weight[i]));
        }
        FractionalKnapsack.knapSack(items, capacity);
    }
}

package dynamic_programming.fibonacci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    // Fibonacci Memoization
    public static int fibMemo(int n, Map<Integer, Integer> memo) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, fibMemo(n - 1, memo) + fibMemo(n - 2, memo));
        }
        return memo.get(n);
    }

    // Fibonacci Tabulation
    public static int fibTab(int n) {
        List<Integer> tab = new ArrayList<>();
        tab.add(0);
        tab.add(1);

        for (int i = 2; i < n; i++) {
            tab.add(tab.get(i - 1) + tab.get(i - 2));
        }
        return tab.get(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        int fib = fibMemo(n, new HashMap<>());
        System.out.println(fib);
        System.out.println(fibTab(n));
    }
}

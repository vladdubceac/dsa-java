package dynamic_programming.fibonacci;

import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        int n = 6;
        int fib = fibMemo(n, new HashMap<>());
        System.out.println(fib);
    }
}

package recursion;

public class FibonacciExample {
    public static void main(String[] args) {
        var result = fibonacci(4);
        System.out.println(result);
    }

    static int fibonacci(int n) { // 0,1,1,2,3,5,8,13,21,34,55,89
        if(n<0){
            return -1;
        }
        if (n==0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

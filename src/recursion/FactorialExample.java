package recursion;

public class FactorialExample {
    public static void main(String[] args) {
        FactorialExample factorialExample1 = new FactorialExample();
        int rec = factorialExample1.factorial(4);
        System.out.println(rec);
    }

    private int factorial(int n) {
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}

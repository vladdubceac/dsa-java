package dynamic_programming.number_factor;

public class Main {
    public static void main(String[] args) {
        NumberFactor numberFactor = new NumberFactor();
        System.out.println(numberFactor.waysToGetNTopDown(5));
        System.out.println(numberFactor.waysToGetNBottomUp(5));
    }
}

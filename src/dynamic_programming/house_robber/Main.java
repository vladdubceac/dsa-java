package dynamic_programming.house_robber;

public class Main {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int n = houseRobber.maxMoneyTopDown(new int[]{6, 7, 1, 30, 8, 2, 4});
        System.out.println("House robber , top down solution = " + n);
        n = houseRobber.maxMoneyTopDown2(new int[]{6, 7, 1, 30, 8, 2, 4});
        System.out.println("House robber , top down solution = " + n);
    }
}

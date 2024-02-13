package divide_conquer.house_robber;

public class Main {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] houseNetWorth = {6, 7, 1, 30, 8, 2, 4};
        System.out.println(houseRobber.maxMoney(houseNetWorth));
    }
}

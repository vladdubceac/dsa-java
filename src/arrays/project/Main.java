package arrays.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperatures ? ");
        int numDays = console.nextInt();
        int sum = 0;
        for (int i = 1; i <= numDays; i++) {
            System.out.print("Day " + i + "'s high temp : ");
            int next = console.nextInt();
            sum += next;
        }

        double average = sum / numDays;
        System.out.println();
        System.out.println("Average Temp = " + average);
    }
}

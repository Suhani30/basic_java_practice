//Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
// then 400 tk will be discounted. After your purchase what will be your total cost?

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        int shirt, sharee, totalCost, discount = 400, cost, cost1;

        System.out.println("Enter number of shirt ");

        Scanner a = new Scanner(System.in);
        shirt = a.nextInt();

        System.out.println("Enter number of sharee ");

        Scanner b = new Scanner(System.in);
        sharee = b.nextInt();

        if(shirt == 2 & sharee == 1){
            cost = 2*1200 + 1*3500;
            totalCost = cost - discount;
            System.out.println("After discount total price is: " +totalCost);
        }
        else {
            cost1 = shirt*1200 + sharee*3500;
            System.out.println("Total price without discount is: " +cost1);
        }
    }
}

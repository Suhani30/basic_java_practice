//Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        int price = 76000;
        int cash, discount, total, tap;

        System.out.println("Tap 1 for cash or tap 2 for online payment: ");

        Scanner a = new Scanner(System.in);
        tap = a.nextInt();

        if (tap == 1){
            discount = (price * 10)/100;
            total = price - discount;
            System.out.println("Total price after discount: " +total);
            System.out.println("Total discounted money: " +discount);
        }
        else System.out.println("Online payment full price: " + price);
    }
}

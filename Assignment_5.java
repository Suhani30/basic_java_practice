//Write a program to sum of digits of a number

import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] arg)
    {
        int num, digit, sum=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        while(num!=0)
        {
            digit = num%10;
            sum = sum + digit;
            num = num/10;
        }

        System.out.println("\nSum of Digits = " +sum);
    }
}

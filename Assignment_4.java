//Write a program to create a digital Tasbih.
// Each time user press enter button, It will count the value.
//
// If user press 0, the value will be reset.

import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {

        int counter = 1;
        System.out.println("Press Enter for count Tasbih");

        while(true)
        {

            Scanner readinput = new Scanner(System.in);

            String enterkey = readinput.nextLine();
            if(enterkey.equals("0")) {
                break;
            }
            else if(enterkey.equals("")) {
                System.out.print(counter++);
            }

        }



    }
}

/*
Enzo Gaddi
14/10/2024
Using and understanding arrays and array lists to produce outputs in different situations
 */

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] myNumbers = new int[11];
        myNumbers[0] = 100;
        myNumbers[1] = 200;
        myNumbers[2] = 300;
        myNumbers[3] = 400;
        myNumbers[4] = 500;
        myNumbers[5] = 600;
        myNumbers[6] = 700;
        myNumbers[7] = 800;
        myNumbers[8] = 900;
        myNumbers[9] = 1000;
        myNumbers[10] = n;

        for(int i = 0; i < myNumbers.length; i++)
        {
            System.out.println(myNumbers[i]);
        }
    }

}

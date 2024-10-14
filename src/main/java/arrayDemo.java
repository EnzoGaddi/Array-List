/*
Enzo Gaddi
14/10/2024
Using and understanding arrays and array lists to produce outputs in different situations
 */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);

        for(Integer i : list)
        {
            System.out.println("Element at index: " + i);
        }

        System.out.println("Please enter new number: ");
        Integer newNum = sc.nextInt();

        list.add(newNum);

        for(Integer x : list)
        {
            System.out.println("Element at index: " + x);
        }

    }

}

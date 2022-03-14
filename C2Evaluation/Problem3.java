package com.C2Evaluation;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide Starting Point");
        int start = input.nextInt();
        System.out.println("Provide Ending Point");
        int end = input.nextInt();
        System.out.println("Increment Value");
        int increment = input.nextInt();
//        System.out.println(start+ end + increment);
        if(increment >= 0 && start >= 0)
        {
            while(start <= end)
            {
                System.out.print(start + " ");
                start += increment;
            }
        }else
        {
            System.out.println("Invalid Input");
        }

    }
}

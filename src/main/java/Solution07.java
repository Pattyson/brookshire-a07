/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution07 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);

        final double f, m, g = 0.09290304;
        int x, y;

        System.out.println("What is the length of the room in feet?");
        x = input.nextInt();

        System.out.println("What is the length of the room in feet?");
        y = input.nextInt();

        System.out.println("You entered dimensions of " + x + " feet by " + y + " feet.");

        f = x * y;
        m = f * g;

        System.out.println("The area is \r\n" + f + " square feet \r\n" + m + " sqaure meters");




    }

}
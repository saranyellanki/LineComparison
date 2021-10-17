package com.bridgelabz.UC2;

import java.util.Scanner;

public class EqualityOfTwoLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the co-ordinate y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the co-ordinate x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the co-ordinate y2");
        int y2 = sc.nextInt();
        double Result1 = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.println("The line of co-ordinates (x1,y1) and (x2,y2) :" + Result1);

        System.out.println("Enter the co-ordinate x3");
        int x3 = sc.nextInt();
        System.out.println("Enter the co-ordinate y3");
        int y3 = sc.nextInt();
        System.out.println("Enter the co-ordinate x4");
        int x4 = sc.nextInt();
        System.out.println("Enter the co-ordinate y4");
        int y4 = sc.nextInt();
        double Result2 = Math.sqrt(Math.pow((x3-x4),2) + Math.pow((y3-y4),2));
        System.out.println("The line of co-ordinates (x3,y3) and (x4,y4) :" + Result2);

        System.out.println(Result1 == Result2);

//        if (Result2 == Result1)
//            System.out.println("The two Lines are equal in Length");
//        else
//            System.out.println("The two lines are not equal in Length");
    }
}

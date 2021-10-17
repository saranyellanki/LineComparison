package com.bridgelabz.UC1;

import java.util.Scanner;


public class LengthOfLine {

    public int x1,x2,y1,y2;
    public LengthOfLine(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calculateLengthOfTheLine(){
        return Math.sqrt(Math.pow((this.x1-this.x2),2) + Math.pow((this.y1-this.y2),2));
    }

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
        LengthOfLine lengthOfLineObj = new LengthOfLine(x1,x2,y1,y2);
        System.out.println("The Length of the Line from the given co-ordinates : " + lengthOfLineObj.calculateLengthOfTheLine());

    }
}

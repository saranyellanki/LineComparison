package com.bridgelabz.UC2;

import java.util.Scanner;

class LineCoOrdinates {

    int x1,x2,y1,y2;
    Double lengthOfLine;

    public LineCoOrdinates(int x1, int x2, int y1, int y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public LineCoOrdinates calculateLengthOfLine() {
        lengthOfLine = Math.sqrt(Math.pow((this.x1-this.x2),2) + Math.pow((this.y1-this.y2),2));
        return this;
    }

    public void show() {
        System.out.printf("The length of line formed by co-ordinates ( %d, %d),( %d, %d) is %f %n", this.x1,this.x2,this.y1,this.y2, this.lengthOfLine);
    }
}

public class EqualityOfTwoLines {

    public static boolean isLengthOfLinesEqual(LineCoOrdinates result1, LineCoOrdinates result2) {
        return result1.lengthOfLine.equals(result2.lengthOfLine);
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
        LineCoOrdinates result1 = new LineCoOrdinates(x1,x2,y1,y2);
        result1.calculateLengthOfLine().show();

        System.out.println("Enter the co-ordinate x3");
        int x3 = sc.nextInt();
        System.out.println("Enter the co-ordinate y3");
        int y3 = sc.nextInt();
        System.out.println("Enter the co-ordinate x4");
        int x4 = sc.nextInt();
        System.out.println("Enter the co-ordinate y4");
        int y4 = sc.nextInt();
        LineCoOrdinates result2 = new LineCoOrdinates(x3,x4,y3,y4);
        result2.calculateLengthOfLine().show();

        if(isLengthOfLinesEqual(result1,result2)) System.out.println("Line are equal");
        else System.out.println("Lines are not equal");

    }
}

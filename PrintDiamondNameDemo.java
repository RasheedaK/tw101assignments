package com.tw;

import java.util.Scanner;

/**
 * Created by Rashi on 12/17/2016.
 */
public class PrintDiamondNameDemo {
    public static void main(String args[])
    {
        int number;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        PrintDiamondName obj=new PrintDiamondName();
        obj.printIt(number);
    }
}

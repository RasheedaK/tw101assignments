/**
 * Created by Rashi on 12/17/2016.
 */
package com.tw;

import java.util.Scanner;

public class PrintDiamondDemo {
    public static void main(String args[])
    {
        int number;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        PrintDiamond obj=new PrintDiamond();
        obj.printIt(number);
    }

}

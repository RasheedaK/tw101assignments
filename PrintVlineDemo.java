package com.tw;
import java.util.*;
/**
 * Created by Rashi on 12/17/2016.
 */
public class PrintVlineDemo {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        PrintVline obj=new PrintVline();
        obj.printVline(number);
    }
}

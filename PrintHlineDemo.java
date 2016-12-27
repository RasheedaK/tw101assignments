package com.tw;
import java.util.*;
/**
 * Created by Rashi on 12/17/2016.
 */
public class PrintHlineDemo {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        PrintHline obj=new PrintHline();
        obj.printLine(number);
    }
}

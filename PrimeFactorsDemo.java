/**
 * Created by Rashi on 12/17/2016.
 */
package com.tw;

import java.util.Scanner;

public class PrimeFactorsDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ReturnPrimeFactors obj = new ReturnPrimeFactors();
        obj.generate(num);
    }
}

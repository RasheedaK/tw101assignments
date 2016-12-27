/**
 * Created by Rashi on 12/17/2016.
 */
package com.tw;
public class PrintTriangle {
        void printTriangle(int num) {
            int limit=num-1;
            int starcount=1;
            for (int i = 1; i <= num; i++) {
                for (int v = 0; v < limit; v++)
                    System.out.print(" ");
                for (int v = 0; v < starcount; v++)
                    System.out.print("*");
                System.out.println();
                limit-=1;
                starcount+=2;
            }
        }

}

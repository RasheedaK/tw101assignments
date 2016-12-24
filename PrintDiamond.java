
package com.tw;
public class PrintDiamond {
    void printIt(int num) {
        int limit=num-1;
        int starcount=1;
        for (int i = 1; i <= num; i++) {
            for (int v = 0; v < limit; v++)
                System.out.print(" ");
            for (int v = 0; v < starcount; v++)
                System.out.print("*");
            System.out.println();
            limit -= 1;
            starcount += 2;
        }
        starcount-=4;
        limit+=2;
        for (int i = 1; i <= num-1; i++) {
            for (int v = 0; v < limit; v++)
                System.out.print(" ");
            for (int v = 0; v < starcount; v++)
                System.out.print("*");
            System.out.println();
            limit+=1;
            starcount-=2;
        }
    }

}

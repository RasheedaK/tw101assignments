/**
 * Created by Rashi on 12/17/2016.
 */
package com.tw;
public class ReturnPrimeFactors {
    void generate(int num)
    {
        for(int i=2;i<=num;i++)
        {
            int result=Check(i);
            if(result==1 && num%i==0) {
                System.out.println(i);
            }
        }
    }
    int Check(int num)
    {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==1)
            return 1;
        else
            return 0;
    }

}

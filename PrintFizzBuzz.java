/**
 * Created by Rashi on 12/17/2016.
 */
package com.tw;
public class PrintFizzBuzz {
    void FizzBuzz()
    {

        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
               System.out.println("FizzBuzz");
            else if(i%5==0)
                System.out.println("Fizz");
            else if(i%3==0)
                System.out.println("Buzz");
			else 
				System.out.println(i);
        }
    }
}

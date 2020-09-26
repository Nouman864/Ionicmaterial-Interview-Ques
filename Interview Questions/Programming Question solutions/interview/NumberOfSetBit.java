package com.company;
import java.util.Scanner;
public class NumberOfSetBit
{
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int n, m;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        n = Integer.parseInt(x);
        int count = 0;
        while(n!=0)
        {
            if(n%10==1)
                count++;
            n/=10;
        }
        System.out.println(count);
        System.out.println(x);
    }
}
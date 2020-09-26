package com.company;
// Java program to find whether
// a no is power of two
import java.io.*;

class PowerOfTwo {

    // Function to check if
    // x is power of 2
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    int isPowerOf2()
    {
        int n=63;
        if(n>0)
        {
            while(n%2 == 0)
            {
                n/=2;
            }
            if(n == 1)
            {
                System.out.println("Number is power of 2");
            }
        }
        if(n == 0 || n != 1)
        {
            System.out.println("Number is not power of 2");
        }
        return 0;
    }

    // Driver program
    public static void main(String args[])
    {
        if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed by Nikita tiwari.

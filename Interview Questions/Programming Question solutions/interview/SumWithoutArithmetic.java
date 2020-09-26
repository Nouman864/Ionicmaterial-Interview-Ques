package com.interview;

public class SumWithoutArithmetic
{
    public static void main(String[] args) {
        int num1=10; int num2=3;

        num1 = num1 - (-num2);

        for (int i = 0; i < num2; i++)
            num1++;

        while((num2--)>0)
        {
            num1++;
        }

        while (num2 > 0) {
            num1++;
            num2--;
        }
    }
}

// Write a program which accepts  no from user and returns the addition of its factors.

import java.util.*;

class program205 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iCnt = 0;
        int iSum = 0;

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();

        for(iCnt = 1; iCnt <= (iValue / 2); iCnt++)
        {
            if ((iValue % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Summation of factors is = "+iSum);
    }
}

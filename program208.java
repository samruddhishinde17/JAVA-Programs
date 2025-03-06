// Problems on Digits
// Write a program which accepts no from user and returns the count of digits in it.

import java.util.*;

class program208
{
    public static int CountDigit(int iNo)
    {
        int iCnt = 0;

        while (iNo > 0) 
        {
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();
        
        iRet = CountDigit(iValue);

        System.out.println("No of digits are = "+iRet);
    }
}
// Problems on No & Digits
// Write a program which accepts no from user and returns the addition of even digits.

import java.util.*;

class program209
{
    public static int SumEvenDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        while (iNo > 0) 
        {
            iDigit = iNo % 10;
            if((iNo % 2) == 0)
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();
        
        iRet = SumEvenDigits(iValue);

        System.out.println("Addition of even digits are = "+iRet);
    }
}
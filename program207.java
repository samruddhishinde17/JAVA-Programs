// Problems on No
// Write a program which accepts no from user and returns the difference between the summaton of factors and the summation of non-factors.

import java.util.*;

class program207
{
    public static int Diffrence(int iNo)
    {
        int iCnt = 0, iSumF = 0, iSumN = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if ((iNo % iCnt) == 0)     // Logic for factos
            {
                iSumF = iSumF + iCnt;
            }
            else                       // Logic for non-factos
            {
                iSumN = iSumN + iCnt;
            }
        }
        return iSumN - iSumF;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();
        
        iRet = Diffrence(iValue);

        System.out.println("Difference of factors is = "+iRet);
    }
}
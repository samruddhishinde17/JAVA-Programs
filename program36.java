// Problems on Numbers
// For loop
//WAP to write a addition of given no of factors.

import java.util.*;

class program36
{
    int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        //      1          2          3
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        return iSum;
    }
   public static void main(String[] args) 
   {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number = ");
        iValue = sobj.nextInt();

        program36 pobj = new program36();
        
        iRet =pobj.SumFactors(iValue);
        System.out.println("Summation of given factors is "+iRet);

        sobj.close();

    }
}


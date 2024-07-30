// Problems on Numbers
// For loop
//WAP which accept the no from user and display the how many factors that no have 

import java.util.*;

class program37
{
    int CountFactors(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        //      1          2          3
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iCount++;
            }
        }
        
        return iCount;
    }
   public static void main(String[] args) 
   {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number = ");
        iValue = sobj.nextInt();

        program37 pobj = new program37();
        
        iRet =pobj.CountFactors(iValue);
        System.out.println("No of given factors are = "+iRet);

        sobj.close();

    }
}


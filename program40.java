// Problems on Numbers
// Using FILTER Concept
//WAP to check whether the given no is Perfect or not.

import java.util.*;

/*
    Accept number as No
    Search all its factors
    Perform addition of all the factors
    If adddition is same as No
    then Display as No is perfect number
    otherwise Display as No is noyt perfect number
*/

class program40
{
    boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if (iNo < 0)
        {
            System.out.println("Please enter only positive number");   //Filter
            return false;
        }
        for (iCnt = 1; iCnt <= (iNo/2) ; iCnt++)
        {
            if ((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if (iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();

        program40 pobj = new program40();

        bRet = pobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is perfect number");
        }
        else
        {
            System.out.println(iValue+" is perfect not a number");
        }

        sobj.close();
    }
}
    

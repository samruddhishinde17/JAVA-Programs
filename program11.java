// Accept the no from user & check whether the no ins in between range 30 to 50

/*
    START
        Accept one number as No
        If the number is greater than 30 and if it is less than 50
        then diplsay the message as number is in range
        otherwise 
        display the message as number is not in the range
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////
//
//  Function Name :     CheckRange
//  Description :       Used to check whether number is in given range i.e 30 to 50
//  Input :             Integer
//  Output :            Boolean
//  Author :            Samruddhi Santosh Shinde
//  Date :              22/04/2024
//
////////////////////////////////////////////////////////////

class program11
{
    boolean CheckRange(int iNo)
    {
        if((iNo >= 30) && (iNo <= 50))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] Arg)
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no = ");
        iValue = sobj.nextInt();

        program11 pobj = new program11();
        bRet = pobj.CheckRange(iValue);

        if (bRet == true) 
        {
           System.out.println(iValue+" is in between the range of 30 to 50");    
        }
        else
        {
            System.out.println(iValue+" is not in between the range of 30 to 50");    
        }

        sobj.close();
    }
}
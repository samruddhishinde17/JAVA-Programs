//Accpet the no from user and check whether that no is divisible by 3 & 5

// Algirithm
/*
    START
        Accept one number as Value
        Divide that number Value by 3
        If remainder is 0
        Divide that number Value by 5
        If remainder is 0
        then print number is divisible by 3 and 5
        otherwise display the it is not divisble by 3 , 5
    STOP
*/


import java.util.Scanner;

////////////////////////////////////////////////////////////
//
//  Function Name :     CheckDivisible
//  Description :       Used to check whether number is divisible by 3 & 5
//  Input :             Integer
//  Output :            Boolean
//  Author :            Samruddhi Santosh Shinde
//  Date :              16/04/2024
//
////////////////////////////////////////////////////////////

class program9
{
    boolean CheckEvenOdd(int iNo)
    {
        if(((iNo % 3) == 0) && (iNo % 5) == 0)
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
        int Value = 0;
        boolean bRet = false;
        program9 pobj = new program9();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no =");
        Value = sobj.nextInt();

        bRet = pobj.CheckEvenOdd(Value);

        if (bRet == true) 
        {
            System.out.println(Value+" is divisible by 3 & 5");
        }
        else
        {
            System.out.println(Value+" is not divisible by either 3 & 5 or both");
        }

        sobj.close();
    }
}
//Accept a no from user and check whether the no even or odd

import java.util.*;

// Algorithm
/*
//  START
     Accept 1 no as No
     Divide that no No by 2
     If remainder is 0
     Then display the result as Even no
     Otherwise display the result as Odd no
  STOP
*/

class program8
{
    boolean CheckEvenOdd(int iNo)
    {
        if ((iNo % 2) == 0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String Arg[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();

        program8 pobj = new program8();
        bRet = pobj.CheckEvenOdd(iValue);

        if (bRet == true)
        {
             System.out.println(iValue+" is even");
        }
        else
        {
            System.out.println(iValue+" is odd");
        }
        
        sobj.close();
    }
}
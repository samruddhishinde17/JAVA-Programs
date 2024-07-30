// WAP which checks the given no is divisible by 4 or not.

import java.util.*;

class program31
{
    boolean CheckDivisible(int iNo)
    {
        if ((iNo % 4) == 0 )
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

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no = ");
        iValue = sobj.nextInt();

        program31 pobj = new program31();
        boolean iRet = pobj.CheckDivisible(iValue);

        if (iRet)
        {
            System.out.println(iValue + " is divisible by 4");
        }
        else
        {
            System.out.println(iValue + " is not divisible by 4");
        }

        sobj.close();
    }
 
}
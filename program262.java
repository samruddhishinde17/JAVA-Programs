// Problems on String
// Write a program which accepts the string as a input and returns the no of capital characters from that string.

import java.util.*;

class program262
{
    public static int CountCapital(String str)
    {
       char Arr[] = str.toCharArray();
       int i = 0, iCnt = 0;

       for(i = 0; i < Arr.length; i++)
       {
            if ((Arr[i] >= 'A') && (Arr[i] <= 'Z')) 
            {
                iCnt++;
            }
       }

       return iCnt;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name = ");
        String name = sobj.nextLine();

        int iRet = 0;
        iRet = CountCapital(name);

        System.out.println("No of capital characters = "+iRet);
    }
}
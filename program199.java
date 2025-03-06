// Write a program for Addition of 2 no.

import java.util.*;

class program199
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        int iAns = 0;

        System.out.println("Enter First no = ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Second no = ");
        iValue2 = sobj.nextInt();

        iAns = iValue1 + iValue2;

        System.out.println("Addition is : "+iAns);
    }
}


// int      nextInt()   
// float    nextFloat()
// double   nextDouble()
// String   nextLine()
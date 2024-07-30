// Problems on Numbers
// For loop
//WAP to find the factorial of given no upta that given no.

import java.util.*;

class program35
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        System.out.println("Factors of "+iNo+" are : ");

        //      1          2          3
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt+" ");    //4
            }
        }
        System.out.println();
    }
   public static void main(String[] args) 
   {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number = ");
        iValue = sobj.nextInt();

        program35 pobj = new program35();
        
        pobj.DisplayFactors(iValue);

        sobj.close();

    }
}


//Using FILTER concept
//Accept the no from user as a percentage and display whether the student pass or fail

import java.util.Scanner;

class program13
{
    boolean DisplayResult(float fMarks)
    {
        if ((fMarks < 0.0f) || (fMarks > 100.0f))        //Filter
        {
            return false;
        }
    
        if ((fMarks > 0.0f) && (fMarks < 35.0f))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args) 
    {
        float fNo = 0.0f;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Percentage = ");
        fNo = sobj.nextInt();

        program13 pobj = new program13();
        bRet = pobj.DisplayResult(fNo);

        if (bRet == true)
        {
            System.out.println("Student is pass in the exam");
        }
        else
        {
            System.out.println("Student is fail in the exam");
        }

        sobj.close();
    }
}


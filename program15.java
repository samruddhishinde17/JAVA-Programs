//Using FILTER concept
//Accept the no from user as a percentage and display whether the student pass or fail

import java.util.Scanner;

class program15
{
    int DisplayResult(float fMarks)
    {
        if ((fMarks < 0.0f) || (fMarks > 100))
        {
            return 1;
        }

        if ((fMarks >= 35.0f) && (fMarks <= 100))
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    public static void main(String[] args) 
    {
        float fNo = 0.0f;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Percentage = ");
        fNo = sobj.nextFloat();

        program15 pobj = new program15();
        iRet = pobj.DisplayResult(fNo);

        if(iRet == 1)
        {
            System.out.println("Invalid Input");
        }
        else if (iRet == 2)
        {
            System.out.println("Student is pass in the exam ");
        }
        else if(iRet == 3)
        {
            System.out.println("Student is fail in the exam ");
        }
    
        sobj.close();
    }
}


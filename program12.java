//Accept the no from user as a percentage and display whether the student pass or fail

import java.util.*;

class program12
{
    boolean DisplayResult(float fMarks)
    {
        if((fMarks >= 35.0f) && (fMarks <= 100))
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
        float fNo = 0.0f;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Percentage = ");
        fNo = sobj.nextFloat();

        program12 pobj = new program12();
        bRet = pobj.DisplayResult(fNo);

        if(bRet == true)
        {
            System.out.println("Student is PASS");
        }
        else
        {
            System.out.println("Student is FAIL");
        }

        sobj.close();;
    }
}
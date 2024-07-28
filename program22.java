//Using "FOR LOOOP" Concept
//Ask the user to input a number that how many times they want to display the "Jay Hanuman" on the screen.

import java.util.Scanner;

class program22
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("JAY HANUMAN...");
        }
    }
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no you want to display JAY HANUMAN on screen : ");
        iValue = sobj.nextInt();

        program22 pobj = new program22();

        pobj.Display(iValue);

        sobj.close();
    }
}
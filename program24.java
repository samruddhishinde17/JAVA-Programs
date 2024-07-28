//Using "WHILE LOOOP" Concept
//Ask the user to input a number that how many times they want to display the "Jay Hanuman" on the screen.

import java.util.Scanner;

class program23
{
    void Display(int iNo)
    {
        int iCnt = 0;

        iCnt = 1;                                  //1
        while( iCnt <= iNo )                       //2 
        {
            System.out.println("JAY HANUMAN");
            iCnt++;                                //3
        }
    }
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of times you want to display Jay Hanuman on screen : ");
        iValue = sobj.nextInt();

        program23 pobj = new program23();

        pobj.Display(iValue);

        sobj.close();
    }
}
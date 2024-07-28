//Using "DYNAMIC FOR LOOP" Concept 
//Write a program that takes an integer input from the user and displays the numbers from 1 to the input number.

import java.util.Scanner;

class program27
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
           System.out.println(iCnt);
        }
    }

    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of times you want to display numbers on screen : ");
        iValue = sobj.nextInt();
        
        program27 pobj = new program27();
        pobj.Display(iValue);         

        sobj.close();
    }
}
// Problems on N numbers
// Dynamic Memory allocation
// Write a program which accepts the elements and display them.

import java.util.Scanner;

class program239
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of elements = ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements = ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Entered elements are = ");
        for(int j = 0; j < Arr.length; j++)
        {
            System.out.println(Arr[j]);
        }
    }
}
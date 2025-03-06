// Problems on N numbers
// Write a program which takes the elements from user and display it by Object Oriented Way.
//This program can compare with program 227.

import java.util.Scanner;

class ArrayX
{
    public int Arr[];

    public ArrayX(int no)
    {
        Arr = new int[no];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements = ");
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Entered elements are = ");
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public float Average()
    {
        int iSum = 0, i = 0;
        float fAns = 0/0f;

        for(i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i];
        }

        fAns = (float)iSum / (float)(Arr.length);

        return fAns;
    }
}

class program243
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements that you want = ");
        int iNo = sobj.nextInt();

        ArrayX aobj = new ArrayX(iNo);

        System.out.println("Array size is : "+aobj.Arr.length);

        aobj.Accept();

        aobj.Display();

        float fRet = aobj.Average();

        System.out.println("Average is : "+fRet);
    }
}
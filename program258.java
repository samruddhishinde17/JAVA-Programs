// Problems on String
// Write a program which accepts the string from user and display its length.

import java.util.*;

class program258
{
   public static void main(String[] args) 
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter your name = ");
      String name = sobj.nextLine();

      System.out.println("String length is : "+name.length());

   }
}
// Problems on String
// Write a program which accepts the string from user and display it.

import java.util.*;

class program257
{
   public static void main(String[] args) 
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter your name = ");
      String name = sobj.nextLine();

      System.out.println("Hello "+name);
   }
}
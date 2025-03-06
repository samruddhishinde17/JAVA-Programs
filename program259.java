// Problems on String
// One of the method to travel the array of string

import java.util.*;

class program259
{
   public static void main(String[] args) 
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter your name = ");
      String name = sobj.nextLine();

       int i = 0;

       for(i = 0; i < name.length(); i++)
       {
        System.out.println(name.charAt(i));
       }
   }
}
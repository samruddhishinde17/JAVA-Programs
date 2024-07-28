import java.util.*;

class program4
{
    public static void main(String[] Args)
    {
        float fValue1, fValue2, fResult = 0.0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no = ");
        fValue1 = sc.nextFloat();

        System.out.println("Enter 2nd no = ");
        fValue2 = sc.nextFloat();

        fResult = fValue1 + fValue2;

        System.out.println("Addition is = "+fResult);

        sc.close();
    }
}
import java.util.Scanner;

class program2
{
    public static void main(String[] arg)
    {
        int i, j, k = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no = ");
        i = sc.nextInt();

        System.out.println("Enter 2nd no = ");
        j = sc.nextInt();

        k = i+j;

        System.out.println("Addition is = "+k);

        sc.close();
    }
}
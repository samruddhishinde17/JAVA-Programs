//Using "FOR LOOOP" Concept
//Display "Jay Hanuman" on screen 5 times

class program23
{
    void Display()
    {
        int iCnt = 1;

        while (iCnt <= 5) 
        {
            System.out.println("Jay Hanuman...");

            iCnt++;
        }
    }
    public static void main(String[] args) 
    {
        program23 pobj = new program23();

        pobj.Display();
    }
}
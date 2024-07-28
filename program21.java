//Using "FOR LOOOP" Concept
//Display "Jay Hanuman" on screen 5 times

class program21
{
    void Display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Jay Hanuman...");
        }
    }
    public static void main(String[] args) 
    {
        program21 pobj = new program21();

        pobj.Display();
    }
}
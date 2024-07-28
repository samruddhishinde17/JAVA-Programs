//Using "STATIC FOR LOOP" Concept 
//Display normally 1,2,3,4

class program26
{
    void Display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 4; iCnt++)
        {
            System.out.println(iCnt);
        }
    }

    public static void main(String[] args) 
    {
        program26 pobj = new program26();
        pobj.Display();   
    }
}
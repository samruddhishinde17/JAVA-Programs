// Problems on N numbers

class ArrayX
{
    public int Arr[];

    public ArrayX(int no)
    {
        Arr = new int[no];
    }
}

class program240
{
    public static void main(String[] args) 
    {
        ArrayX aobj = new ArrayX(5);

        System.out.println("Array size is : "+aobj.Arr.length);
    }
}
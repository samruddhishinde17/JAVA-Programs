// Problems on N numbers
// Static Memory Allocation
// Write a program which displays the elements from the given array line by line.

class program237
{
    public static void main(String[] args) 
    {
        int Arr[] = {10,20,30,40};

        System.out.println("Number of elements in Arr "+Arr.length);

        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

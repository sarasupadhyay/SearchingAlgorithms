//This program is written for Linear Searching
class LinearSearch
{
    public static boolean Searching(int ar[],int target)
    {
        int n=ar.length;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==target)
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int nums[]={1,5,3,9,7,2,8,15,42,97,46};
        //search for 2 is present or not
        System.out.println("Element is in array : "+Searching(nums,2));
    }
}
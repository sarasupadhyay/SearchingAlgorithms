//This is a program for binary Searching Algorithm
import java.util.Arrays;//importing Array directories for sorting
class BinarySearch
{
    public static int search(int ar[],int target)
    {
        int low=0;
        int high=ar.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(ar[mid]==target)//check if element to be search is at mid
            return ar[mid];
            else if(ar[mid]<target)
            low=mid+1;//if target is greater then ar[mid] ignore left half
            else
            high=mid-1;//if target is less then ar[mid] ignore right half
        }
        return -1;
    }
    public static void main(String[] arg)
    {
       int ar[]={34,87,56,21,45,23,56,43,12,34,32,98,73};
       //before doing binary search we have to sort thr array in assending order
       Arrays.sort(ar);
       BinarySearch ob=new BinarySearch();
       int res=ob.search(ar,45);
       if(res==-1)
       System.out.println("Element is not present");
       else
       System.out.println(res+" is present in given array"); 
    }
}
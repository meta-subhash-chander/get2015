import java.util.*;

/**
 * this program is to sort an unsorted array by using the concept of quick sort.
 * @author Subhash chander
 */
public class QuickSort
{
    
/**
 * This method is used to sort an unsorted array.
 * @param arr array which is to be sorted
 * @param start starting index of array
 * @param end last index of array
 */
    void sort(int arr[],int start,int end)
    {
    
        if(end!=-1)
        {
    if(start<=end)
         
    {
        int i=start;
        int j=end;
        int pivot=start;
        while(i<j)
        {
            while(arr[i]<=arr[pivot] && i<end)
            {
                i++;    
            }
            while(arr[j]>arr[pivot] && j>=start)
            {
                j--;    
            }
            if(i<j) 
                {
                swap(arr,i,j);
            }
        }
    swap(arr,j,pivot);
    sort(arr,start,j-1); 
    sort(arr,j+1,end);
    }
        }
        
    }
    /**
     * This method is used to swap value.
     * @param arr array of value
     * @param i index 
     * @param j index 
     * i and j are to be swapped with each other.
     */
    void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[])  
    {
    
    int i,start=0;
    QuickSort object= new QuickSort();  
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter size of array");
    int size=scan.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter elements of array");
    for(i=0;i<size;i++)
        {
        arr[i]=scan.nextInt();
        }
    object.sort(arr, start, size-1);
    
    System.out.println("Sorted elements of array");
    for(i=0;i<size;i++)
        {
        System.out.println(arr[i]); 
        
        }
    scan.close();
    }
}
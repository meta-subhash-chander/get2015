package assignment;

import java.util.Arrays;

public class RremoveDuplicateValueFromArray {
	public String RemoveDuplicates(int[] arr) {

	    int end = arr.length;

	    for (int i = 0; i < end; i++) 
	    {
	        for (int j = i + 1; j < end; j++) 
	        {
	            if (arr[i] == arr[j]) 
	            {      
	            	
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++)
	                {
	                    arr[shiftLeft] = arr[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] nonduplicatearray = new int[end];
	    for(int i = 0; i < end; i++)
	    {
	    	nonduplicatearray[i] = arr[i];
	    }
	    return Arrays.toString(nonduplicatearray);
	}
	public static void main(String[] args)
	{
		RremoveDuplicateValueFromArray RDV=new RremoveDuplicateValueFromArray();
		int a[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		String s=RDV.RemoveDuplicates(a);
		 
			System.out.print(s);
		
		
	}

}

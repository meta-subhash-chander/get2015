package assignment;

import java.util.Arrays;

public class JoinSortedArray {
	public  String Join(int[] a,int asize, int[] b,int bsize) {

	    int[] joinarray = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < asize && j < bsize)
	    {
	        if (a[i] < b[j])
	        {
	        	joinarray[k] = a[i];
	            i++;
	        }
	        else
	        {
	        	joinarray[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < asize)
	    {
	    	joinarray[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < bsize)
	    {
	    	joinarray[k] = b[j];
	        j++;
	        k++;
	    }

	    return Arrays.toString(joinarray);
	}
	public static void main(String[] args)
	
	{   int[] a={1,3,4};
	
	    int[] b={2,5,6};
		JoinSortedArray JSA=new JoinSortedArray();
		String s=JSA.Join(a,3,b,3);
		 
		 
			System.out.print(s);
		System.out.println();
		 
	}

}

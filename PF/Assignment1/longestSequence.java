package assignment;

import java.util.Arrays;
 
public class longestSequence 
{

	
	int k=0;

	int count = 1; static int max = 1;int start=0;int last=0;
String longestSequences(int a[])
{
	
	for (int i = 1; i < a.length; i++) 
	{
	    if (a[i] >= a[i - 1]) 
	    {   
	        last=i;
	        count++;
	    } 
	    else {
	        if (count > max)
	        {
	            max = count;
	        }
	        count = 1;
	        start=i;
	    }
	}
	//System.out.println(max);
	//System.out.println(start);
	//System.out.println(last);
	int[] b=new int[max];
	for(int i=start;i<=last;i++)
	{   b[k]=a[i];
	    k++;
		 
		
	}
	System.out.println();
	return Arrays.toString(b);
 }
public static void main(String[] args)
{
	longestSequence LS =new longestSequence();
	int[] a = { 1, 2, 3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
	String s=LS.longestSequences(a);
	     
		System.out.print(s);
		
	
	
}

}

 

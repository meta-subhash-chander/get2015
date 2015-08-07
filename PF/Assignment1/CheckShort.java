package assignment;

public class 		CheckShort {


	int[] a = {1,5,6,8,9,11};

	int count = 1;int start=0;int last=0;
int abc(){
	
	for (int i = 1; i < a.length; i++) 
	{
	    if (a[i] >= a[i - 1]) 
	    {   
	        start=i;
	        
	    } 
	    else if (a[i] <= a[i - 1]) 
	    {   
	        last=i;
	    } 
	    else
	    {
	    count++;
	    }
	}
	if(last==0)
	{
	System.out.println("assending");
	return 1;
	}
	else if(start==0)
	{
	System.out.println("desending");
	return 2;
	}
	else
	{
	System.out.println("Not sorted");
	return 0;
	
	}
 }
public static void main(String[] args)
{
	CheckShort CS =new CheckShort();
	int a=CS.abc();
	System.out.print(a);
}

}

 



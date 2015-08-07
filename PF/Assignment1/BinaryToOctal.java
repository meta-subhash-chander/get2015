package assignment;

public class BinaryToOctal 
{   int octalrev=0;
    int octal=0;
	int binarynumber;
	int decimal;
	int a=1;
	int b=0;
	 
	void getvalue(int c)
	{
	   
	  binarynumber=c;
	}
	int convert()
	{
		while(binarynumber > 0)
		{
			
			int count=binarynumber%10;
			decimal=decimal+count*a;
			binarynumber=binarynumber/10;
			
			a=a*2;
		}
		while(decimal > 0)
		{
			b = decimal % 8;
			octalrev=octalrev*10+b;
			decimal=decimal/8;
		}
		while(octalrev > 0)
		{
			b = octalrev % 10;
			octal=octal*10+b;
			octalrev=octalrev/10;
		}
		
		
		//System.out.println(octal);
		return octal;
	}


 
public static void main(String[] args)
{
 BinaryToOctal B2O =new BinaryToOctal();
 B2O.getvalue(110101);
 int d=B2O.convert();
 System.out.print(d);
 
}
}
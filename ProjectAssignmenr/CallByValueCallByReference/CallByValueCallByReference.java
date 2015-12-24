 
package CallByValueCallByReference;
class MyInteger {
	int number;
}

public class CallByValueCallByReference {
	
	public static void byValue ( int a ) {
	      System.out.println ( "Value of a before byValue is "+a);
	      a= a+1;
	      System.out.println ( "Value of a after byValue is "+a);
	   }
	
	  public static void byReference(MyInteger b) {
	      System.out.println("Value of b before incrementing b is "+b.number);
	      b.number = b.number+1;
	      System.out.println("Value of b after incrementing b is "+b.number);
	   }
	
	  
	  public static void main ( String[] args ) {
		      int x =50;
		      System.out.println ( "Value of x before calling byValue() is "+x);
		      byValue(x);
		      System.out.println ( "Value of x after calling byValue() is "+x);
		      
		      System.out.println("-----------------------------------");
		      
		      MyInteger y = new MyInteger();
		      y.number=50;
		      
		      
		      System.out.println ( "Value of y before calling byReference() is "+y.number);
		      byReference(y);
		      System.out.println ( "Value of y after calling byReference() is "+y.number);
		   }
	  
	 	   
}

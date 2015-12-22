package Throws_example;

import java.io.IOException;  
class Testthrows{  
  void methed()throws IOException{  
    throw new IOException("device error"); 
  }  
  void methed1()throws IOException{  
	  methed();  
  }  
  void methed2(){  
   try{  
	   methed1();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows obj=new Testthrows();  
   obj.methed2();  
   System.out.println("normal flow...");  
  }  
}  

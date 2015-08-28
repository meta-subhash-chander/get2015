import java.util.Scanner;


public class MirrorTree extends BinaryTree {
	
	 
	 static public void inputOfBinaryTree(BinaryTree ob){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("How many data you wants to enter");
		 int number= scan.nextInt();
		 int array[]=new int[number];
		 
		 for(int i=0;i<number;i++){
			 System.out.println("Enter "+(i+1)+" element");
			 array[i]=scan.nextInt();
		 }
		 for(int i=0;i<array.length;i++){
			 if(i==0){
				 ob.addNode(0, array[i]);
			 }
			 else{
				 ob.addNode(array[(i-1)/2], array[i]);
			 }
			 
		 }
		
		
	 }

	 
	 
	 
	 public static void main(String a[]){
		 
		 
		 BinaryTree ob=new BinaryTree();
		 inputOfBinaryTree(ob);
		 String out=ob.preOrder(ob.rootNode);
		 System.out.println(out);
		 BinaryTree ob1=new BinaryTree();
		 inputOfBinaryTree(ob1);
		 String out1= ob1.mirrorOrder(ob1.rootNode);
		 if(out.equals(out1))
		 {
			 System.out.println("Both are mirror");
		 }
		 else{
			 System.out.println("Not mirror");
		 }
		
		 
		
		 
	 }


}

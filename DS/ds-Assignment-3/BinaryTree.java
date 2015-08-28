/****************************************************************************************
Name            : BinaryTree 
Revision Log    : 2015-08-28: Subhash chander : created.
                : 
                : 
Use             :class have method implementation of BinaryTree
                :
****************************************************************************************/
public class BinaryTree {
	
	int nodeData;
	BinaryTree leftChild;
	BinaryTree rightChild;
	BinaryTree rootNode=null;
	BinaryTree  result=null;
	
	BinaryTree(){
		nodeData=0;
		rightChild=null;
		leftChild=null;
	}
	/**
	 * addNode method :method to add node in Binary Search tree
	 * 
	 * @param: value into node  
	 *  
	 * */   
	BinaryTree addNode(int data){
		BinaryTree newnode=new BinaryTree();
		newnode.nodeData=data;
		return newnode;	
	}
	
	
	
	BinaryTree findNode(BinaryTree rootNode2,int data){
		
		if(rootNode2.leftChild!=null){
			result=(findNode(rootNode2.leftChild, data));
		}
		if(data==rootNode2.nodeData&&(rootNode2.leftChild==null||rootNode2.rightChild==null)){
			return rootNode2;
		}
		if(rootNode2.rightChild!=null){
				result=(findNode(rootNode2.rightChild, data));
		}
			
		return result;
		
	}
	
	void addNode(int data,int leftData){
		
		BinaryTree leftnode=addNode(leftData);
		if(this.rootNode==null){
			rootNode=leftnode;
			result=null;
		}
		else{
			BinaryTree node=findNode(this.rootNode, data);
			if(node!=null)
			{  
				if(node.leftChild==null){
					node.leftChild=leftnode;
				}
				else{
					node.rightChild=leftnode;
				}
			}
			else{
				System.out.println("Not found");
			}
		}
	}
	
		String output="";
	 String preOrder(BinaryTree first){
		 output+=first.nodeData+" ";
			
		 if(first.leftChild!=null){
			 preOrder(first.leftChild);
		 }
		 if(first.rightChild!=null){
			 preOrder(first.rightChild);
		 }
		 return output;
	
			
	}
	 String inOrder(BinaryTree first){
		 
			
		if(first.leftChild!=null){
			inOrder(first.leftChild);
		}
		output+=first.nodeData+" ";
		
		if(first.rightChild!=null){
			inOrder(first.rightChild);
		}
		return output;
	
			
	}
	 
	 String postOrder(BinaryTree first){
				if(first.leftChild!=null){
					postOrder(first.leftChild);
				}
				if(first.rightChild!=null){
					postOrder(first.rightChild);
				}
				output+=first.nodeData+" ";
				return output;	
	}
	 
	 /**
		 * mirrorOrder method :method is use to check that tree are mirror or not
		 * 
		 * @param: object of class  
		 *  
		 * */   
	 String mirrorOrder(BinaryTree first){
		 
			
		 output+=first.nodeData+" ";
			
		 if(first.rightChild!=null){
			 mirrorOrder(first.rightChild);
		 }
		 if(first.leftChild!=null){
			 mirrorOrder(first.leftChild);
		 }
		 return output;	
		
	}
	
	
}

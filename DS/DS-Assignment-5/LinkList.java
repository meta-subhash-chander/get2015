 /****************************************************************************************
Name            :  LinkList 
Revision Log    : 2015-09-01: Subhash Chander : created.
                : 
                : 
Use             : This class is used to perform all opertion of Sorted Link list
                :
 ****************************************************************************************/ 

import java.util.LinkedList;

public class LinkList { 
		public static LinkedList <Integer>  list = new LinkedList<Integer>();   
		/**
		 * checkIndexToInsertElemen method : Method checkIndexToInsertElemen is used to add
		 *  element at sorted position
		 * @param: index : location of element to insert
		 * @param: element : element to insert
		 * */
		public static void checkIndexToInsertElement(int index, int element)
		{
			if(index==list.size())
			{
				list.add(element);
			}
			else if(((int)list.get(index) < element)&&((index+1)<=list.size())) {
				checkIndexToInsertElement(index+1, element);
			}	
			else {
				list.add(index, element);
			}	
		} 
		/**
		 * sizeOfLinkList method : Method is used to find size of link list
		 * 
		 * @param: size : size of link list
		 * */
		public int sizeOfLinkList(){
			return list.size();
		}
	
}

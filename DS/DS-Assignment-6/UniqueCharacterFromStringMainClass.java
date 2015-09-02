

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterFromStringMainClass {
	
	
	
	public static void main(String args[]){
		Set<Character> uniqueCharacter;
		Scanner scan=new Scanner(System.in);
		UniqueCharacterFromString uniqueCharacterFromStringObject=new UniqueCharacterFromString();
		System.out.println("Find Unique Characters in Any String");
		while(true){
			
		System.out.println("\nPress 1 to Enter String to find its Unique Character");	
		System.out.println("Press 2 to Exit");
		String choice=scan.next();
		
		switch (choice) {
 
		case "1" : 	
		System.out.println("\nEntern any String ");
		String string =scan.nextLine();
		string =scan.nextLine();
		
		uniqueCharacter=uniqueCharacterFromStringObject.findUniqueCharacter(string);
		 	
			System.out.println("\nNumber of Unique characters in \" "+string+" \" = "+uniqueCharacter.size());
		
			System.out.println("\nUnique characters in \" "+string+" \" are--\n");
			
		 for(Object e : uniqueCharacter){
			   System.out.println(e);
		   }
				break;
		case "2" :
				return;
		default :
			System.out.println("\nPlease enter correct choice\n");
			
			
		}
		
	}
	
	
	

	}
}

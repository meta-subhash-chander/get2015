

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterFromString {
	
	
		
	HashMap<String,Set<Character>> stringMap=new HashMap<String, Set<Character>>();
	
	public Set<Character> findUniqueCharacter(String string){
	
	
	
	if(stringMap.containsKey(string)){
		
		System.out.println("\nFind Result directly from Cache Memory");
		return stringMap.get(string);	
		
	}
	else{
		
		
		Set<Character> set=new HashSet<Character>(); 
	
		for(int i=0;i<string.length();i++){
			
			
			if(!(string.charAt(i)==32)){
			set.add(string.charAt(i));
			}
			
			
		}
		
		stringMap.put(string,set);
		
	
		System.out.println("\nwas not available in Cache..Now Added");
		
		return set;
	}

}
}

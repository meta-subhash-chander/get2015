 
package socialnetwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author subhash chander
 */
public class Organisation extends Entity implements Record{
    
    long phoneNumber;
    String placementRecord;
    
   // Iterator<String> personFriend;
    public Organisation(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }

    
 
    @Override
    public void setInterest(String interest) {
         
        
    }

    @Override
    public String getInterest() {
     
    	 throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPlacementRecord(String placementRecord) {
    	this.placementRecord=placementRecord;
         }

    @Override
    public String getPlacementRecord() {
        return placementRecord;
    }
    
    public void showFriends(){
    
    if(friends.isEmpty()){
              System.out.println("Sorry !! You Don't have any friend in your Friend \n");
          }
    else{
        System.out.println("\nYour Friend List ---");
        int p=0;
      for(String friendName:friends){
          
          System.out.println(++p+" "+friendName);
          
      }
    }
    }
}

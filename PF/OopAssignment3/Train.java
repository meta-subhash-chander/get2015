/****************************************************************************************
Name            : Train 
Revision Log    : 2015-08-17: Subhash Chander : created.
                : 
                : 
Use             : This class is contain all detail of trains. 
                :
 ****************************************************************************************/

public abstract class Train {
		
		public String tType="";
		public String trainNumber="";
		public String timeDuration="";
		public int fare=0;
		public String fromToStation="";
		public int seats_weight=0; 
} 
class Ptrain extends Train{
	
	 
	public  Ptrain(String tt,String n,String t,int m,String fts,int s){
		this.tType=tt;
		this.trainNumber=n;
		this.timeDuration=t;
		this.fare=m;
		this.fromToStation=fts;
		this.seats_weight=s;
	}
} 
class Gtrain extends Train{
	 	public  Gtrain(String tt,String n,String t,int m,String fts,int w){
		this.tType=tt;
		this.trainNumber=n;
		this.timeDuration=t;
		this.fare=m;
		this.fromToStation=fts;
		this.seats_weight=w;
	}
}
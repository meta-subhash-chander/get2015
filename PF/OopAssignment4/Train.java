/****************************************************************************************
Name            : Train 
Revision Log    : 2015-08-20: Subhash Chander : created.
                : 
                : 
Use             : This class is contain all detail of trains. 
                :
 ****************************************************************************************/

public abstract class Train {
	public Train()
	{
		this.train_type="";
		this.trainNumber="";
		this.timeDuration="";
		this.fare=0;
		this.fromToStation="";
		this.seats_weight=0;
	}
		
		public String train_type;
		public String trainNumber;
		public String timeDuration;
		public double fare;
		public String fromToStation;
		public int seats_weight; 
} 

class PessangerTrain extends Train{
	
	 
	public  PessangerTrain(String tt,String n,String t,double m,String fts,int s){
		this.train_type=tt;
		this.trainNumber=n;
		this.timeDuration=t;
		this.fare=m;
		this.fromToStation=fts;
		this.seats_weight=s;
	}
} 
class GoodsTrain extends Train{
	 	public  GoodsTrain(String tt,String n,String t,double m,String fts,int w){
		this.train_type=tt;
		this.trainNumber=n;
		this.timeDuration=t;
		this.fare=m;
		this.fromToStation=fts;
		this.seats_weight=w;
	}
}
/****************************************************************************************
Name            : HotelBooking 
Revision Log    : 30 August,2015: Subhash chander : created.
                : 
                : 
Use             :class have method Allotment of Rooms in hotel
                :
****************************************************************************************/
public class HotelBooking
{
	/**
	 * Name   : main
	 * @param : args
	 * Description: Main function
	 **/
	public static void main(String args[]) 
	{
		Hotle ObjectOfHottleClass = new Hotle();
		System.out.println("Welcome to  Hottle Booking System"); 
		ObjectOfHottleClass.RoomAllotment();
	}
}

/****************************************************************************************
Name            : Hotle 
Revision Log    : 30 August,2015: Subhash chander : created.
                : 
                : 
Use             :class have method Allotment of Rooms in hotel
                :
****************************************************************************************/

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
public class Hotle
{
	/**
	 * RoomAllotment method :Thrugh hashing rooms are alloted on basis of
	 * age
	 * */   

	public   void RoomAllotment() {
		try {
			Scanner scan = new Scanner(System.in);
			String nameOfGuest;
			int ageOfGuest, i, count = 1;
			;
			int roomNumber;
			boolean flag = true;
			int hashCode;
			Enumeration<Integer> roomNumbers;
			int numberOfRooms;
			int choice;
			Hashtable<Integer, String> rooms = new Hashtable<Integer, String>();
			do {
				System.out.println("Enter Number of rooms:");
				while (!scan.hasNextInt()) {
					System.out.println("Please Enter Integer Number");
					scan.next();
				}
				numberOfRooms = scan.nextInt();
			} while (numberOfRooms <= 0);
			for (i = 0; i < numberOfRooms; i++) {
				rooms.put(i, "");
			}
			// Menu
			do {
				flag = true;
				System.out.println("1. Show  Booked Status of rooms");
				System.out.println("2. Allot room to a guest based on age");
				System.out.println("3. Exit");
				System.out.println("Enter your choice: ");
				do {
					System.out
							.println("(Please Enter Positive integer Number)");
					while (!scan.hasNextInt()) {
						System.out.println("Please Enter Integer Number");
						scan.next();
					}
					choice = scan.nextInt();
				} while (choice <= 0 || choice >= 4);

				switch (choice) {
				case 1:
					System.out.println("Status of  Alloted rooms is: ");
					roomNumbers = rooms.keys();
					while (roomNumbers.hasMoreElements()) {
						roomNumber = roomNumbers.nextElement();
						System.out.println("Room " + (roomNumber) + " : "
								+ rooms.get(roomNumber));
					}
					break;
				case 2:
					System.out.println("Enter name of guest: ");
					nameOfGuest = scan.next();
					System.out.println("Enter age of the guest: ");
					do {
						System.out
								.println("(Please Enter age, greater than 18 and less then 120)");
						while (!scan.hasNextInt()) {
							System.out.println("Please Enter Integer Number");
							scan.next();
						}
						ageOfGuest = scan.nextInt();
					} while (ageOfGuest <= 18 || ageOfGuest >= 120);
					hashCode = ageOfGuest % numberOfRooms;
					for (i = hashCode; i <= (numberOfRooms - 1);) {
						if (rooms.get(i).equals("")) {
							rooms.put(i, nameOfGuest);
							System.out.println("Room number " + i
									+ " is alloted to " + nameOfGuest);
							flag = false;
							break;
						} else {
							i += 1;
						}
					}
					i = 0;
					while (flag) {
						for (int j = i; j <= (numberOfRooms - 1); j++) {
							if (rooms.get(j).equals("")) {
								rooms.put(j, nameOfGuest);
								System.out.println("Room number " + j
										+ " is alloted to " + nameOfGuest);
								flag = false;
								break;
							} else {
								j += 1;
							}
						}
						i++;
					}
					count++;
					break;
				case 3:
					System.out.println("System will Exit");
					System.exit(0);
					break;

				default:
					System.out.println("Enter correct Choice");
				}
			} while (count <= numberOfRooms);
			System.out.println("All Rooms are full now");
			System.out.println("Status of rooms is: ");
			roomNumbers = rooms.keys();
			while (roomNumbers.hasMoreElements()) {
				roomNumber = roomNumbers.nextElement();
				System.out.println("Room " + (roomNumber + 1) + " : "
						+ rooms.get(roomNumber));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

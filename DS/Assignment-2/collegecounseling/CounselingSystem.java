/****************************************************************************************
Name            : CounselingSystem
Revision Log    : 2015-08-27: Subhash chander : created.
                : 
                : 
Use             : class implementing the Counseling System of Colleges
                :
 ****************************************************************************************/
package collegecounseling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CounselingSystem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numberOfCollegeForCounseling = 0;

		System.out
				.println("Enter the number of colleges participating in Counseling");

		numberOfCollegeForCounseling = sc.nextInt();

		// hashmap having college name as key and number of seats as Value
		HashMap<String, Integer> collegeListThatAvilable = new HashMap<String, Integer>();

		for (int count = 0; count < numberOfCollegeForCounseling; count++) {

			System.out.println("Enter " + (count + 1) + " college name ");

			String collegeName = sc.next();

			System.out.println("Enter number of seats Available in "
					+ collegeName);

			int numberOfSeats = sc.nextInt();

			collegeListThatAvilable.put(collegeName.toUpperCase(), numberOfSeats);

		}
		System.out
				.println("\nColleges which are Participating in Counseling\n");

		for (Map.Entry<String, Integer> entry : collegeListThatAvilable.entrySet()) {

			System.out.println(entry.getKey());

		}
		System.out.println("Enter the number of students ");
		int numberOfStudent = sc.nextInt();

		Queue studentQueue = new Queue(numberOfStudent);
		System.out.println("\nPlease Enter Students name Rank Wise\n");
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println("Enter " + (i + 1) + " Student Name --");

			String studentName = sc.next();
			System.out.println("\nHello " + studentName + "\n");
			System.out.println("Enter your choice of college");

			String choiceOfCollege = sc.next();

			if (collegeListThatAvilable.containsKey(choiceOfCollege.toUpperCase())) {
				Student student = new Student(studentName,
						choiceOfCollege.toUpperCase());
				// inserting the student object in queue
				studentQueue.enQueue(student);

			} else {
				System.out.println("\nYou entered Incorrect College name\n");
				System.out
						.println("\nOnly These Colleges are Participating in Counseling\n");

				for (Map.Entry<String, Integer> entry : collegeListThatAvilable.entrySet()) {

					System.out.println(entry.getKey());

				}
				System.out.println("Please Enter college name Again\n");
				choiceOfCollege = sc.next();
				Student student = new Student(studentName,
						choiceOfCollege.toUpperCase());
				// inserting the student object in queue
				studentQueue.enQueue(student);
			}

		}

		System.out.println("Allocation List of students in college\n");
		for (int i = 0; i < numberOfStudent; i++) {

			// dequeue the student object
			Student student = (Student) studentQueue.deQueue();
			int availableSeat = collegeListThatAvilable.get(student.student_Choice
					.toUpperCase());

			if (availableSeat != 0) {

				student.allocatedCollege = student.student_Choice;
				collegeListThatAvilable.replace(student.student_Choice.toUpperCase(),
						availableSeat, availableSeat - 1);

			}

			System.out.println(student.student_Name + " ------> "
					+ student.allocatedCollege.toUpperCase());

		}

	}

}

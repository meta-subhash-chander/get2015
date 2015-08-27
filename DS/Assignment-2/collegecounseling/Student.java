/****************************************************************************************
Name            : Student
Revision Log    : 2015-08-27: Subhash chander : created.
                : 
                : 
Use             : Class having attributes of Student
                :
 ****************************************************************************************/
package collegecounseling;
 
public class Student {
	
	String student_Name;
	
	String student_Choice;
	 
	String allocatedCollege="Not allocated";
	
	 
	public Student(){
		
	}
	 
	public Student(String studentName, String studentChoice) {
		
		this.student_Name = studentName;
		this.student_Choice = studentChoice;
	}
	
	
}

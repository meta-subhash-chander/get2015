package Inheritance;
import java.util.Arrays;
import java.util.Scanner;

/****************************************************************************************
Name            : Student
Revision Log    : 2015-08-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to make Student class that inherit Person class. 
                :
****************************************************************************************/
public class Student extends Person{
		private int stuid;
		private String[] courses;

		public Student(int uid, String name,int studentid) {
			super(uid, name);
			this.stuid=studentid;
		}
		public int getStudentId(){
			return stuid;
		}
		public void setStudentId(int id){
			this.stuid=id;
		}
		public String[] getCourses(){
			return courses;
		}
		public void setCourses(String courses[]){
			this.courses=courses;
		}
		public String toString(){
			return super.toString()+"Student Id : "+stuid;
		}
		public static void main(String[] arg) {
			int id;
			String name;
			int uid;
			int numofcourses;
			String course[];
			System.out.println("Please Enter Following Details One By One \nUid:\nName\nStudentid\n");
			Scanner scan=new Scanner(System.in);
			try{
				uid=scan.nextInt();
				name=scan.next();
				id=scan.nextInt();
				System.out.print("Enter No Of courses\n");
				numofcourses=scan.nextInt();
				course=new String[numofcourses];
				System.out.println("Enter All Courses :");
				for(int i=0;i<numofcourses;i++){
					course[i]=scan.next();
				}
			
				Student object=new Student(uid, name, id);
				object.setCourses(course);
				
				System.out.println("Student Details:");
				System.out.println(object.toString());
				System.out.print("Courses: ");
				System.out.print(Arrays.toString(object.getCourses()));
			
			}
		 
			catch(Exception e){
				e.printStackTrace();
			}
		 
			scan.close();
			
		}
	 
}
 
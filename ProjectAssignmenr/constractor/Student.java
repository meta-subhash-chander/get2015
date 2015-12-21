package constractor;
class Student{  
    int id;  
    String name;  
    Student(int id,String name){  
    this.id = id;  
    this.name = name;  
    
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student s1 = new Student(111,"subhash");  
    Student s2 = new Student(222,"sonu");  
    s1.display();  
    s2.display();  
   }  
}  
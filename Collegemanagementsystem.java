package Test;

class College{
	String dept;
	int cls;
	String management;
	void display() {
		System.out.println("Department: Machine Learning");
		System.out.println("cls : 50");
		System.out.println("management : all departments");
	}
}
class Teacher extends College{
	String tname;
	String tdept;
	String status; 
	super.display();
	void display() {
		System.out.println("Faculty : Hema");
		System.out.println("Faculty Department : ML");
		System.out.println("status : Guiding for Placements");
	}
}
class Student extends College{
	String sname="Karthi";
	String sdept="MCA";
	int rollno=112;
	void display() {
		System.out.println("Student Name : "+sname);
		System.out.println("Student dept : "+sdept);
		System.out.println("Student RollNo : "+rollno);
	}
}
public class Collegemanagementsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The College Management Details");
		
		Teacher t=new Teacher();
		t.display();
		
		Student s=new Student();
		s.display();
		
	}

}

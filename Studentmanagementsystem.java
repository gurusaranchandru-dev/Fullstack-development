package Test;

class Management{
	String name;
	String dept;
	int age;
	Management(String name,String dept, int age){
		System.out.println("The Student Details");
		System.out.println("Name : "+name);
		System.out.println("Dept : "+dept);
		System.out.println("Age : "+age);
	}
}
public class Studentmanagementsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Management m=new Management("Sam", "AI", 23);
		//Management("Sam","Ai",23);
	}

}

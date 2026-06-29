package Test;

class Emp{
	String name;
	int salary;
	int age;
	Emp(){
		System.out.println("The Employee Payroll Management System");
		this.name = "Sangeetha";
		this.salary = 200000;
		this.age = 23;
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Age : "+age);
	}
}
public class Employeepayrollsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e=new Emp();
		
		//System.out.println("Name : "+name);
		//System.out.println("Salary : "+salary);
		//System.out.println("Age : "+age);
	}

}

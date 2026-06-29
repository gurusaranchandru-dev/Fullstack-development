package demo;

class Sample{
	String name;
	int age;
	
	Sample(Sample s){
		this.name=s.name;
		this.age=s.age;
		System.out.println("This is default constructor");
	}
	
	Sample(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name : "+name+"\n" +"Age : "+age);
	}
}
public class Copyconstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample obj=new Sample("Sangeetha",23);
		Sample obj1=new Sample(obj);
		obj1.display();

	}

}

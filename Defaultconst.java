package demo;

class Bookdetails{
	String name;
	String author;
	int copies;
	Bookdetails(){
		name="Sam";
		author="Tales of Aurora";
		copies = 20;
	}
	void display() {
		System.out.println("Name : "+name+"\n"+"Author : "+author+ "\n"+"copies : "+copies);	
	}
}
public class Defaultconst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bookdetails b1=new Bookdetails();
		b1.display();
	}
}


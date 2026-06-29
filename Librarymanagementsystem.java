package Test;

class Library{
	String lname="XLS";
	String lplace="Qrts";
	int lid= 0012;
	void display() {
		System.out.println("Library Name : "+lname);
		System.out.println("Library place : "+lplace);
		System.out.println("Library Id : "+lid);
	}
}
class Books extends Library{
	String bname="Thenali Raman";
	String bcate="Tamil History";
	int bid = 0034;
	void display() {
		super.display();
		System.out.println();
		System.out.println("Book Name : " +bname);
		System.out.println("Book category : "+bcate);
		System.out.println("Book Id : "+bid);
	}
}

public class Librarymanagementsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books b=new Books();
		System.out.println("The Book Deatils");
		b.display();
	
	}

}

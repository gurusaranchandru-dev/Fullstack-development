package Full_Stack_ch3;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person : ");
		int x=sc.nextInt();
		if(x<18) {
			System.out.println("The Person is minor");
		}
		else if(x>18) {
			System.out.println("The Person is an adult");
		}
	}
}


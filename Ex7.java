package Full_Stack_ch3;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter you age : ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.print("You are eligible to vote");
		}
		else {
			System.out.print("You are not eligible to vote");
		}
		
	}

}

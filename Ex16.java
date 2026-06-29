package Full_Stack_ch3;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter you age : ");
		int age=sc.nextInt();
		System.out.print("Enter the voter Id : ");
		boolean voteid=sc.nextBoolean();
		if(age>18) {
			if(voteid) {
				System.out.print("You are eligible");
			}
			else {
				System.out.print("You have no voter Id");
			}
		}
		else {
			System.out.print("Not eligible to vote");
		}
		sc.close();
	}

}

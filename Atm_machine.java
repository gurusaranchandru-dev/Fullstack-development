package Full_Stack_ch3;
import java.util.Scanner;

public class Atm_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int balance=10000;
		System.out.print("ATM MACHINE");
		System.out.println("The options for the user:");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("2.Balance");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You chose Withdraw");
			System.out.println("Enter the number to withdraw : ");
			int x=sc.nextInt();
			System.out.println("You successfully withdraw the Amount of "+x);
			break;
		case 2:
			System.out.println("You chose Deposit");
			System.out.println("Enter the number to Deposit : ");
			int y=sc.nextInt();
			System.out.println("You successfully Deposit the Amount of "+y);
			break;
		case 3:
			System.out.println("You chose Balance checking");
			
		default:
			System.out.println("Enter a valid choice");
		}
		sc.close();
	}

}

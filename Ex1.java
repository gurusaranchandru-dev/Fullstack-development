package Full_Stack_ch3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println("The number "+n+" is positive");
		}
		else if(n<0) {
			System.out.println("The number "+n+" is negative");
		}
		else {
			System.out.println("The number is Zero");
		}
	}

}

package chapter2;
import java.util.*;

public class PosAndNeg {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the num:");
		int num= sc.nextInt();
		if(num>0)
			System.out.println("The number is positive");
		else if(num<0)
			System.out.println("The number is negative");
		else
			System.out.println("The number is zero");
	}

}


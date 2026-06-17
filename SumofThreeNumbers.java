package chapter2;
import java.util.*;
public class SumofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first num:");
		int n1= sc.nextInt();
		System.out.println("Enter the sec num: ");
		int n2= sc.nextInt();
		System.out.println("Enter the third num:");
		int n3= sc.nextInt();
		int sum= n1+n2+n3;
		System.out.println("The sum:"+sum);
		
	}

}

package Test;
import java.util.Scanner;
public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
			while(n>0) {
				rev=rev*10 + n%10;
				n/=10;
			}
			if(temp==rev) {
				System.out.println("It is Palindrome!!");
			}
			else {
				System.out.println("It is not a Palindrome!!");
			}
			sc.close();
	}

}

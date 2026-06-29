package Test;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int num1=0,num2=1;
		System.out.print("The series is  : ");
		for(int i=1;i<=n;i++) {
			System.out.print(num1 + " ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}
}

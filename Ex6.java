package Full_Stack_ch3;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int x=sc.nextInt();
		if(x%2!=0) {
			System.out.println("The Number is Odd");
		}
		else {
			System.out.println("The Number is Even");
		}
	}

}

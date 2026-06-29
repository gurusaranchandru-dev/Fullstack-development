package Full_Stack_ch3;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		int x=sc.nextInt();
		if(x>35) {System.out.println("The temperature is above normal");
	}
		else {
			System.out.println("The temperature is normal");
		}
}
}

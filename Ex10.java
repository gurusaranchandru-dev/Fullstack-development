package Full_Stack_ch3;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String Orgpwd="admin123_@";
		System.out.print("Enter the password : ");
		String password=sc.nextLine();
		if(password.equals(Orgpwd)) {
			System.out.print("The Password is correct");
		}
		else {
			System.out.print("The password is Wrong");
		}
		
	}

}

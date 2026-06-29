package Full_Stack_ch3;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			String username="admin";
	        String password="admin1234";
	        System.out.print("Enter username: ");
	        String user=sc.nextLine();
	        System.out.print("Enter password: ");
	        String pass=sc.nextLine();
	        if(user.equals(username)) {
	            if(pass.equals(password)) {
	                System.out.println("Login Successful");
	            }
	            else {
	                System.out.println("Wrong Password");
	            }
	        }
	        else {
	            System.out.println("Wrong Username");
	        }
	}

}

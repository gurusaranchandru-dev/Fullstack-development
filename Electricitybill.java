package Full_Stack_ch3;
import java.util.Scanner;
public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter bill type (D/C/I): ");
	        char type=sc.next().charAt(0);
	        switch(type) {
	            case 'D':
	                System.out.println("Domestic Bill");
	                break;
	            case 'C':
	                System.out.println("Commercial Bill");
	                break;
	            case 'I':
	                System.out.println("Industrial Bill");
	                break;
	            default:
	                System.out.println("Invalid Type");
	        }
	        sc.close();
	}
}

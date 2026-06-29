package Full_Stack_ch3;
import java.util.Scanner;
public class Dayofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter day number: ");
	        int day=sc.nextInt();
	        switch(day) {
	            case 1:
	                System.out.println("Sunday");
	                break;
	            case 2:
	                System.out.println("Monday");
	                break;
	            case 3:
	                System.out.println("Tuesday");
	                break;
	            case 4:
	                System.out.println("Wednesday");
	                break;
	            case 5:
	                System.out.println("Thursday");
	                break;
	            case 6:
	                System.out.println("Friday");
	                break;
	            case 7:
	                System.out.println("Saturday");
	                break;
	            default:
	                System.out.println("Invalid Day");
	        }

	        sc.close();
	}

}

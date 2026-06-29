package Full_Stack_ch3;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
         System.out.print("Enter first number: ");
		 int a=sc.nextInt();
	     System.out.print("Enter second number: ");
	     int b=sc.nextInt();
	     System.out.print("Enter third number: ");
	     int c=sc.nextInt();
	     if(a>b) {
	    	 if(a>c) {
	    		 System.out.println("A is Largest");
	            }
	         else {
	             System.out.println("C is Largest");
	            }	        }
	     else {
	         if(b>c) {
	             System.out.println("B is Largest");
	            }
	         else {
	             System.out.println("C is Largest");
	            }
	        }
	     sc.close();
	}

}

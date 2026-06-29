package Full_Stack_ch3;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
	        if(num>0) {
	            if(num%2==0) {
	                System.out.println("Positive Even Number");
	            }
	            else {
	                System.out.println("Positive Odd Number");
	            }
	        }
	        else {
	            System.out.println("Number is not Positive");
	        }
	    }
	sc.close();
	}

}

package Full_Stack_ch3;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num=sc.nextInt();
	        if(num>0){
	            System.out.println("Number is Positive");
	        }
	        else if(num<0){
	            System.out.println("Number is Negative");
	        }
	        else{
	            System.out.println("Number is Zero");
	        }
	}

}

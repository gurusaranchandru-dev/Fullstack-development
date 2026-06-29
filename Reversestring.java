package Test;
import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str=sc.nextLine();
	        String rev="";
	        for (int i=str.length()-1;i>=0;i--) {
	            rev=rev+str.charAt(i);
	        }
	        System.out.println("Reversed String: " + rev);
	}

}

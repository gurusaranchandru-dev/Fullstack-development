package Full_Stack_ch3;
import java.util.Scanner;
public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str=sc.nextLine();
	        StringBuilder sb=new StringBuilder(str);
	        System.out.println("Reversed String: "+sb.reverse());
	        sc.close();
	}
}

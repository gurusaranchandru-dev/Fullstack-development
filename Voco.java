package Full_Stack_ch3;
import java.util.Scanner;
public class Voco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch=sc.next().charAt(0);
	        switch(ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println("Vowel");
	                break;
	            default:
	                System.out.println("Consonant");
	        }
	        sc.close();
	}
}

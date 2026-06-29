package Full_Stack_ch3;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 int sub1=sc.nextInt();
	        int sub2=sc.nextInt();
	        if(sub1>=35) {
	            if(sub2>=35) {
	                System.out.println("Pass");
	            }
	            else {
	                System.out.println("Fail in Subject 2");
	            }
	        }
	        else {
	            System.out.println("Fail in Subject 1");
	        }
	}

}

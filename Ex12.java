package Full_Stack_ch3;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        if(a>b&&a>c){
	            System.out.println("A is largest");
	        }
	        else if(b>c){
	            System.out.println("B is largest");
	        }
	        else{
	            System.out.println("C is largest");
	        }
	}

}

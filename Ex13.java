package Full_Stack_ch3;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Scanner sc=new Scanner(System.in);
	        int temp=sc.nextInt();
	        if(temp>40){
	            System.out.println("High Temperature");
	        }
	        else if(temp>30){
	            System.out.println("Normal Temperature");
	        }
	        else{
	            System.out.println("Low Temperature");
	        }
	}

}

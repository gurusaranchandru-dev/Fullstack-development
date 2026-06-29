package Full_Stack_ch3;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks");
		System.out.print("Subject1 : ");
		int sub1=sc.nextInt();
		System.out.print("Subject2 : ");
		int sub2=sc.nextInt();
		System.out.print("Subject3 : ");
		int sub3=sc.nextInt();
		int avg=(sub1+sub2+sub3)/3;
		if(avg > 40) {
			System.out.println("Passed");
		}
		else{
			System.out.println("Not Passed");
		}
	}

}

package Full_Stack_ch3;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the traffic color : ");
		String color=sc.nextLine();
		if(color.equals("Red")) {
			System.out.print("Stop");
		}
		else if(color.equals("Green")) {
			System.out.print("Ready");
		}
		else {
			System.out.print("Go");
		}
		sc.close();
	}

}

package Full_Stack_ch3;
import java.util.Scanner;
public class Simple_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter the Number2 : ");
		int num2=sc.nextInt();
		System.out.print("Choose operator ( +,-,*,/) : ");
		int op=sc.next().charAt(0);
		switch(op) {
			case '+':
				System.out.print("Addition : "+(num1+num2));
				break;
			case '-':
				System.out.print("Subtraction : "+(num1-num2));
				break;
			case '*':
				System.out.print("Multiplication : "+(num1*num2));
				break;
			case '/':
				System.out.print("Division : "+(num1/num2));
				break;
			default:
				System.out.print("Invalid Operator");
		}
		sc.close();
	}

}

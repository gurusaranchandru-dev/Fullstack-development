package Full_Stack_ch3;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("First number is greater");
        }
        else if(num2>num1){
            System.out.println("Second number is greater");
        }
        else{
            System.out.println("Both numbers are equal");
        }
	}

}

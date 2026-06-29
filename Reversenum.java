package Test;
import java.util.Scanner;
public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0) {
        	int digit=num%10;
        	rev=rev*10+digit;
        	num/=10;
        }
        System.out.println("The reversed Number is : "+rev);
	}

}

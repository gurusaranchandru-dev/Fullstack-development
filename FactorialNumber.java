package chapter3;
import java.util.Scanner;

public class FactorialNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int i = 1;
	        long fact = 1;

	        do {
	            fact = fact * i;
	            i++;
	        } while (i <= num);

	        System.out.println("Factorial = " + fact);
	    }

}

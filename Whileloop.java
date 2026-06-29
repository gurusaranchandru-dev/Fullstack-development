package Pattern;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        // 1. Print even numbers from 2 to 20
        System.out.println("1. Even Numbers from 2 to 20:");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\n");

        // Input Number
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // 2. Sum of first n natural numbers
        int sum = 0, j = 1;
        while (j <= n) {
            sum += j;
            j++;
        }
        System.out.println("2. Sum of first " + n + " natural numbers = " + sum);

        // 3. Multiplication table of a number
        System.out.println("\n3. Multiplication Table of " + n + ":");
        int k = 1;
        while (k <= 10) {
            System.out.println(n + " x " + k + " = " + (n * k));
            k++;
        }

        // 4. Factorial of a number
        long fact = 1;
        int l = 1;
        while (l <= n) {
            fact *= l;
            l++;
        }
        System.out.println("\n4. Factorial of " + n + " = " + fact);

        // 5. Print digits of a number
        System.out.println("\n5. Digits of the number:");
        int temp = n;
        while (temp > 0) {
            System.out.println(temp % 10);
            temp /= 10;
        }

        // 6. Reverse a number
        temp = n;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("\n6. Reverse of " + n + " = " + reverse);

        // 7. Count digits in a number
        temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("\n7. Number of digits = " + count);

        // 8. Fibonacci series (first n terms)
        System.out.println("\n8. Fibonacci Series:");
        int a = 0, b = 1, m = 1;
        while (m <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            m++;
        }

        // 9. Sum of digits of a number
        temp = n;
        int digitSum = 0;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        System.out.println("\n\n9. Sum of digits = " + digitSum);

        sc.close();
	}

}

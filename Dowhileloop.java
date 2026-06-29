package Pattern;
import java.util.Scanner;
public class Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 1 to 10
        System.out.println("1. Numbers from 1 to 10:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        // Input Number
        System.out.print("\n\nEnter a number: ");
        int n = sc.nextInt();

        // 2. Multiplication Table
        System.out.println("\n2. Multiplication Table of " + n + ":");
        int j = 1;
        do {
            System.out.println(n + " x " + j + " = " + (n * j));
            j++;
        } while (j <= 10);

        // 3. Factorial
        long fact = 1;
        int k = 1;
        do {
            fact *= k;
            k++;
        } while (k <= n);

        System.out.println("\n3. Factorial of " + n + " = " + fact);

        // 4. Reverse a Number
        int temp = n;
        int reverse = 0;

        do {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        } while (temp > 0);

        System.out.println("\n4. Reverse of " + n + " = " + reverse);

        // 5. Fibonacci Series
        System.out.println("\n5. First " + n + " Terms of Fibonacci Series:");

        int a = 0, b = 1, count = 1;

        do {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        } while (count <= n);

        // 6. Armstrong Number Check
        temp = n;
        int armstrongSum = 0;

        do {
            int digit = temp % 10;
            armstrongSum += digit * digit * digit;
            temp /= 10;
        } while (temp > 0);

        if (armstrongSum == n)
            System.out.println("\n\n6. " + n + " is an Armstrong Number");
        else
            System.out.println("\n\n6. " + n + " is NOT an Armstrong Number");

        // 7. Palindrome Number Check
        temp = n;
        reverse = 0;

        do {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        } while (temp > 0);

        if (reverse == n)
            System.out.println("7. " + n + " is a Palindrome Number");
        else
            System.out.println("7. " + n + " is NOT a Palindrome Number");

        sc.close();
	}

}

package Pattern;
import java.util.Scanner;
public class Enhancedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer Array
        int[] numbers = {10, 20, 30, 40, 50, -5, 15, 20};

        // String Array
        String[] names = {"Java", "Python", "C++", "HTML"};

        // Double Array
        double[] marks = {85.5, 90.0, 78.5, 88.0};

        // Character Array
        char[] letters = {'J', 'A', 'V', 'A'};

        // 1. Print all elements of an integer array
        System.out.println("1. Integer Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 2. Sum of elements in integer array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\n\n2. Sum = " + sum);

        // 3. Largest element in integer array
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("\n3. Largest Element = " + largest);

        // 4. Count even numbers
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("\n4. Even Numbers Count = " + evenCount);

        // 5. Print all elements of string array
        System.out.println("\n5. String Array Elements:");
        for (String name : names) {
            System.out.print(name + " ");
        }

        // 6. Concatenate all strings
        String result = "";
        for (String name : names) {
            result += name + " ";
        }
        System.out.println("\n\n6. Concatenated String = " + result);

        // 7. Average of double array
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        System.out.println("\n7. Average = " + average);

        // 8. Print all characters of character array
        System.out.println("\n8. Character Array:");
        for (char ch : letters) {
            System.out.print(ch + " ");
        }

        // 9. Count occurrences of a specific element
        int search = 20;
        int count = 0;
        for (int num : numbers) {
            if (num == search) {
                count++;
            }
        }
        System.out.println("\n\n9. Occurrences of " + search + " = " + count);

        // 10. Print only positive numbers
        System.out.println("\n10. Positive Numbers:");
        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
	}

}

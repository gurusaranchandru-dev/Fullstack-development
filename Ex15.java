package Full_Stack_ch3;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90) {
            System.out.println("Excellent");
        }
        else if(marks>=70) {
            System.out.println("Good");
        }
        else if(marks>=50) {
            System.out.println("Average");
        }
        else {
            System.out.println("Needs Improvement");
        }
	}

}

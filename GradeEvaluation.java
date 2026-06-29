package Full_Stack_ch3;
import java.util.Scanner;
public class GradeEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter grade: ");
        char grade=sc.next().charAt(0);
        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Fail");
        }
        sc.close();
	}

}

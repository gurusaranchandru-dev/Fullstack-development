package Full_Stack_ch3;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("1.Pizza");
        System.out.println("2.Burger");
        System.out.println("3.Sandwich");
        System.out.print("Choose item: ");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Pizza Ordered");
                break;
            case 2:
                System.out.println("Burger Ordered");
                break;
            case 3:
                System.out.println("Sandwich Ordered");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
	}

}

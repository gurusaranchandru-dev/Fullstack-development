package Full_Stack_ch3;
import java.util.Scanner;
public class VehicleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Bus");
        System.out.print("Enter choice: ");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Two Wheeler");
                break;
            case 2:
                System.out.println("Four Wheeler");
                break;
            case 3:
                System.out.println("Heavy Vehicle");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
	}
}

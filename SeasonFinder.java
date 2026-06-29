package Full_Stack_ch3;
import java.util.Scanner;
public class SeasonFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.print("Enter season number: ");
        int season=sc.nextInt();
        switch(season) {
            case 1:
                System.out.println("Summer");
                break;
            case 2:
                System.out.println("Rainy");
                break;
            case 3:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid Season");
        }
        sc.close();
	}
}

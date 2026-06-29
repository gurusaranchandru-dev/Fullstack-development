package Pattern;

public class Hollowinvertedpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
        for (int i = n; i >= 1; i--) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}

}

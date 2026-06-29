package Full_Stack_ch3;

public class Diagonalmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++) {
            for(int j=1;j<=3;j++) {
                if(i==j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
	}
}

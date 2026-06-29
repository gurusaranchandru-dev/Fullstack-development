package Full_Stack_ch3;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
        for(int i=1;i<=20;i++) {
            if(i%2==0) {
                sum=sum+i;
            }
        }
        System.out.println("Sum = "+sum);
	}
}

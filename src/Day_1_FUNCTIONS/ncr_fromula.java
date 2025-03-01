package Day_1_FUNCTIONS;
import java.util.*;
public class ncr_fromula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int nf=factorial(n);
		int rf=factorial(r);
		int nrf=factorial(n-r);
		int t=nf/(rf*nrf);
		if(r>n) {
			System.out.println("Invalid Input");
		}else {
		System.out.println(t);
		}
		sc.close();

	}
	public static int factorial(int n) {
		int sum=1;
		if(n==0 || n==1) {
			return 1;
		}
		for(int i=1;i<=n;i++) {
			sum*=i;
		}
		return sum;
	}

}

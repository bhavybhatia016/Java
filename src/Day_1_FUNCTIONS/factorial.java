package Day_1_FUNCTIONS;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}
	static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			if(n==0 || n==1) {
				ans=1;
			}
			else {
				ans*=i;
			}
			
		}
		return ans;
	}
	

}

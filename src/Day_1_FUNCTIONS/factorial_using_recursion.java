package Day_1_FUNCTIONS;
import java.util.*;
public class factorial_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
		

	}
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n* factorial(n-1);
		
	}

}

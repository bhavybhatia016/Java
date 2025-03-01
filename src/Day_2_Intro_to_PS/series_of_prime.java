package Day_2_Intro_to_PS;
import java.util.*;
public class series_of_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			boolean a=checkprime(i);
			if(a) {
				System.out.print(i+" ");
			}
		}
		

	}
	public static boolean checkprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

}

package Day_2_Intro_to_PS;
import java.util.*;
public class count_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count_fac(n));

	}
	public static int count_fac(int n) {
		int c=0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				c+=2;
			}
			else {
				c++;
			}
		}
		return c;
 	}

}

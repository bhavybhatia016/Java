package Day_2_Intro_to_PS;
import java.util.*;
public class sum_of_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(n*(n+1)/2);
		float num= (float)34.34;
		float cum=(float)34.67;
		System.out.println(Math.floor(num));
		System.out.print(Math.ceil(cum));
	}


}

package Day_2_Intro_to_PS;
import java.util.*;
public class POS_SOP_DIFFERENCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int SOP=0,POS=1,n1=n;
		while(n>0) {
			int rem=n%10;
			SOP+=rem;
			POS*=rem;
			n/=10;
		}
		System.out.println(SOP);
		System.out.println(POS);
		int diff=POS-SOP;
		System.out.println(diff);
		sc.close();
		
		

	}

}

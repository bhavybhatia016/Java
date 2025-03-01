package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		int star=2*n-1;
		int space=0;
		while(row<=n) {
			int i=0;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(" *");
				j++;
			}
			row++;
			System.out.println();
			star-=2;
			space++;
			
		}
		

	}

}
